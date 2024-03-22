package oo.composicao.umpramuitos;

public class CompraMain {
    public static void main(String[] args) {

        Compra compra1 = new Compra("Cliente Um");
        compra1.incluirItem("Celular", 2, 998);
        compra1.incluirItem("Capinha", 1, 30);

        System.out.printf("Valor total da compra de %s: R$ %.2f", compra1.cliente, compra1.valorTotalCompra());

        System.out.printf("\nQuantidade de itens da compra de %s: %d", compra1.cliente, compra1.quantidadeDeItens());
    }

}
