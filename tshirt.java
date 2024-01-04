public class tshirt {
    public tshirt(String kathmanduSunrise, int i, double v, String nepalThreads, String s, String[] sizes3) {

    }

    public static void main(String[] args) {

        String[] sizes1 = {"S", "M", "L"};
        tshirt shirt1 = new tshirt("Gorkhali Batman", 572, 1200.0, "Karuna",
                "You either die a hero or live long enough to see yourself be a villain", sizes1);

        String[] sizes2 = {"M", "L", "XL"};
        tshirt shirt2 = new tshirt("Slipknot", 681, 1500.0, "Everest Wear",
                "eyeless", sizes2);

        String[] sizes3 = {"XS", "S", "M"};
        tshirt shirt3 = new tshirt("Nirvana", 789, 1100.0, "Nepal Threads",
                "In Utero", sizes3);


        System.out.println("T-Shirt Details:");
        shirt1.describetshirt();
        System.out.println();
        shirt2.describetshirt();
        System.out.println();
        shirt3.describetshirt();
    }

    private void describetshirt() {
    }
}
