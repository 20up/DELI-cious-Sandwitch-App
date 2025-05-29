import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private Scanner scanner = new Scanner(System.in);

    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<String> drinks = new ArrayList<>();
    private List<String> chips = new ArrayList<>();

    public void Menu() {

        //while loop
        boolean choice = true;
        while (choice) {

            System.out.println("""
                    \n      Menu
                     1) Add Sandwich 🥪
                     2) Add Drink 🥤
                     3) Add Chips 🥔
                     4) Checkout
                     0) Cancel order
                    """);
            // user input
            System.out.print("Enter: ");
            String enter = scanner.nextLine().trim();
            System.out.println("\n");

            //switch and case for the choices
            switch (enter) {
                case "1":
                    Sandwich sandwich = new Sandwich();
                    sandwich.building(); //takes you to "building" method in "Sandwich" class
                    System.out.println(sandwich.toString()); //prints the sandwich you made
                    sandwiches.add(sandwich); // added sandwiches made to "sandwiches" List
                    break;
                case "2":
//                    drink();
                case "3":
//                    chip();
                case "4":
//                    checkout();
                case "0":
//                    cancel();
                default: // defaults to "Invalid Input"
                    System.out.println("Invalid Input");
            }
        }
    }




}
