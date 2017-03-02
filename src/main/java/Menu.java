import domain.NewPurchase;
import java.util.Scanner;

class Menu {
    void HomeMenu(){

        System.out.println("=== Phone House ===");
        System.out.println("| 1 - New purchase ");
        System.out.println("| 2 - Return product");
        System.out.println("| 3 - Print check   ");
        System.out.println("===================");

        Scanner menuSelection = new Scanner(System.in);
        System.out.print("Select operation: ");
        int test = menuSelection.nextByte();

        switch (test){
            case 1:
                NewPurchase purchase = new NewPurchase();
                purchase.Manufacturer();
                break;
            case 2:
                System.out.println("...");
                break;
            case 3:
                System.out.println("...");
                break;
            default:
                System.out.println("Incorrect input...");
        }
    }
}