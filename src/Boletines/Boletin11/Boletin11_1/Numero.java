package boletin11;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Numero {

    public int Num1(){

        Scanner sc = new Scanner(System.in);


        int num = Integer.parseInt( JOptionPane.showInputDialog(null, "teclea un numero"));
        int num1 = Integer.parseInt( JOptionPane.showInputDialog(null, "teclea un numero"));

        for(int contador = 1; contador<=50;contador++){


            if(num==num1){
                JOptionPane.showMessageDialog(null, num+ " É o número");
                JOptionPane.showMessageDialog(null, " Fin do programa");
                break;

            }

            else if(num>num1){
                JOptionPane.showMessageDialog(null, " O número é maior");
                num1 = Integer.parseInt( JOptionPane.showInputDialog(null, "teclea un numero"));
                contador++;
            }

            else{
                JOptionPane.showMessageDialog(null, " O numero é menor");
                num1 = Integer.parseInt( JOptionPane.showInputDialog(null, "teclea un numero"));
                contador++;

            }




        }




        return 0;



    }


}
