package boletín2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín2_4 {

    public static void main(String[] args) {

        float num1,num2,suma,resta,producto,cociente;
        Scanner sc = new Scanner (System.in);

        System.out.println("Primer número");
        num1 = sc.nextFloat();

        System.out.println("Segundo número");
        num2 = sc.nextFloat();

        suma = num1+num2;
        System.out.println("Suma=" +suma);

        resta = num1-num2;
        System.out.println ("Resta="+resta);

        producto=num1*num2;
        System.out.println("Producto=" +producto);

        cociente= num1/num2;
        System.out.println("Cociente="+cociente);






    }

}