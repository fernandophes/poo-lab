package br.edu.ufersa.cc.poo_lab.prototype.products.contracts;

public abstract class DigitalProduct extends Product {

    private String url;

    protected DigitalProduct() {
    }

    protected DigitalProduct(DigitalProduct original) {
        super(original);
        this.url = original.url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String creationDate) {
        this.url = creationDate;
    }

}
