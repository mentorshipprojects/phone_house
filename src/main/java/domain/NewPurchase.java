package domain;

import java.util.Scanner;

public class NewPurchase {
    String manufacturerName;
    public int productPrice; //

    public int getProductPrice(){
        return productPrice;
    }

    //List to select which manufacturer
    public void Manufacturer(){
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("1 - Apple");
        System.out.println("2 - Asus");
        System.out.println("3 - HTC");
        System.out.println("4 - Huawei");
        System.out.println("5 - Sony");
        System.out.println("6 - Lenovo");
        System.out.println("7 - Samsung");
        System.out.println("8 - Prestigio");
        System.out.println("9 - LG");
        System.out.println("10 - Nokia");
        System.out.println("11 - Meizu");
        System.out.print("Select manufacturer: ");
        byte test = sc.nextByte();
        System.out.println("============================");

        switch (test){
            case 1:
                manufacturerName = "Apple";
                Apple();
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

    public void Apple(){
        System.out.println("Select phone brands " + manufacturerName);

        System.out.println("1 - Apple iPhone 7 32GB Gold | 22 999");
        System.out.println("2 - Apple iPhone 7 128GB Black | 26 499");
        System.out.println("3 - Apple iPhone 7 Plus 128GB Black | 37 999");
        System.out.println("4 - Apple iPhone 6s Plus 32GB Space Gray | 22 999");
        System.out.println("5 - Apple iPhone 6s 128GB Space Gray | 20 999");
        System.out.println("6 - Apple iPhone 6s Plus 128GB Silver | 27 499");
        System.out.println("7 - Apple iPhone 5s 16GB Silver | 9 799");

        Scanner sc = new Scanner(System.in);
        byte product = sc.nextByte();

        switch (product){
            case 1:
                productPrice = 22999;
                Client test = new Client();
                test.newClient(productPrice);
                test.test();
                break;
            case 2:
                productPrice = 26499;
                break;
            case 3:
                productPrice = 37999;
                break;
            case 4:
                productPrice = 22999;
                break;
            case 5:
                productPrice = 20999;
                break;
            case 6:
                productPrice = 27499;
                break;
            case 7:
                productPrice = 9799;
                break;
            default:
                System.out.println("wtf ?");
        }
    }
}
