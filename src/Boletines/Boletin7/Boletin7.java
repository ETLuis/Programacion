package boletin7;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Boletin7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 ;

        System.out.println("Introduce un numero");
        num1 = sc.nextInt();

        if (num1>=0){
            JOptionPane.showMessageDialog(null,num1 +" e positivo" );

        }

        else if(num1 < 0){
            JOptionPane.showMessageDialog(null,"negativo" );
        }




    }


    public short exercicio2(){
        short numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor del numero1");
        numero1 = sc.nextShort();
        return numero1;


    }






}
