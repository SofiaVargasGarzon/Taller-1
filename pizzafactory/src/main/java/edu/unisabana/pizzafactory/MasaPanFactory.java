package edu.unisabana.pizzafactory;
import edu.unisabana.pizzafactory.implementaciones.AmasadoMasaPan;
import edu.unisabana.pizzafactory.implementaciones.HorneadoMasaPan;
import edu.unisabana.pizzafactory.implementaciones.MoldeadoMasaPan;

public class MasaPanFactory implements PizzaFactory {
    @Override
    public Amasado crearAmasado() {
        return new AmasadoMasaPan();
    }

    @Override
    public Moldeado crearMoldeado() {
        return new MoldeadoMasaPan();
    }

    @Override
    public Horneado crearHorneado() {
        return new HorneadoMasaPan();
    }
}