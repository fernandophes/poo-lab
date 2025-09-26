package br.edu.ufersa.cc.poo_lab.prototype;

import br.edu.ufersa.cc.poo_lab.prototype.products.Music;
import br.edu.ufersa.cc.poo_lab.prototype.products.Phone;

public class App {

    public static void main(String[] args) {
        final var original = new Phone();
        original.setBrand("Apple");
        original.setModel("iPhone 16");
        original.setOs("iOS 18");
        original.setScreenSize(6.1);
        original.setHeight(147.6);
        original.setWidth(71.6);
        original.setDepth(0.78);
        original.setWeight(0.17);
        original.setName("Apple iPhone 16");
        original.setDescription("Apple iPhone 16");
        original.setPrice(4700.00);

        final var copy = original.copy();

        System.out.println();
        System.out.println(original);

        System.out.println();
        System.out.println(copy);

        final var originalMusic = new Music();
        originalMusic.setName("Música");
        originalMusic.setDescription("Música");
        originalMusic.setUrl("www.spotify.com/music-tal");
        originalMusic.setPrice(15.00);
        originalMusic.setTitle("Título da Música");
        originalMusic.setArtist("Banda Tal");

        System.out.println();
        System.out.println(originalMusic);

        final var musicCopy = originalMusic.copy();

        System.out.println();
        System.out.println(musicCopy);

    }
}
