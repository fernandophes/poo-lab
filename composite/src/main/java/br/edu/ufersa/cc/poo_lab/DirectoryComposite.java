package br.edu.ufersa.cc.poo_lab;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DirectoryComposite implements FileComponent {

    private final String name;
    private final List<FileComponent> children = new ArrayList<>();

    public void addComponent(final FileComponent component) {
        children.add(component);
    }

    public void removeComponent(final FileComponent component) {
        children.remove(component);
    }

    @Override
    public long getSizeInBytes() {
        return children.stream()
                .mapToLong(FileComponent::getSizeInBytes)
                .sum();
    }

    @Override
    public void printStructure(final String prefix) {
        // Imprimir nome da pasta
        System.out.println(prefix + "📁 " + name + " [" + getSizeInBytes() + " bytes]");

        // Imprimir nomes dos componentes
        children.forEach(child -> child.printStructure(prefix + "    "));
    }

}
