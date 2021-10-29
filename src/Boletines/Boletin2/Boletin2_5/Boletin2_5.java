package boletín2_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín2_5 {



    public static void main(String[] args) {
        float millas_mariñas,metros;
        final float milla_metro= 1852;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce millas");
        millas_mariñas = sc.nextFloat();


        metros= millas_mariñas*milla_metro;


        System.out.println("Resultado pasado a metros="+metros);





    }

}