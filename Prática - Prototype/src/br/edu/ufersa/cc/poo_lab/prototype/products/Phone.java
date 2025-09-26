package br.edu.ufersa.cc.poo_lab.prototype.products;

import br.edu.ufersa.cc.poo_lab.prototype.products.contracts.PhysicalProduct;
import br.edu.ufersa.cc.poo_lab.prototype.products.contracts.Product;

public class Phone extends PhysicalProduct {

    private String os;
    private String brand;
    private String model;
    private double screenSize;

    public Phone() {
    }

    protected Phone(Phone original) {
        super(original);
        this.os = original.os;
        this.brand = original.brand;
        this.model = original.model;
        this.screenSize = original.screenSize;
    }

    @Override
    public Product copy() {
        return new Phone(this);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPhone [os=" + os + ", brand=" + brand + ", model=" + model + ", screenSize="
                + screenSize + ", getOs()=" + getOs() + ", getName()=" + getName() + ", getWidth()=" + getWidth()
                + ", getBrand()=" + getBrand() + ", getDescription()=" + getDescription() + ", getHeight()="
                + getHeight() + ", getModel()=" + getModel() + ", getPrice()=" + getPrice() + ", getDepth()="
                + getDepth() + ", getScreenSize()=" + getScreenSize() + ", getWeight()=" + getWeight() + "]";
    }

}
