package boletin2;

import java.util.Scanner;


public class Boletin6 {


    public static void main(String[] args) {
        // TODO code application logic here


        Coche camion = new boletin6.Coche();

        int camionV = camion.getVelocidade();
        System.out.println("" + camionV);

        camion.acelerar(10);
        camionV = camion.getVelocidade();
        System.out.println("" + camionV);

        Scanner sc = new Scanner(System.in);

        System.out.println("La velocidad acutal del coche es" + camion.getVelocidade() + "Km/h");


        Satelite metodos = new Satelite();
        metodos.verPosicion();


    }
}
