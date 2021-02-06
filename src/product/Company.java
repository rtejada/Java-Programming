package product;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private String address;
    private List<Product> productsList;

    public Company(String name, String address){

        this.name = name;
        this.address = address;
        this.productsList = new ArrayList<Product>();

    }

    public String getName(){
        return name;
    }

    public void setProductList(List<Product> productList){
        this.productsList = productList;

    }

    public String getExpensiveProduct(){
        double priceAux = productsList.get(0).getPriceProduct();
        int index = 0;

        for (int i=0; i<productsList.size(); i++){

            if (productsList.get(i).getPriceProduct() > priceAux){
                index = i;
                priceAux = productsList.get(i).getPriceProduct();

            }
        }
        return productsList.get(index).getNameProduct();
    }

    public boolean isProductInStock(String name){

        for (int i=0; i<productsList.size(); i++){
            if (productsList.get(i).getNameProduct().equals(name))
                return true;

        }
        return false;
    }
}
