package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new ArrayList<>();

    double totalGasto() {
        double total = 0;
        for (Compra compra: compras) {
            total += compra.valorCompra();
        }
        return total;
    }

    StringBuilder mostrarProdutos(Compra compra) {
        StringBuilder texto = new StringBuilder();
        for (Item item: compra.itens) {
            texto.append(String.format("%d %s - Preço Unitário R$ %.2f - Preço Total R$ %.2f\n", item.quantidade, item.produto.nome, item.produto.preco, item.precoItem()));
        }
        return texto;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
}
