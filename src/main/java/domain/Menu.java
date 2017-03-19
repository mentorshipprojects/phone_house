package domain;

import service.ProductService;
import domain.NewPurchase;
import java.util.Scanner;

public class Menu {
    public void HomeMenu(){

        System.out.println("=== Phone House ===");
        System.out.println("| 1 - New purchase ");
        System.out.println("| 2 - Return product");
        System.out.println("| 3 - Print check   ");
        System.out.println("===================");

        Scanner menuSelection = new Scanner(System.in);
        System.out.print("Select operation: ");
        byte choice = menuSelection.nextByte();

        switch (choice){
            case 1:
                ProductService purchase = new ProductService();
                purchase.ChoiceManufacturer();
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