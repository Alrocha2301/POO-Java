package oo.composicao.umpraum;

public class Carro {

    Motor motor;

    public Carro() {
        this.motor = new Motor(this);
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

    void acelerar() {
        if (motor.ligado) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao < 0.5) {
            motor.ligado = false;
        } else {
            motor.fatorInjecao -= 0.4;
        }
    }
}
