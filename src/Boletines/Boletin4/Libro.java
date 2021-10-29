}

public String getTitulo (){

        return titulo;


        }

public void setTitulo (String nom1){
        titulo = nom1;

        }

public String getautor (){
        return autor;
        }

public void setautor (String nom2){
        autor = nom2;

        }

public int getano (){
        return ano;

        }

public void setano (int nom3){
        ano = nom3;
        }

public short getnumPaginas (){
        return numPaginas;
        }

public void setnumPaginas (short nom4){
        numPaginas = nom4;
        }


public void amosar (){
        //Con el \n me da una linea en blanco
        System.out.println("\n titulo : "+ titulo);
        System.out.println("\n autor"+autor);
        System.out.println("\n numPaginas :"+numPaginas);
        System.out.println("\n valoracion:"+valoracion);
        }



        }