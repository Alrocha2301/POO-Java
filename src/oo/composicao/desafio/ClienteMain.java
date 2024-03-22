package oo.composicao.desafio;

public class ClienteMain {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Alexandre");
        Compra compra1 = new Compra(cliente1);
        var compra2 = new Compra(cliente1);

        Produto p1 = new Produto("Lápis", 1.3);
        var p2 = new Produto("Caneta", 2.5);
        var p3 = new Produto("Borracha", .8);

//        System.out.print(cliente1.compras.isEmpty());

        compra1.adicionarItem(p1, 3);
        compra1.adicionarItem(p2, 3);
        compra1.adicionarItem(p3, 1);

        compra2.adicionarItem(p1, 9);
        compra2.adicionarItem(p2, 4);
        compra2.adicionarItem(p3, 2);


        System.out.print(cliente1.mostrarProdutos(compra1));
        System.out.printf("Valor compra 1: R$ %.2f\n", compra1.valorCompra());

        System.out.print(cliente1.mostrarProdutos(compra2));
        System.out.printf("Valor compra 2: R$ %.2f\n", compra2.valorCompra());

        System.out.printf("Valor total gasto por %s: R$ %.2f\n", cliente1.nome, cliente1.totalGasto());



    }
}
