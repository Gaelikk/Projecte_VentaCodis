package model.File;

import model.Client;
import model.Product;
import model.VentaCodis;

import java.io.*;
import java.util.List;

public class FileManagement {
    File document, folder;

    FileWriter fWriter;
    BufferedWriter bWriter;

    FileReader fReader;
    BufferedReader bReader;

    public FileManagement(VentaCodis vc) {
        writeClientList(vc.getClientList());
        writeProductList(vc.getProductList());
    }

    private void createFolder() {
        folder = new File("facturació");
        if (folder.mkdir()) {
            System.out.println("Carpeta creada correctament!!!");
        } else {
            System.err.println("Error!!! La carpeta potser que estigués creda");
        }
    }

    private File createDocClient(String fileName) {
        document = new File("factures" + File.separator + fileName);
        if (document.exists()) {
            System.err.println("El fitxer ja existeix...");
        } else {
            try {
                if (document.createNewFile()) {
                    System.out.println("Fitxer creat.");
                } else {
                    System.err.println("No he pogut crear el fitxer...");
                }
            } catch (IOException e) {
                System.out.println("Error!!!" + e.getMessage());
            }
        }
        return document;
    }

    private File createDocProduct(String fileName) {
        document = new File("factures" + File.separator + fileName);
        if (document.exists()) {
            System.err.println("El fitxer ja existeix...");
        } else {
            try {
                if (document.createNewFile()) {
                    System.out.println("Fitxer creat.");
                } else {
                    System.err.println("No he pogut crear el fitxer...");
                }
            } catch (IOException e) {
                System.out.println("Error!!!" + e.getMessage());
            }
        }
        return document;
    }

    public void writeClientList(List<Client> clientList) {
        createFolder();

        try {
            fWriter = new FileWriter(createDocClient("clients.txt"), false);
            bWriter = new BufferedWriter(fWriter);

            for (Client c : clientList) {
                bWriter.write(c.getUsername() + " - " + c.getEmail());
                bWriter.write(System.lineSeparator());
            }
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeProductList(List<Product> productList) {
        createFolder();

        try {
            fWriter = new FileWriter(createDocProduct("products.txt"), false);
            bWriter = new BufferedWriter(fWriter);

            for (Product p : productList) {
                bWriter.write(p.getName() + " - " + p.getLanguage() + "-" + p.getQuantity() + p.getPrice());
                bWriter.write(System.lineSeparator());
            }
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
