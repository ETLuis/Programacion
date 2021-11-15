package boletin9_2;

import java.util.Scanner;


public class Suma {

    public int Suma1(){
        int contador=10;
        int resultado=0;



        Scanner sc = new Scanner(System.in);

        for(contador = 10; contador<=90; contador++){

            if(contador>=10){


                resultado= resultado + contador;
                System.out.println("Seguimos sumando = " +resultado);
            }


            else if(contador==90){


                System.out.println("Resultado"+contador);

                contador++;

            }
        }
        return 0;
    }

    public int Suma2(){
        double contador=0;
        double resultado=10;
        double producto=1;


        for(contador = 10; contador<=90; contador++){

            if(contador>=10){


                resultado= resultado * contador;

                System.out.println("Seguimos multiplicando = " +resultado);
            }


            else if(contador==90){


                System.out.println("Resultado"+contador);

                contador++;

            }

        }
        return 0;


    }
}
