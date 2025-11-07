package br.edu.ufersa.cc.poo_lab;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FileLeaf implements FileComponent {

    private final String name;
    private final long sizeInBytes;

    @Override
    public long getSizeInBytes() {
        return sizeInBytes;
    }

    @Override
    public void printStructure(final String prefix) {
        System.out.println(prefix + "📄 " + name + " (" + sizeInBytes + " bytes)");
    }

}
