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

   public VentaCodis(String nameWeb) {
        this.nameWeb = nameWeb;
        this.clientList = new ArrayList<Client>();
        this.productList = new ArrayList<Product>();
        this.saleList = new ArrayList<Sale>();
    }

    public VentaCodis() {

    }

    public void addClient(Client c){
        this.clientList.add(c);
    }

    public String getNameWeb() {
        return nameWeb;
    }

    public void setNameWeb(String nameWeb) {
        this.nameWeb = nameWeb;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<Sale> saleList) {
        this.saleList = saleList;
    }
}
