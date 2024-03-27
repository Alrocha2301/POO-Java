package oo.pilares.heranca;

public class Jogo {
    public static void main(String[] args) {

        var j1 = new Heroi(0, 0);
        System.out.println(j1.vida);
        var j2 = new Monstro(0, 0);
        System.out.println(j2.vida);

        j1.posicaoX = 20;
        j1.posicaoY = 19;

        j2.posicaoX = 17;
        j2.posicaoY = 19;

        j1.andar(Direcao.OESTE);
        j1.andar(Direcao.OESTE);

        System.out.println(j1.mostrarPosicao());
        System.out.println(j2.mostrarPosicao());

        j1.atacar(j2);
        j2.atacar(j1);
        j1.atacar(j2);
        j2.atacar(j1);
        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println("Vida Monstro: " + j2.vida);
        System.out.println("Vida Herói: " + j1.vida);
    }
}
