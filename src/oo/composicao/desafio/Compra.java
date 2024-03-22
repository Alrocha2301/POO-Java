package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    Cliente cliente;
    List<Item> itens = new ArrayList<>();

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
