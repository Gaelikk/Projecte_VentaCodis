import controller.InitialController;
import controller.MenuController;
import controller.ProfileChangesController;
import model.Client;
import model.Connection.Connection;
import model.File.FileManagement;
import model.VentaCodis;
import view.ViewSale;

public class Ppal {
    public static void main(String[] args) {
        ViewSale v = new ViewSale();
        VentaCodis vc = new VentaCodis();
        Connection c = new Connection();

        MenuController mc = new MenuController(v);
        ProfileChangesController pcc = new ProfileChangesController(v);

        Client client1 = new Client("gael", "1234");
        InitialController ic = new InitialController(v, client1);
        vc.addClient(client1);
        FileManagement fm = new FileManagement(vc);


    }
}
