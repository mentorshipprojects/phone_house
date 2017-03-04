package domain;

import Service.ProductService;

import java.util.Scanner;

public class NewPurchase {
    private String manufacturerName;
    private int productPrice; //

    public int getProductPrice(){ return productPrice; }

    //List to select which manufacturer
    void Purchase(){
        //searching phone model
        ProductService searchProduct = new ProductService();
        searchProduct.ChoiceManufacturer();

        //add record to db
    }

}
