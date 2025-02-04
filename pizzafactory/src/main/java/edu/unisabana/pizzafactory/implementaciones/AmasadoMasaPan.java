package edu.unisabana.pizzafactory.implementaciones;
import edu.unisabana.pizzafactory.Amasado;

public class AmasadoMasaPan implements Amasado {
    @Override
    public void amasar() {
        System.out.println("Amasando masa gruesa");
    }
}
