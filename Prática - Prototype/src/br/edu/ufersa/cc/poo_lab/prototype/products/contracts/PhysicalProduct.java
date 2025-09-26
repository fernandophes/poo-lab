package br.edu.ufersa.cc.poo_lab.prototype.products.contracts;

public abstract class PhysicalProduct extends Product {

    private double width;
    private double height;
    private double depth;
    private double weight;

    protected PhysicalProduct() {
    }

    protected PhysicalProduct(PhysicalProduct original) {
        super(original);
        this.width = original.width;
        this.height = original.height;
        this.depth = original.depth;
        this.weight = original.weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
