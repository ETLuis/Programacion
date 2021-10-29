package boletín3_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio_tarifa,precio_pagado,porcentaje;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce precio_tarifa");
        precio_tarifa = sc.nextFloat();

        System.out.println("Introduce precio_pagado");
        precio_pagado= sc.nextFloat();

        porcentaje = precio_pagado*precio_tarifa/100;

        System.out.println("El porcentaje de la compra es del="+porcentaje);



    }

}