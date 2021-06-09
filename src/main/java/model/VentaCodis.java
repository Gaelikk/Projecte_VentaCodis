package model;

import model.Connection.Connection;
import model.file.FileManagement;

import java.util.ArrayList;
import java.util.List;

public class VentaCodis {
    public String nameWeb;
    List<Product> productList;
    public List<Client> clientList = new ArrayList<>();
    public Connection c;
    public FileManagement fm;

    public VentaCodis(String nameWeb, Connection c) {
        this.nameWeb = nameWeb;
        productList = new ArrayList<Product>();
        this.c = c;
    }

    public VentaCodis() {

    }

    public String getNameWeb() {
        return nameWeb;
    }

    public void setNameWeb(String nameWeb) {
        this.nameWeb = nameWeb;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public FileManagement getFm() {
        return fm;
    }

    public void setFm(FileManagement fm) {
        this.fm = fm;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void addClient(Client client) {
        this.clientList.add(client);
    }


    public List<Product> getProductListByParam(String pl) {
        List<Product> pList = new ArrayList<Product>();

        for (Product p : this.productList) {
            if (p.getName().contains(pl) || p.getPrice().contains(pl)) {
                pList.add(p);
            }
        }
        return pList;
    }
}
