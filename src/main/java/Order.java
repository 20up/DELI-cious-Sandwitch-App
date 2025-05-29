import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private Scanner scanner = new Scanner(System.in);

    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Sides> drinksList = new ArrayList<>();
    private List<Sides> chipsList = new ArrayList<>();

    public void Menu() {
        //while loop
        boolean choice = true;
        while (choice) {

            System.out.println("""
                    \n               Menu:
                    ====================================
                     1) Add Sandwich 🥪
                     2) Add Drink 🥤
                     3) Add Chips (1.50$) 🥔
                     4) Checkout
                     0) Cancel order
                     ===================================""");
            // user input
            System.out.print("Enter: ");
            String enter = scanner.nextLine().trim();
            System.out.println("\n");

            //switch and case for the choices
            switch (enter) {
                case "1":
                    Sandwich sandwich = new Sandwich();
                    sandwich.building();                     //takes you to "building" method in "Sandwich" class
                    System.out.println(sandwich.toString()); //prints the sandwich you made
                    sandwiches.add(sandwich);                // adds sandwiches made to "sandwiches" List
                    break;
                case "2":
                    Sides drinks = new Sides();
                    drinks.addDrinks(scanner);                   //takes you to "addDrink" method in "Sides" class
                    System.out.println(drinks.drinksToString()); //prints the drink you got
                    drinksList.add(drinks);                      //adds the drink to "drinkList" list
                    break;
                case "3":
                    Sides chips = new Sides();
                    chips.addChips(scanner);
                    System.out.println(chips.chipsToString());
                    chipsList.add(chips);
                    break;
                case "4":
                    checkout();
                    System.out.println("1) Confirm Order/ else Cancel");
                    String confirm = scanner.nextLine().trim();
                    if (confirm.equals("1")) {
                        System.out.println("\nOrder Is Confirmed\n");
                    } else {
                        System.out.println("\nOrder Canceled\n");
                        return;
                    }
                    break;
                case "0":
                    System.out.println("Order Canceled");
                    return;
                default: // defaults to "Invalid Input"
                    System.out.println("Invalid Input");
            }
        }
    }

    public void checkout() {
        System.out.println("""
                \n           Your Order:
                ====================================""");

        //loops "sandwiches" list and displays it
        for (Sandwich s : sandwiches) {
            s.display();
        }
        System.out.println("""
                              Drinks:
                ====================================""");

        //loops "drinkList" and puts it in "d" and displays it
        for (Sides d : drinksList) {
            System.out.println(d.drinkDisplay());
        }
        System.out.println("""
                              Chips:
                ====================================
                """);
        for(Sides c : chipsList){
            System.out.println(c.chipDisplay());
        }
        System.out.println("""
                ====================================""");
        System.out.println("Total: $" + calculateTotal());
    }


    private double calculateTotal() {
        double total = 0.0;

        //loops and calc the sandwich total
        for (Sandwich s : sandwiches) {
            total += s.calculatePrice();
        }
        //loops drinkList into "d" and uses "sideTotal" method to get total
        for (Sides d : drinksList) {
            total += d.sideTotal();
        }

        for(Sides c : chipsList){
            total += c.sideTotal();
        }
        return total;
    }


}
