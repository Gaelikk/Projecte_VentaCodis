package model;

import model.File.FileManagement;

import java.util.ArrayList;
import java.util.List;

public class VentaCodis {
    private String nameWeb;
    private List<Client> clientList;
    private List<Product> productList;
    private List<Sale> saleList;
    private FileManagement fm;


    public VentaCodis(String nameWeb, List<Client> clientList, List<Product> productList, List<Sale> saleList) {
        this.nameWeb = nameWeb;
        this.clientList = clientList;
        this.productList = productList;
        this.saleList = saleList;
    }

    public VentaCodis() {
    }

    public void updateClient(Client c) {
        this.clientList.add(c);
    }

    public List<Client> getClientList(){
        return clientList;
    }
    public List<Product> getProductList(){
        return productList;
    }
}
