import controller.InitialController;
import controller.MenuController;
import controller.ProductController;
import controller.ProfileChangesController;
import model.Client;
import model.Connection.Connection;
import model.file.FileManagement;
import model.Product;
import model.VentaCodis;
import view.View;

public class Ppal {
    public static void main(String[] args) {
        View v = new View();
        Connection c = new Connection();
        VentaCodis vc = new VentaCodis("GCODES", c);

        MenuController mc = new MenuController(v, vc);

        FileManagement fm = new FileManagement(vc);

        //CLIENTS
        Client client1 = new Client("gael", "1234");
        InitialController ic = new InitialController(v, client1);
        ProfileChangesController pcc = new ProfileChangesController(v, vc, client1, fm);


        //PRODUCTES
        Product product1 = new Product("Battlefield 1", "ES/EN/RU", "45", "4.99€");
        vc.addProduct(product1);
        Product product2 = new Product("Battlefield V", "ES/EN/RU", "24", "9.99€");
        vc.addProduct(product2);
        Product product3 = new Product("Resident Evil VI", "ES/EN", "2", "19.99€");
        vc.addProduct(product3);
        Product product4 = new Product("GTA V", "ES/EN/RU", "30", "11.99€");
        vc.addProduct(product4);
        Product product5 = new Product("Minecraft", "ES/EN/RU", "12", "5.99€");
        vc.addProduct(product5);
        Product product6 = new Product("FIFA 20", "ES/EN", "10", "9.99€");
        vc.addProduct(product6);
        Product product7 = new Product("FIFA 21", "ES/EN/RU", "50", "29.99€");
        vc.addProduct(product7);
        Product product8 = new Product("UFC 2021", "ES/EN/RU", "24", "9.99€");
        vc.addProduct(product8);
        Product product9 = new Product("NBA 2K20", "ES/EN", "15", "10.00€");
        vc.addProduct(product9);
        Product product10 = new Product("NBA 2K21", "ES/EN", "5", "25.99€");
        vc.addProduct(product10);
        ProductController pc = new ProductController(v, vc, fm);
    }
}
