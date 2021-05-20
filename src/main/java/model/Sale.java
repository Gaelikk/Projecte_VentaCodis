package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private String nameCodeSales;
    private List<Client> clientList = new ArrayList<>();

    public Sale() {
    }

    public Sale(String nameCodeSales) {
        this.nameCodeSales = nameCodeSales;
    }

    public String getnameCodeSales() {
        return nameCodeSales;
    }

    public void setnameCodeSales(String nameCodeSales) {
        this.nameCodeSales = nameCodeSales;
    }
}
