package br.edu.ufersa.cc.poo_lab.prototype.products.contracts;

public abstract class Product implements Copyable<Product> {

    private String name;
    private String description;
    private double price;

    protected Product() {
    }

    protected Product(final Product original) {
        if (original != null) {
            this.name = original.name;
            this.description = original.description;
            this.price = original.price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
