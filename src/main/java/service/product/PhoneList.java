
package service.product;

import service.ClientService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneList {
    private int productPrice;
    private String productName;
    private Map<Integer, String> apple = new HashMap<Integer, String>();
    private Map<Integer, String> asus = new HashMap<Integer, String>();

    public PhoneList(){
        apple.put(1, "Apple iPhone 7 128GB Black");
        apple.put(2, "Apple iPhone 6s Plus 32GB Space Gray");
        apple.put(3, "Apple iPhone 5s 16GB Silver");
    }

    public void Apple(){

        for (Map.Entry<Integer, String> list : apple.entrySet())
            System.out.println(list.getKey() + " - " + list.getValue());

        System.out.print("Please, select phone model: ");

        Scanner scanner = new Scanner(System.in);
        byte productChoice = scanner.nextByte(); //variable for select product

        switch (productChoice){
            case 1:
                productName = apple.get(1);
                productPrice = 29700; break;
            case 2:
                productName = apple.get(2);
                productPrice = 26499; break;
            case 3:
                productName = apple.get(3);
                productPrice = 9799; break;
            default: System.out.println("wtf ?");
        }

        ClientService client = new ClientService();
        client.isOurClient(productPrice, productName);
    }
}