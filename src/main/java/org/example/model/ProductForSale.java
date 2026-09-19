package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public double getSalesPrice(int quantity) {
        return price * quantity;
    }
    public abstract void showDetails();
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductForSale [");
        sb.append("\ntype=").append(type);
        sb.append("\nPrice= ").append(price);
        sb.append("\nDescription=").append(description);
        sb.append("\n]");
        return sb.toString();
    }
}
