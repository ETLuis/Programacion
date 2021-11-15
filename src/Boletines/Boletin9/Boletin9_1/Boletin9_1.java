package Boletines.Boletin9.Boletin9_1;

import java.util.Scanner;


public class Boletin9_1 {

    public void amosarpositivos(){
        int positivo=0;
        int negativo=0;
        int cero=0;
        int contador=0;
        int num=0;

        Scanner sc = new Scanner(System.in);

        for(contador = 0; contador<10; contador++){
            System.out.println("Introduce un numero" +contador);
            num = sc.nextInt();


            if(num>0){


                System.out.println("Positivo"+positivo);
                positivo++;
            }


            else if(num<0){



                System.out.println("Negativo"+negativo);

                negativo++;
            }

            else{



                System.out.println("Cero"+cero);

                cero++;



            }

        }


        System.out.println("positivo: "+positivo+ "\nnegativo: " +negativo+ "\n cero: " +cero);



    }












}
