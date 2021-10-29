package boletín3_4;

import java.io.PrintStream;
import java.util.Scanner;

public class Boletín3_4 {

    public static void main(String[] args) {

        long euros, billetes_100=100,billetes_20=20,billetes_5=5,moedas_1=1,result1,result2,result3,result4;

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la cantidad en euros");
        euros = sc.nextLong ();

        result1 = euros / billetes_100;
        result2 = euros / billetes_20;
        result3 = euros / billetes_5;
        result4 = euros / moedas_1;

        System.out.println ("O desglose en billetes de 100 é o seguinte=" +result1);
        System.out.println ("O desglose en billetes de 20 o seguinte=" +result2);
        System.out.println ("O desglose en billetes de 5 o seguinte=" +result3);
        System.out.println ("O desglose en moedas de 1 o seguinte=" +result4);

    }

}