package boletín2_3;

import java.util.Scanner;



/**
 *
 * @author dam1
 */
public class Boletín2_3 {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        float euros, cambio, dollar;

        System.out.println ("Euros que quiere cambiar");
        euros = sc.nextFloat();

        System.out.println ("Introduce el valor del cambio");
        cambio = sc.nextFloat();

        dollar = euros*cambio;



        System.out.println ("Resultado del cambio=" +dollar);







    }

}