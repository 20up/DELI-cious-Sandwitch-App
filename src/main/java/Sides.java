import java.util.Scanner;

public class Sides {
    private String drinkSize;
    private String drinkFlavor;
    private String chipType;


    public static double drinkPrice(String size) {
        //size prices
        return switch (size.toUpperCase()) {
            case "S" -> 2.00;
            case "M" -> 2.50;
            case "L" -> 3.00;
            default -> 0.00;
        };
    }

    public void addDrinks(Scanner scanner) {
        //prompts for size
        System.out.println("""
                \nSelect drink size (S, M, L).
                Small - 2.00$
                Medium - 2.50$
                Large - 3.00$""");
        drinkSize = scanner.nextLine().trim().toUpperCase();

        //makes sure they pick a correct size option
        while (!drinkSize.equals("S") && !drinkSize.equals("M") && !drinkSize.equals("L")) {
            System.out.println("Need to choose (S, M, L) please try again.");
            drinkSize = scanner.nextLine().trim().toUpperCase();
        }

        //prompts drink options
        System.out.println("Select drink type (Water, Pepsi, Sprite, Tea, Coke)");
        drinkFlavor = scanner.nextLine().trim().toUpperCase();

        while (!drinkFlavor.equalsIgnoreCase("Water") && !drinkFlavor.equalsIgnoreCase("Pepsi") && !drinkFlavor.equalsIgnoreCase("Sprite") && !drinkFlavor.equalsIgnoreCase("Tea") && !drinkFlavor.equalsIgnoreCase("Coke")) {
            System.out.println("Need to choose (Water, Pepsi, Sprite, Tea, Coke) please try again.");
            drinkFlavor = scanner.nextLine().trim().toUpperCase();
        }
    }

    public String drinksToString() {
        return "\n         Drink Added          \n" +
                "====================================\n" +
                "Size:" + "(" + drinkSize + ") " + drinkFlavor;
    }

    public String drinkDisplay() {
        //if you don't have drinkSize or drinkFlavor returns ""
        if (drinkSize == null || drinkFlavor == null) {
            return "";
        }
        return drinkFlavor + " (" + drinkSize + ")";
    }


    public void addChips(Scanner scanner) {
        System.out.println("\nSelect chip option (Classic, BBQ, Salt & Vinegar, Flaming Hot)");
        chipType = scanner.nextLine().trim().toUpperCase();

        while (!chipType.equalsIgnoreCase("Classic") && !chipType.equalsIgnoreCase("BBQ") && !chipType.equalsIgnoreCase("Salt & Vinegar") && !chipType.equalsIgnoreCase("Flaming Hot")) {
            System.out.println("Need to choose (Classic, BBQ, Salt & Vinegar, Flaming Hot) please try again.");
            chipType = scanner.nextLine().trim().toUpperCase();
        }
    }

    public String chipsToString() {
        return "\n         Chips Added         \n" +
                "====================================\n" +
                chipType;
    }

    public String chipDisplay() {
        if (chipType == null) {
            return "";
        }
        return chipType;
    }


    public double sideTotal() {
        double total = 0.00;
        if (drinkSize != null) {
            total += drinkPrice(drinkSize);
        }
        if (chipType != null) {
            total += 1.50;
        }
        return total;
    }


}
