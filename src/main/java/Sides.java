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
            System.out.println("Need to choose (S, M, L) try again.");
            drinkSize = scanner.nextLine().trim().toUpperCase();
        }

        //prompts drink options
        System.out.println("Select drink type (Water, Pepsi, Sprite, Tea, Coke)");
        drinkFlavor = scanner.nextLine().trim();
    }

    public String drinksToString() {
        return "\n         Drink Added          \n" +
                "====================================\n" +
                "Drinks: " + drinkFlavor +  " Size: " + " (" + drinkSize + ")";
    }

    public String drinkDisplay() {
        //if you don't have drinkSize or drinkFlavor returns ""
        if (drinkSize == null || drinkFlavor == null) {
            return "";
        }
        return "Drinks: " + drinkFlavor + " (" + drinkSize + ")";
    }





    public void addChips(Scanner scanner){
        System.out.println("\nSelect chip option (Classic, BBQ, Salt & Vinegar, Flaming Hot)");
        chipType = scanner.nextLine().trim();
    }

    public String chipsToString(){
        return "\n         Chips Added         \n" +
                "====================================\n" +
                "Chips: " + chipType;
    }

    public String chipDisplay(){
        if(chipType == null){
            return "";
        }
        return "Chips " + chipType;
    }





    public double sideTotal() {
        double total = 0.00;
        if (drinkSize != null) {
            total += drinkPrice(drinkSize);
        }
        if(chipType != null){
            total += 1.50;
        }
        return total;
    }


}
