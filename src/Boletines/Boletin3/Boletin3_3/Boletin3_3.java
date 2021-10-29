package boletín3_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billetes_100, billetes_20, billetes_5, monedas_1,resultado;

        Scanner sc= new Scanner (System.in);

        System.out.println("Introduce el número de billetes de 100€");
        billetes_100 = sc.nextInt();

        System.out.println("Introduce el número de billetes de 20€");
        billetes_20 = sc.nextInt();

        System.out.println("Introduce el número de billetes de 5€");
        billetes_5 = sc.nextInt();

        System.out.println("Introduce el número de monedas de 1€");
        monedas_1 = sc.nextInt();

        resultado = billetes_100 * 100 + billetes_20 * 20 + billetes_5 * 5 + monedas_1;

        System.out.println("La valor total del dinero es de=" +resultado);


    }

}