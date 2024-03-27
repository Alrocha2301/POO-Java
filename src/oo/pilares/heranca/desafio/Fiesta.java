package oo.pilares.heranca.desafio;

public class Fiesta extends Carro {

    public Fiesta() {
        super(220);
        this.potencia = 1;
    }

    void acelerar() {
        for (int i = 0; i < potencia; i++) {
            super.acelerar();
        }
    }
}
