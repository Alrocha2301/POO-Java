package oo.composicao.desafio;

public class Item {

    Produto produto;
    int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    double precoItem() {
        return (this.quantidade * this.produto.preco);
    }
}
