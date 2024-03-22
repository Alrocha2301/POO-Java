package oo.composicao.umpramuitos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;
    List<Item> itens = new ArrayList<>();

    public Compra(String cliente) {
        this.cliente = cliente;
    }

    void incluirItem(String nome, int qtde, double preco) {
        this.incluirItem(new Item(nome, qtde, preco));
    }

    void incluirItem(Item item) {
        this.itens.add(item);
    }

    int quantidadeDeItens() {
        int total = 0;
        for (Item item: itens) {
            total += item.quantidade;
        }
        return total;
    }

    double valorTotalCompra() {
        double total = 0;
        for (Item item: itens) {
            total += item.preco * item.quantidade;
        }
        return total;
    }

}
