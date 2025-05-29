import java.util.Scanner;

public class OrderScreen {

    static Scanner scanner = new Scanner(System.in);

    public void Start() {
        //"while" loop that stops when "choice" is false
        boolean choice = true;
        while (choice) {
            //home screen
            System.out.println(""" 
                                    Home
                    ====================================
                    🥪Welcome to DelI-cious🥪
                    1) New Order
                    0) Exit
                    ====================================""");
            System.out.print("Enter: ");
            String enter = scanner.nextLine().trim(); // input of what the user wants to do
            //switch for the 2 choices and default is "invalid input"
            switch (enter) {
                case "1":
                    Order order = new Order();
                    order.Menu();
                    break;
                case "0":
                    System.out.println("Thanks for using the app \uD83D\uDC3B");
                    choice = false;
                    break;
                default:
                    System.out.println("X invalid input X");
            }

        }

    }
}
