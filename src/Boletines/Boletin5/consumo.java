
public consumo (float km, float litros,float vMed,float pGas){

        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;

        }

        float getTempo (){
        float tempo = km/vMed;
        return tempo;
        }

public float getconsumoMedio(){
        float consumoMedio = litros/km*100;
        return consumoMedio;
        }

public float getvMed(){
        return vMed;
        }

public float getEuros(){
        float Euros = km*pGas;
        return Euros;

        }

public void setKm (float km1){
        km = km1;
        }


public void setLitros(float lit1){
        litros = lit1;

        }

public float getLitros(){
        return litros;
        }
public void setgetvMed (float vMed1){
        vMed = vMed1;
        }


public void setpGas (float pGas1){
        pGas = pGas1;
        }


        }