package boletin4;

import java.util.Scanner;

public class Boletin4 {


    public static void main(String[] args) {

        String titulo, autor ;
        int ano;
        short numPaginas = 0;
        float valoracion;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un titulo :");
        titulo = sc.nextLine();
        System.out.println("titulo "+titulo);

        System.out.println("Introduce un autor :");
        autor = sc.nextLine();
        System.out.println("autor ");

        System.out.println("Introduce un ano :");
        ano = sc.nextInt();
        System.out.println("ano");

        System.out.println("Introduce un numPaginas :");
        numPaginas = sc.nextShort();
        System.out.println("numPaginas");


        Libro libro1 = new Libro ();

        //Le puedes pasar el valor directamente sin nada (como en Hola)
        Libro libro2 = new Libro ("Hola", autor, ano, numPaginas);

        //Me muestra todo
        libro1.amosar();


        libro2.amosar();











    }

}
