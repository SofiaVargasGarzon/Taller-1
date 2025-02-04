package edu.unisabana.pizzafactory;
import edu.unisabana.pizzafactory.implementaciones.AmasadoMasaIntegral;
import edu.unisabana.pizzafactory.implementaciones.HorneadoMasaIntegral;
import edu.unisabana.pizzafactory.implementaciones.MoldeadoMasaIntegral;

public class MasaIntegralFactory implements PizzaFactory {
    @Override
    public Amasado crearAmasado() {
        return new AmasadoMasaIntegral();
    }

    @Override
    public Moldeado crearMoldeado() {
        return new MoldeadoMasaIntegral();
    }

    @Override
    public Horneado crearHorneado() {
        return new HorneadoMasaIntegral();
    }
}
