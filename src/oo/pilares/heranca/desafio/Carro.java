package oo.pilares.heranca.desafio;

public class Carro {

    int potencia;
    final int VELOCIDADE_MAXIMA;
    int velocidade;
    boolean ligado = false;

    void ligar() {
        this.ligado = true;
    }

    void acelerar() {
        if (ligado) {
            if (velocidade + 5 < this.VELOCIDADE_MAXIMA) {
                this.velocidade += 5 * potencia;
            } else {
                this.velocidade = this.VELOCIDADE_MAXIMA;
            }
        } else {
            System.out.println("Carro está desligado!");
        }
    }

    void frear() {
        if (velocidade >= 5) {
            this.velocidade -= 5;
        } else if (ligado) {
            this.velocidade = 0;
            this.ligado = false;
        }
    }

    public Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }
}
