package desafio;

public class DesafioMain {
    public static void main(String[] args) {

        var p1 = new Palavra("Camiseta");
        var p2 = new Palavra("Calça");

        var t1 = new Tag("Preto");
        var t2 = new Tag("vermelho");
        var t3 = new Tag("Amarelo");

        p1.adicionarTag(t1).adicionarTag(t2);
        p2.adicionarTag(t2).adicionarTag(t3);

        t2.exibirPalavras();

        t3.adicionarPalavra(p1);

        t3.exibirPalavras();

        p1.exibirTags();
    }
}
