package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private Cliente cliente;
    List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, double preco, int qtde) {
        this.adicionarItem(new Item(new Produto(nome, preco), qtde));
    }

    void adicionarItem(Produto produto, int quantidade) {
        this.adicionarItem(new Item(produto, quantidade));
    }

    void adicionarItem(Item item) {
        this.itens.add(item);
    }

    double valorCompra() {
        double total = 0;
        for (Item item: itens) {
            total += item.precoItem();
        }
        return total;
    }

    public Compra(Cliente cliente) {
        this.cliente = cliente;
        cliente.compras.add(this);
    }
}
