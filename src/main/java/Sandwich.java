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

    public void display() {
        System.out.println(size + "\" " + bread + "sandwich" + (toasted ? "(Toasted )" : ""));
        System.out.println("Meats: " + meats);
        System.out.println("Cheeses: " + cheeses);
        System.out.println("Toppings: " + toppings);
        System.out.println("Sauces " + sauces);
    }

    public double calculatePrice() {
        double base = switch (size) {
            case 4 -> 5.5;
            case 8 -> 7.0;
            case 12 -> 8.5;
            default -> 0.0;
        };
        double meatCost = 0.0;
        if (!meats.isEmpty()) {
            meatCost += switch (size) {
                case 4 -> 1.0;
                case 8 -> 2.0;
                case 12 -> 3.0;
                default -> 0.0;
            };
            int extraMeat = meats.size() - 1;
            if (extraMeat > 0) {
                meatCost += extraMeat * switch (size) {
                    case 4 -> 0.5;
                    case 8 -> 1.0;
                    case 12 -> 1.5;
                    default -> 0.0;
                };
            }
        }
        double cheeseCost = 0.0;
        if (!cheeses.isEmpty()) {
            cheeseCost += switch (size) {
                case 4 -> 0.75;
                case 8 -> 1.50;
                case 12 -> 2.25;
                default -> 0.0;
            };
        }

        int extraCheese = cheeses.size() - 1;
        if (extraCheese > 0) {
            cheeseCost += extraCheese * switch (size) {
                case 4 -> 0.3;
                case 8 -> 0.6;
                case 12 -> 0.9;
                default -> 0.0;
            };
        }
        return base + meatCost + cheeseCost;
    }

}

