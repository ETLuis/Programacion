package boletin3_2;

import java.util.Scanner;


public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double grados_centígrados,grados_kelvin,grados_fahrenheit;
        final float const1 = 1.8f,const2 = 32;

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la temperatura en grados centígrados");
        grados_centígrados = sc.nextFloat();

        grados_kelvin = grados_centígrados + 273;

        System.out.println("Resultado en grados Kelvin =" +grados_kelvin);

        grados_fahrenheit = grados_centígrados * const1 + const2;

        System.out.println("Resultado en grados Fahrenheit =" +grados_fahrenheit);


    }

}