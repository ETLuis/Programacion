package boletin9_3;

import java.util.Scanner;


public class Boletin9_3 {


    public static void main(String[] args) {
        // TODO code application logic here
        int base;
        int altura;
        int Area;

        Scanner sc = new Scanner(System.in);
        System.out.println("base =");
        base = sc.nextInt();
        System.out.println("altura =");
        altura = sc.nextInt();

        Area = base * altura;
        System.out.println("O resultado é: " +Area);

    }

}
