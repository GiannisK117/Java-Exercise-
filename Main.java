public class Main {

    public static void main(String[] args) {

        BlackPanther bp = new BlackPanther("Midnight", "Africa", "female", 55.0);
        BlackPanther bp2 = new BlackPanther("Africa", "male", 55.0);
        BlackPanther bp3 = new BlackPanther(55.0, "N. Asia", "female");

        BlackPanther[] bpAr = { bp, bp2, bp3 };
        BlackPanther temp = new BlackPanther();

        bp2.setName("Shadow");
        bp3.setName("Ngozi");
        bp.setAge(4);
        bp2.setAge(4);
        bp3.setAge(4);
        bp.eatAnimal(7);
        bp2.eatAnimal(5);
        bp3.eatAnimal(13);

        if (bp.getWeight() >= bp2.getWeight() && bp.getWeight() >= bp3.getWeight()) {
            System.out.println("The heaviest panther is: " + bp.getName());
            System.out.println(bp.breed(bp2));
            System.out.println(bp.breed(bp3));

        } else if (bp2.getWeight() >= bp.getWeight() && bp2.getWeight() >= bp3.getWeight()) {

            System.out.println("The heaviest panther is: " + bp2.getName());
            System.out.println(bp2.breed(bp));
            System.out.println(bp2.breed(bp3));

        } else if (bp3.getWeight() >= bp.getWeight() && bp3.getWeight() >= bp2.getWeight()) {

            System.out.println("The heaviest panther is: " + bp3.getName());
            System.out.println(bp3.breed(bp));
            System.out.println(bp3.breed(bp2));
        }

        if (bp.getWeight() <= bp2.getWeight() && bp.getWeight() <= bp3.getWeight()) {

            System.out.println("The lightest panther is: " + bp.getName());
            System.out.println(bp.breed(bp2));
            System.out.println(bp.breed(bp3));

        } else if (bp2.getWeight() <= bp.getWeight() && bp2.getWeight() <= bp3.getWeight()) {

            System.out.println("The lightest panther is: " + bp2.getName());
            System.out.println(bp2.breed(bp));
            System.out.println(bp2.breed(bp3));

        } else if (bp3.getWeight() <= bp.getWeight() && bp3.getWeight() <= bp2.getWeight()) {

            System.out.println("The lightest panther is: " + bp3.getName());
            System.out.println(bp3.breed(bp));
            System.out.println(bp3.breed(bp2));
        }

        System.out.println(bp.searchFood(1));
        System.out.println(bp3.searchFood(1));

        System.out.println(bp.getAge());
        System.out.println(bp2.getAge());
        System.out.println(bp3.getAge());

        if (bp.getAge() <= bp2.getAge() && bp.getAge() <= bp3.getAge()) {

            System.out.println("The youngest panther is " + bp.getName());
            System.out.println(bp.breed(bp2));
            System.out.println(bp.breed(bp3));

        } else if (bp2.getAge() <= bp.getAge() && bp2.getAge() <= bp3.getAge()) {

            System.out.println("The youngest panther is " + bp2.getName());
            System.out.println(bp2.breed(bp));
            System.out.println(bp2.breed(bp3));

        } else if (bp3.getAge() <= bp.getAge() && bp3.getAge() <= bp2.getAge()) {

            System.out.println("The youngest panther is " + bp3.getName());
            System.out.println(bp3.breed(bp));
            System.out.println(bp3.breed(bp2));
        }

        if (bp.getMating() == false) {
            System.out.println(bp.getName() + " hasnt mated. Searching for food...");
            System.out.println(bp.searchFood(2));

        } else if (bp2.getMating() == false) {

            System.out.println(bp2.getName() + " hasnt mated. Searching for food...");
            System.out.println(bp2.searchFood(2));

        } else if (bp3.getMating() == false) {

            System.out.println(bp3.getName() + " hasnt mated. Searching for food...");
            System.out.println(bp3.searchFood(2));
        }

        if (temp.getWeight() >= bp.getWeight() && temp.getWeight() >= bp2.getWeight()
                && temp.getWeight() >= bp3.getWeight()) {
            System.out.println("The lightest panther is: " + temp.getData());

        } else if (bp.getWeight() >= temp.getWeight() && bp.getWeight() >= bp2.getWeight()
                && bp.getWeight() >= bp3.getWeight()) {
            System.out.println("The lightest panther is: " + bp.getData());

        } else if (bp2.getWeight() >= temp.getWeight() && bp2.getWeight() >= bp.getWeight()
                && bp2.getWeight() >= bp3.getWeight()) {
            System.out.println("The lightest panther is: " + bp2.getData());

        } else if (bp3.getWeight() >= temp.getWeight() && bp3.getWeight() >= bp.getWeight()
                && bp3.getWeight() >= bp2.getWeight()) {
            System.out.println("The lightest panther is: " + bp2.getData());
        }

        if (temp.getWeight() <= bp.getWeight() && temp.getWeight() >= bp2.getWeight()
                && temp.getWeight() >= bp3.getWeight()) {
            System.out.println("The second heavy panther is: ");
            System.out.println(temp.getData());
        } else if (bp.getWeight() >= temp.getWeight() && bp.getWeight() >= bp2.getWeight()
                && bp.getWeight() <= bp3.getWeight()) {
            System.out.println("The second heavy panther is: ");
            System.out.println(bp.getData());
        } else if (bp2.getWeight() <= temp.getWeight() && bp2.getWeight() >= bp.getWeight()
                && bp2.getWeight() >= bp3.getWeight()) {
            System.out.println("The second heavy panther is: ");
            System.out.println(bp2.getData());
        } else if (bp3.getWeight() >= temp.getWeight() && bp3.getWeight() >= bp.getWeight()
                && bp3.getWeight() <= bp2.getWeight()) {
            System.out.println("The second heavy panther is: ");
            System.out.println(bp3.getData());
        }

        if (temp.getWeight() >= bp.getWeight() && temp.getWeight() >= bp2.getWeight() && temp.getWeight() >= bp3
                .getWeight()) {
            System.out.println("The heaviest panther is: ");
            System.out.println(temp.getData());
        } else if (bp.getWeight() >= temp.getWeight() && bp.getWeight() >= bp2.getWeight()
                && bp.getWeight() >= bp3.getWeight()) {
            System.out.println("The heaviest panther is: ");
            System.out.println(bp.getData());
        } else if (bp2.getWeight() >= temp.getWeight() && bp2.getWeight() >= bp.getWeight()
                && bp2.getWeight() >= bp3.getWeight()) {
            System.out.println("The heaviest panther is: ");
            System.out.println(bp2.getData());
        } else if (bp3.getWeight() >= temp.getWeight() && bp3.getWeight() >= bp.getWeight()
                && bp3.getWeight() >= bp2.getWeight()) {
            System.out.println("The heaviest panther is: ");
            System.out.println(bp3.getData());
        }

    }
}
