package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Snack", 89.5,"Alplerden gelen sütle yapılmıştır.");
        products[1] = new Coke("Beverage", 49.5,"Dikkat asit içerir, gaz yapar");
        products[2] = new Bread("Bakery",100,"Organik tam buğday ekmeği");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
    for (ProductForSale product : products){
        product.showDetails();
    }
    }
}