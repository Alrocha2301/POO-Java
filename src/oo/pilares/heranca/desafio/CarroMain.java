package oo.pilares.heranca.desafio;

public class CarroMain {

    public static void main(String[] args) {

        Carro c1 = new Fiesta();
        c1.velocidade = 187;

        c1.acelerar();

        c1.ligar();
        System.out.println("Velocidade atual: " + c1.velocidade);

        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);

        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);

        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);

        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);
        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);
        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);
        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);
        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);
        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);
        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.velocidade);

        c1.frear();
        System.out.println("Velocidade atual: " + c1.velocidade);

        Carro c2 = new Ferrari();

        c2.acelerar();

        c2.ligar();
        System.out.println("Velocidade atual: " + c2.velocidade);

        c2.acelerar();
        System.out.println("Velocidade atual: " + c2.velocidade);

        c2.frear();
        System.out.println("Velocidade atual: " + c2.velocidade);

        System.out.println(c2.ligado);

    }
}
