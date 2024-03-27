package oo.pilares.heranca.desafio;

public class Ferrari extends Carro {

    void acelerar() {
        super.acelerar();
    }

    public Ferrari() {
        super(350);
        this.potencia = 3;
    }
}
