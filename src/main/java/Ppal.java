import controller.MenuController;
import controller.SaleController;
import model.Sale;
import view.ViewSale;

public class Ppal {
    public static void main(String[] args) {
        ViewSale v = new ViewSale();
        Sale s = new Sale();

        MenuController mc = new MenuController(v);
        SaleController sc = new SaleController(v,s);
    }
}
