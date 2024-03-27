package oo.pilares.heranca;

public class Jogador {

    int vida = 100;
    int posicaoX = 0;
    int posicaoY = 0;

    public Jogador(int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    boolean andar(Direcao direcao) {
        int novoX = this.posicaoX;
        int novoY = this.posicaoY;

        switch (direcao) {
            case NORTE -> novoY++;
            case SUL -> novoY--;
            case LESTE -> novoX++;
            case OESTE -> novoX--;
        }

        if (novoY > 20 || novoY < 0 || novoX > 20 || novoX < 0) {
            return false;
        }

        this.posicaoX = novoX;
        this.posicaoY = novoY;
        return true;

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

    String mostrarPosicao() {
        return String.format("(%d, %d)", this.posicaoX, this.posicaoY);
    }
}
