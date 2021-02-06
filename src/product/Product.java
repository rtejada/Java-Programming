package product;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String nameProduct;
    private double priceProduct;
    private int idProduct;


    public Product(String nameProduct, double priceProduct, int idProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.idProduct = idProduct;

    }

    public String getNameProduct() {
        return nameProduct;

    }

    public double getPriceProduct() {
        return priceProduct;
    }


}