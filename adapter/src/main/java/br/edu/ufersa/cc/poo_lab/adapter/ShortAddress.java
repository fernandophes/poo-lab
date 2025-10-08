package br.edu.ufersa.cc.poo_lab.adapter;

public class ShortAddress {

    private String zip;
    private String number;
    private String complement;
    private String reference;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "PocketAddress [zip=" + zip + ", number=" + number + ", complement=" + complement + ", reference="
                + reference + "]";
    }

}
