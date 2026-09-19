package org.example.model;

public class Chocolate extends ProductForSale{
    private String chocolateType;

    public Chocolate(String type, double price, String description, String chocolateType) {
        super(type, price, description);
        this.chocolateType = chocolateType;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nChocolate{");
        sb.append("\nchocolateType=").append(chocolateType);
        sb.append("\n}");
        return sb.toString();
    }
}
