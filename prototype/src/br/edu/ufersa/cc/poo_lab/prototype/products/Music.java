package br.edu.ufersa.cc.poo_lab.prototype.products;

import br.edu.ufersa.cc.poo_lab.prototype.products.contracts.DigitalProduct;
import br.edu.ufersa.cc.poo_lab.prototype.products.contracts.Product;

public class Music extends DigitalProduct {

    private String title;
    private String artist;

    public Music() {
    }

    protected Music(final Music original) {
        super(original);
        this.title = original.title;
        this.artist = original.artist;
    }

    @Override
    public Product copy() {
        return new Music(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMusic [title=" + title + ", artist=" + artist + ", getUrl()=" + getUrl() + ", getName()=" + getName()
                + ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getArtist()="
                + getArtist() + ", getPrice()=" + getPrice() + "]";
    }

}
