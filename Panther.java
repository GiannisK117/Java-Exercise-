import java.util.Random;

class BlackPanther {
    String name, area, sex;
    int age;
    double weight;
    boolean mating = false;

    public BlackPanther() {
    }

    public BlackPanther(String area, String sex, double weight) {

        this.area = area;
        this.sex = sex;
        this.weight = weight;

    }

    public BlackPanther(String name, String area, String sex, double weight) {

        this.name = name;
        this.area = area;
        this.sex = sex;
        this.weight = weight;

    }

    public BlackPanther(double weight, String area, String sex) {

        this.area = area;
        this.sex = sex;
        this.weight = weight;

    }

    public BlackPanther(String name, String area, String sex, int age, double weight, boolean mating) {

        this.name = name;
        this.area = area;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.mating = mating;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {

        this.area = area;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public boolean getMating() {

        return mating;
    }

    public void setMating(boolean mating) {
        this.mating = mating;
    }

    public void eatAnimal(int weight) {

        this.weight += weight * 0.1;
    }

    public String breed(BlackPanther bp) {
        String msg = "";
        if (!this.area.equals(bp.area) || this.sex.equals(bp.sex)) {
            msg = "Reproduction not possible between " + name + " and " + bp.getName();
        }

        if (!this.sex.equals(bp.sex) && this.area.equals(bp.area)) {
            msg = "Reproduction of " + name + " and of " + bp.getName() + " has been successful.";
            mating = true;
            bp.setMating(true);
        }

        return msg;
    }

    public String searchFood(int years) {
        Random rnd = new Random();
        this.age = this.age + years;
        String result = "";

        int chance = rnd.nextInt(100);

        if (chance <= 15) {

            eatAnimal(20);
            result = name + " ate a 20kg prey.";

        } else if (chance > 15 && chance <= 40) {

            eatAnimal(10);
            result = name + " ate a 10kg prey.";

        } else if (chance > 40 && chance <= 75) {

            eatAnimal(5);
            result = name + " ate a 5kg prey.";

        } else if (chance > 75 && chance <= 100) {

            eatAnimal(0);
            result = name + " didnt catch a prey.";

        }

        return result;

    }

    public String getData() {

        return "Name: " + name + ", Area: " + area + ", Sex: " + sex + ", Age: " + age + ", Weight: " + weight;

    }
}
