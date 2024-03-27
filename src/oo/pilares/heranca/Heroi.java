package oo.pilares.heranca;

public class Heroi extends Jogador{

    public Heroi(int x, int y) {
        super(x, y);
    }

    boolean atacar(Jogador oponente) {

        super.atacar(oponente);
        super.atacar(oponente);

        return true;
    }
}
