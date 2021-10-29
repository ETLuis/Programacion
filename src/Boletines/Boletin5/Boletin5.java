package boletin5;

public class Boletin5 {

    public static void main(String[] args) {
        // TODO code application logic here

        consumo camion = new consumo();

        camion.setLitros(50);
        camion.setpGas(1.57f);


        consumo coche = new consumo(10,5,50,1);

        System.out.println("Consumo medio =" +coche.getconsumoMedio());
        System.out.println(coche.getLitros());
        coche.setLitros(12);
        System.out.println(coche.getLitros());
        System.out.println("velocidade media ="+coche.getvMed());


    }
}