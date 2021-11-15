package boletin9_4;

import java.util.Scanner;


public class Boletin9_4 {

    public static void main(String[] args) {
        // TODO code application logic here

        int num;
        int contador=0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Dame o numero: ");
        num = sc.nextInt();

        for(contador = num; contador<=10; contador++){

            if(contador>=10){


                System.out.println(num + "x" + contador + "=" +contador*num );


            }



        }






    }

}
