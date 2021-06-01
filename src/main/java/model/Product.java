package model;

import javax.persistence.*;
import javax.swing.*;
import java.io.Serializable;

@Entity
@Table(name = "Productes")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    @Column(name = "Nom Productes",length = 100, nullable = true)
    private String name, language;
    private ImageIcon img;
    private int quantity;
    private float price;

    public Product() {
    }

    public Product(String name, String language, ImageIcon img, int quantity, float price) {
        this.name = name;
        this.language = language;
        this.img = img;
        this.quantity = quantity;
        this.price = price;
    }

    Product product1 = new Product("Battlefield 1", "ES/EN/RU", new ImageIcon("src/main/java/img/bf1.jpg"), 45, 4.99f);
    Product product2 = new Product("Battlefield V", "ES/EN/RU", new ImageIcon("src/main/java/img/bf5.jpg"), 24, 9.99f);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
