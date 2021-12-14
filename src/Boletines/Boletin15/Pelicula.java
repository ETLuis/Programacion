package Boletines.Boletin15;

public class Pelicula extends Multimedia{

    private String actorPrincipal;
    private String actrizPrincipal;

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }


    @Override
    public String toString() {
        return "Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }




}