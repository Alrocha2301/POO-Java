package oo.composicao.desafio;

public class ClienteMain {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Alexandre");
        Compra compra1 = new Compra(cliente1);

        Produto p1 = new Produto("Lápis", 1.3);
        var p2 = new Produto("Caneta", 2.5);
        var p3 = new Produto("Borracha", .8);

//        System.out.print(cliente1.compras.isEmpty());

        compra1.adicionarItem(p1, 3);
        compra1.adicionarItem(p2, 3);
        compra1.adicionarItem(p3, 1);

        System.out.printf("Valor total gasto por %s: R$ %.2f\n", cliente1.nome, cliente1.totalGasto());

        System.out.println(cliente1.mostrarProdutos(compra1));



    }
}
