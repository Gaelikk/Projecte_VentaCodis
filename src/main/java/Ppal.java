import controller.InitialController;
import controller.MenuController;
import controller.ProfileChangesController;
import model.Client;
import model.File.FileManagement;
import model.VentaCodis;
import view.ViewSale;

public class Ppal {
    public static void main(String[] args) {
        ViewSale v = new ViewSale();
        VentaCodis vc = new VentaCodis();

        MenuController mc = new MenuController(v);
        ProfileChangesController pcc = new ProfileChangesController(v);
        FileManagement fm = new FileManagement(vc);

        Client client1 = new Client("gael", "g123456", "611473145");
        InitialController ic = new InitialController(v, client1);
    }
}
