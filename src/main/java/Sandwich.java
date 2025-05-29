import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sandwich {
    static Scanner scanner = new Scanner(System.in);

    private String bread;
    private int size;
    private List<String> meats = new ArrayList<>();
    private List<String> cheeses = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();
    private boolean toasted;

    public void building() {
        boolean t = true;
        while (t) {
            try {
                System.out.println("\nChoose one bread type:(White, Wheat, Rye, Wrap)");
                bread = scanner.nextLine().trim();

                System.out.println("Choose one Bread Size:(4, 8, 12)");
                size = Integer.parseInt(scanner.nextLine());

                System.out.println("Add Meats !PLEASE SPACE WITH COMMA!:(Steak, Ham, Salami, Roast Beef, Chicken, Bacon)");
                meats = Arrays.asList(scanner.nextLine().split(","));

                System.out.println("Add Cheeses !PLEASE SPACE WITH COMMA!:(Cheddar, Swiss, American, Provolone)");
                cheeses = Arrays.asList(scanner.nextLine().split(","));

                System.out.println("Add Toppings !PLEASE SPACE WITH COMMA!:(Lettuce, Pepper, Tomato, Onion, Jalapenos, Pickles, Cucumbers, Guac, Mushrooms)");
                toppings = Arrays.asList(scanner.nextLine().split(","));

                System.out.println("Add Sauces !PLEASE SPACE WITH COMMA!:(Mayo, Mustard, Ranch, Kechups, Thousand Island, Vinaigrette)");
                sauces = Arrays.asList(scanner.nextLine().split(","));

                System.out.println("Do you want it toasted:(Yes/No)");
                toasted = scanner.nextLine().equalsIgnoreCase("yes");

                t = false;
            } catch (Exception e) {
                System.out.println("\nRAN INTO A PROBLEM TRY AGAIN\n");
            }
        }


    }



    public String toString() {
        return "\nSandwich Added\n" +
                "Bread type: " + bread + " size: " + size + "\" " + "\n" +
                "toasted: " + toasted + "\n" +
                "Meats: " + meats + "\n" +
                "Cheeses: " + cheeses + "\n" +
                "Toppings: " + toppings + "\n" +
                "Sauces: " + sauces;
    }


}
