package edu.unisabana.pizzafactory.implementaciones;
import edu.unisabana.pizzafactory.Horneado;

public class HorneadoMasaIntegral implements Horneado {
    @Override
    public void hornear() {
        System.out.println("Horneando a temperatura media");
    }
}