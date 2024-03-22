package desafio;

import java.util.ArrayList;
import java.util.List;

public class Palavra {

    String nome;
    List<Tag> listaTag = new ArrayList<>();

    Palavra adicionarTag(Tag tag) {
        this.listaTag.add(tag);
        tag.listaPalavras.add(this);

        return this;
    }

    void exibirTags() {
        for (Tag tag: listaTag) {
            System.out.println(tag.nome);
        }
    }

    public Palavra(String nome) {
        this.nome = nome;
    }
}
