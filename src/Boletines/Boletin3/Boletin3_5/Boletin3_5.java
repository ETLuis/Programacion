ppackage boletín3_4;

import java.util.Scanner;

public class Boletín3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float soldo_fixo,comision,quilometraxe,dietas,soldo_bruto;

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce o teu soldo fixo");
        soldo_fixo = sc.nextFloat();

        System.out.println("Introduce a comisión correspondente ao teu soldo");
        comision = sc.nextFloat();

        System.out.println("Introduce a quilometraxe");
        quilometraxe = sc.nextFloat();

        System.out.println("Introduce as dietas");
        dietas = sc.nextFloat();

        soldo_bruto = soldo_fixo * comision/100 - 2 * quilometraxe - 30 * dietas;

        System.out.println("O teu soldo bruto é de =" +soldo_bruto);







    }

}