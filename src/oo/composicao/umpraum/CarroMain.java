package oo.composicao.umpraum;

public class CarroMain {
    public static void main(String[] args) {

        Carro c1 = new Carro();

        System.out.print("Está ligado? " + c1.estaLigado() + "\n");
        c1.ligar();
        System.out.print("Está ligado? " + c1.estaLigado() + "\n");

        System.out.println("Giros: " + c1.motor.giros());
        c1.acelerar();
        System.out.println("Giros: " + c1.motor.giros());

        c1.frear();
        System.out.println("Giros: " + c1.motor.giros());

        c1.frear();
        System.out.println("Giros: " + c1.motor.giros());

        c1.frear();
        System.out.println("Giros: " + c1.motor.giros());

        c1.frear();
        System.out.println("Giros: " + c1.motor.giros());

        c1.frear();
        System.out.println("Giros: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        System.out.println("Giros: " + c1.motor.giros());
        System.out.print("Está ligado? " + c1.estaLigado() + "\n");




    }
}
