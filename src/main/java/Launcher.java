import domain.Menu;
import service.ClientService;

public class Launcher {
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
