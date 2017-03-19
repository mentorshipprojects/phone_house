package service;

import domain.Check;
import domain.Discount;
import domain.NewPurchase;

import java.util.Scanner;

public class ClientService {
    private String client[][] = new String[1000][10];

    public void clientFilling(){
        //col 0 - id
        //col 1 - name
        //col 2 - sur name
        //col 3 - phone number
        //col 4 - age
        //col 5 - date of birthday
        //col 6 - city
        //col 7 - sex
        //col 8 - accumulation
        //col 9 - discount

        client[0][0] = "1";
        client[0][1] = "Ivan";
        client[0][2] = "Hrabovskiy";
        client[0][3] = "099";
        client[0][4] = "26";
        client[0][5] = "12.03.1990";
        client[0][6] = "IF";
        client[0][7] = "male";
        client[0][8] = "0";

        client[1][0] = "2";
        client[1][1] = "Sergiy";
        client[1][2] = "Antonovych";
        client[1][3] = "067";
        client[1][4] = "30";
        client[1][5] = "30.07.1986";
        client[1][6] = "Kalush";
        client[1][7] = "male";
        client[1][8] = "0";

        client[2][0] = "3";
        client[2][1] = "Nataliia";
        client[2][2] = "Korolevych";
        client[2][3] = "050";
        client[2][4] = "20";
        client[2][5] = "22.10.1996";
        client[2][6] = "Burshtyn";
        client[2][7] = "female";
        client[2][8] = "4987";
    }

    public void isOurClient(int productPrice, String productName){
        System.out.println("The purchaser is our client? y(yes) | n(no)");
        Scanner scanner = new Scanner(System.in);
        String isOurClient = scanner.nextLine();

        if (isOurClient.equals("y")){ searchClient(productPrice, productName); }
        else { addClient(productPrice, productName); }
    }

    private void addClient(double productPrice, String productName){

        //Search free field for new customer
        int nextClient, idClient;
        for(int i = 7; i < 1000; i++){
            if(client[i][0] == null){
                nextClient = i;
                Scanner newRecord = new Scanner(System.in);

                System.out.println("Enter the following data...");
                idClient = i;
                client[nextClient][0] = Integer.toString(i);

                System.out.print("Name: ");
                String name = newRecord.nextLine();
                client[nextClient][1] = name;

                System.out.print("Surname: ");
                String surname = newRecord.nextLine();
                client[nextClient][2] = surname;

                System.out.print("Phone number: ");
                String phoneNumber = newRecord.nextLine();
                client[nextClient][3] = phoneNumber;

                System.out.print("Age: ");
                String age = newRecord.nextLine();
                client[nextClient][4] = age;

                System.out.print("Date of birthday[yyyy.mm.dd]: ");
                String dateOfBirthday = newRecord.nextLine();
                client[nextClient][5] = dateOfBirthday;

                System.out.print("City: ");
                String city = newRecord.nextLine();
                client[nextClient][6] = city;

                System.out.print("Sex: ");
                String sex = newRecord.nextLine();
                client[nextClient][7] = sex;

                String accumulation = Double.toString(productPrice);
                client[nextClient][8] = accumulation;

                NewPurchase purchase = new NewPurchase();
                purchase.add(productPrice, productName, idClient);



                break;
            } else {
                System.out.println("fatal");
            }
        }
    }

    private void searchClient(double productPrice, String productName){
        client[0][0] = "5";
        client[0][1] = "Ivan";
        client[0][2] = "Hrabovskiy";
        client[0][3] = "099";
        client[0][4] = "26";
        client[0][5] = "12.03.1990";
        client[0][6] = "IF";
        client[0][7] = "male";
        client[0][8] = "11576";
        client[0][9] = "0.0";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the phone number of the client: ");
        String phoneNumber = scanner.nextLine();

        for(int i = 0; i < 1000; i++){
            if(client[i][3].equals(phoneNumber)){
                int idClient = Integer.parseInt(client[i][0]);

                Discount disc = new Discount();
                double accumulation = Integer.parseInt(client[i][8]);
                double percent = disc.hasDiscount(accumulation, productPrice);

                double discount = 0;
                if (percent == 0.0){
                    accumulation =+ productPrice;
                    client[i][8] = Double.toString(accumulation);
                } else {
                    discount = productPrice * percent;
                    productPrice = productPrice - discount;
                    accumulation =+ productPrice;
                    client[i][8] = Double.toString(accumulation);
                    client[i][9] = Double.toString(discount);
                }

                NewPurchase purchase = new NewPurchase();
                purchase.add(productPrice, productName, idClient);

                Check check = new Check();
                check.print(productName, productPrice, discount);

                break;
            } else {
                System.out.println("Client specified phone number does not exist...");
                System.out.println("Search again? y(yes) | no(Create new client)");
                String answer = scanner.nextLine();
                if(answer.equals("y")){
                    searchClient(productPrice, productName);
                } else {
                    //creating new client
                    addClient(productPrice, productName);
                    break;
                }
            }
        }
    }

    void test(){
        for (int i = 0; i < 9; i++){
            System.out.println(client[7][i]);
        }
    }
}