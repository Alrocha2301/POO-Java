package desafio;

import java.util.ArrayList;
import java.util.List;

public class Tag {

    String nome;
    List<Palavra> listaPalavras = new ArrayList<>();

    Tag adicionarPalavra(Palavra palavra) {
        this.listaPalavras.add(palavra);
        palavra.listaTag.add(this);

        return this;
    }

    void exibirPalavras() {
        for (Palavra palavra: listaPalavras) {
            System.out.println(palavra.nome);
        }
    }

    public Tag(String nome) {
        this.nome = nome;
    }
}
