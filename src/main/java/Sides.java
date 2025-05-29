import java.util.Scanner;

public class Sides {
    private String drinkSize;
    private String drinkFlavor;


    public static double drinkPrice(String size) {
        //size prices
        return switch (size.toUpperCase()) {
            case "S" -> 2.0;
            case "M" -> 2.5;
            case "L" -> 3.0;
            default -> 0.0;
        };
    }

    public void addDrinks(Scanner scanner) {
        //prompts for size
        System.out.println("Select drink size (S, M, L).");
        drinkSize = scanner.nextLine().trim().toUpperCase();

        //makes sure they pick a correct size option
        while (!drinkSize.equals("S") && !drinkSize.equals("M") && !drinkSize.equals("L")) {
            System.out.println("Need to choose (S, M, L) try again.");
            drinkSize = scanner.nextLine().trim().toUpperCase();
        }

        //prompts drink options
        System.out.println("Select drink type (Water, Pepsi, Sprite, Tea, Coke)");
        drinkFlavor = scanner.nextLine().trim();
    }

    public String toString() {
        return "\n         Drink Added          \n" +
                "====================================\n" +
                "Drinks: " + drinkFlavor +  "Size: " + " (" + drinkSize + ")";
    }

    public String drinkDisplay() {
        //if you don't have drinkSize or drinkFlavor returns ""
        if (drinkSize == null || drinkFlavor == null) {
            return "";
        }
        return "Drinks: " + drinkFlavor + " (" + drinkSize + ")";
    }


    public double sideTotal() {
        double total = 0.0;
        if (drinkSize != null) {
            total += drinkPrice(drinkSize);
        }
        return total;
    }


}
