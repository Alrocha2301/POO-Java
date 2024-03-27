package oo.pilares.heranca;

public class Monstro extends Jogador {

    public Monstro() {
        this(0, 0);
    }

    public Monstro(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }

    boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(posicaoX - oponente.posicaoX);
        int deltaY = Math.abs(posicaoY - oponente.posicaoY);

        if ((deltaY == 0 && deltaX == 1) || (deltaX == 0 && deltaY == 1)) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }
}
