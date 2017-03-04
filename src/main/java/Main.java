import Service.ClientService;

/**
 * Created by pintokha on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        //fill multiple database clients
        ClientService qwerty = new ClientService();
        qwerty.clientFilling();
        while (true) {
            Menu start = new Menu();
            start.HomeMenu();
        }
    }
}
