package domain;

import service.ProductService;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewPurchase {
    private String purchases[][] = new String[1000][5];//id nameOfProduct price date idClient

    //List to select which manufacturer
    void Purchase(){
        //searching phone model
        ProductService searchProduct = new ProductService();
        searchProduct.ChoiceManufacturer();
    }

    public void add(double productPrice, String productName, int idClient){
        Date date = new Date();
        SimpleDateFormat dateOfPurchase = new SimpleDateFormat("yyyy.MM.dd");

        for (int i = 0; i < 1000;){
            if (purchases[i][0] == null){
                // record data in the array
                purchases[i][0] = Integer.toString(i);
                purchases[i][1] = productName;
                purchases[i][2] = Double.toString(productPrice);
                purchases[i][3] = dateOfPurchase.format(date);
                purchases[i][4] = Integer.toString(idClient);
                break;
            } else {
                i++;
            }
        }
    }
}