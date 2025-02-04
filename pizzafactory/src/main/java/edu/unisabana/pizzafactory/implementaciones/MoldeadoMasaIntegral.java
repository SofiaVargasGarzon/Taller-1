package edu.unisabana.pizzafactory.implementaciones;
import edu.unisabana.pizzafactory.Moldeado;

public class MoldeadoMasaIntegral implements Moldeado {
    @Override
    public void moldear() {
        System.out.println("Moldeando con bordes delgados");
    }
}