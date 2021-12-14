package Boletines.Boletin12;

public class Garaxe {
}


public class Garaxe {

    Boletin12 obxCoche=new Boletin12();

    private final int capacidade=5;
    private int numCoches;
    private final float prezoTempo=0.20f;
    private final float prezo=1.5f;
    private float prezoFinal;
    private float cartosDevoltos;
    private float cartosRecibidos;
    private String matricula;


    public void registro(){

        numCoches=numCoches();
        if(numCoches<capacidade){
            numCoches++;
            JOptionPane.showMessageDialog(null,"PLAZAS DISPOÑIBLES");
            matricula=obxCoche.lerMatricula();}
        int tempo= Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de minutos"))
        if(tempo>0&&tempo<=180){
            prezoFinal=prezo;
        } else if(tempo-180)/60{
            prezoFinal=(prezo)+(prezoTempo*tempoExtra)

            cartosRecibidos=Float.parseFloat(JOptionPane.showInputDialog("precio "+ pre<oFinal + ""))
            cartosDevoltos=(float)(cartosRecibidos-prezoFinal);
            JOptionPane.showMessageDialog(null,"MATRICULA " + matricula "\nTEMPO" + tempo + "\nPRECIO" + prezoFinal + "CARTOS RECIBIDOS")}

    else{

            JOptionPane.showMessageDialog(null,"AFORO COMPLETO")}




    }

    private int numCoches() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}