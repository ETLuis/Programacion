package boletin6;

public class Coche {
    private int velocidade;



    public Coche(){
        velocidade = 0;
    }


    public int getVelocidade(){
        return velocidade;
    }

    public void acelerar (int algo){
        this.velocidade = velocidade + algo;

    }

    public void frenar (int menos){
        this.velocidade = velocidade - menos;

    }





}