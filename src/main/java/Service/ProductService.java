package service;

import service.product.BrandList;
import service.product.PhoneList;

import java.util.Scanner;

public class ProductService {
    public void ChoiceManufacturer(){
        Scanner scanner = new Scanner(System.in);

        BrandList brandList = new BrandList();
        brandList.display();

        System.out.print("Select manufacturer: ");
        byte brand = scanner.nextByte(); //variable for select brand
        System.out.println("============================");

        switch (brand){
            case 1:
                PhoneList phoneList = new PhoneList();
                phoneList.Apple();
                break;
            case 2:
                System.out.println("Asus");
                break;
            case 3:
                System.out.println("HTC");
                break;
            case 4:
                System.out.println("Huawei");
                break;
            case 5:
                System.out.println("Sony");
                break;
            case 6:
                System.out.println("Lenovo");
                break;
            case 7:
                System.out.println("Samsung");
                break;
            case 8:
                System.out.println("Prestigio");
                break;
            case 9:
                System.out.println("LG");
                break;
            case 10:
                System.out.println("Nokia");
                break;
            case 11:
                System.out.println("Meizu");
                break;
            default:
                System.out.println("---WTF???");
        }
    }
}