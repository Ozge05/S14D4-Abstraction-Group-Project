package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nBread{");
        sb.append("\nbreadType=").append(breadType);
        sb.append("\n}");
        return sb.toString();
    }
}
