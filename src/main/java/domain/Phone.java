package domain;

import java.util.Scanner;

public class Phone {

    public void Test() {
        String array[][] = new String[30][7];
        array[0][0] = "099";
        array[1][0] = "067";
        array[2][0] = "097";
        array[3][0] = "050";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the phone number of the client:");
        String phoneNumber = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null) {
                if (array[i][0].equals(phoneNumber)) {
                    System.out.println("yes");
                }
            } else {
                System.out.println("false");
                break;
            }
        }
    }
}
