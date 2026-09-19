package org.example.model;

public class Coke extends ProductForSale{
    private String cokeType;

    public Coke(String type, double price, String description) {
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
        sb.append("\nCoke{");
        sb.append("\nCokeType=").append(cokeType);
        sb.append("\n}");
        return sb.toString();
    }
}
