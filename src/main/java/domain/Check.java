package domain;

public class Check {
    public void print(String productName, double productPrice, double discount){
        System.out.println("=== Phone House ===");
        System.out.println("Name of product: " + productName);
        System.out.println("Product price: " + productPrice);
        System.out.println("Discount: " + discount);
        double total = productPrice - discount;
        System.out.println("Total: " + total);
        System.out.println("--- Thank you for your purchase ---\n");
    }
}
