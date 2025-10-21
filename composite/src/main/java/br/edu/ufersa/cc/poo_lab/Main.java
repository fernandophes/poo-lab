package br.edu.ufersa.cc.poo_lab;

import lombok.val;

public class Main {

    public static void main(String[] args) {

        // 1. Criação das folhas (arquivos)
        val readme = new FileLeaf("README.md", 500);
        val photo1 = new FileLeaf("photo_a.jpg", 15000);
        val photo2 = new FileLeaf("photo_b.jpg", 25000);
        val serverLog = new FileLeaf("server.log", 1000000);
        val presentation = new FileLeaf("composite.pptx", 250000);

        // 2. Criação dos compostos (diretórios)
        val imagesDir = new DirectoryComposite("Imagens");
        val logsDir = new DirectoryComposite("Logs");
        val rootDir = new DirectoryComposite("Raiz");
        val presentationsDir = new DirectoryComposite("Apresentações");

        // 3. Montagem da Estrutura de Arquivos

        // Adicionando fotos ao diretório 'Imagens'
        imagesDir.addComponent(photo1);
        imagesDir.addComponent(photo2);

        // Adicionando log ao diretório 'Logs'
        logsDir.addComponent(serverLog);

        // Adicionando composite.pptx ao diretório Apresentações
        presentationsDir.addComponent(presentation);

        // Montando o diretório raiz
        rootDir.addComponent(imagesDir);
        rootDir.addComponent(readme);
        rootDir.addComponent(logsDir);
        rootDir.addComponent(presentationsDir);

        // 4. Demonstração
        System.out.println();
        System.out.println("--- Estrutura do Sistema de Arquivos ---");
        rootDir.printStructure("");
        System.out.println("---------------------------------------");

        // Exemplo 1: Tamanho de uma Folha (Arquivo)
        // O cliente chama getSizeInBytes() em um objeto Leaf.
        System.out.println("\nTamanho do README.md: " + readme.getSizeInBytes() + " bytes");

        // Exemplo 2: Tamanho de um Composto (Diretório)
        // O cliente chama getSizeInBytes() no objeto Composite.
        // O DirectoryComposite calcula o tamanho recursivamente.
        val totalRootSize = rootDir.getSizeInBytes();
        System.out.println("Tamanho TOTAL da pasta Raiz: " + totalRootSize + " bytes");
    }

}
