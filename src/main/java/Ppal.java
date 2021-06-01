import controller.InitialController;
import controller.MenuController;
import controller.SaleController;
import model.Client;
import model.Sale;
import view.ViewSale;

public class Ppal {
    public static void main(String[] args) {
        ViewSale v = new ViewSale();
        Sale s = new Sale();

        MenuController mc = new MenuController(v);
        SaleController sc = new SaleController(v, s);

        Client client1 = new Client("gael", "g123456");
        InitialController ic = new InitialController(v, client1);
    }
}
