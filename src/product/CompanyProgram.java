package product;

import java.util.ArrayList;
import java.util.List;

public class CompanyProgram {

    public static void main(String arg[]) {

        String productName = "ninguno";

        Product product = new Product("laptop", 2000, 01);
        Product product1 = new Product("PC HP", 180, 02);
        Product product2 = new Product("Cámara Nikon", 175, 03);
        Product product3 = new Product("TV Samsung", 5000, 04);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        Company company = new Company("Google", "UEA");
        company.setProductList(productList);

        System.out.println("El producto mas caro de la empresa "+ company.getName() + " es "
                + company.getExpensiveProduct());

        if (company.isProductInStock(productName))

            System.out.println("El producto " + productName + " esta en stock");

        else
            System.out.println("El producto " + productName + " No esta en stock");


    }
}
