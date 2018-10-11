

/**Driver class to test out the Trainee class functionality*/

public class HouseDriver {
    public static void main(String[] args) {

                System.out.println("First create a Trainee object via the no-argument constructor...");
               House p1 = new House();
                System.out.println("Values of house p1:\n" +
                p1.toString());
                System.out.println("\n\nNow create a second " +
                        "house, this time via arguments passed to the constructor...");

        House p2 = new House("Kerry", "DB", "John B",250071,20,250);
                System.out.println("Values of Trainee object p2 :\n" + p2.toString());

        System.out.println("\n\nWill now attempt to check the functionality of the setAddress() method separately by setting the address of p1 to \"Ballyheigue\"");
        p1.setAddress("Ballyheigue");
        System.out.println("The address of the house object p1 ( obtained using getAddress() ) is now " + p1.getAddress());
        System.out.println("\n\nWill now attempt to check the functionality of the getStartWeight() method separately on p2");
        System.out.println("Starting weight of the Trainee p2 is " + p2.getStartWeight().toString());

        System.out.println("\n\nCan also set the starting weight of p2 to 14 st 12 lb ");
        p2.setStartWeight(14,12);
        System.out.println("New starting weight of the Trainee p2 is " + p2.getStartWeight().toString());
    }
}


