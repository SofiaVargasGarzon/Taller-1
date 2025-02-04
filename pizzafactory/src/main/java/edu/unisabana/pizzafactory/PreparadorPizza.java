package edu.unisabana.pizzafactory;


public class PreparadorPizza {
    private final PizzaFactory fabricaPizza;

    public PreparadorPizza(PizzaFactory pizzaFactory) {
        this.fabricaPizza = pizzaFactory;
    }

    public void prepararPizza() {
        fabricaPizza.crearAmasado().amasar();
        fabricaPizza.crearMoldeado().moldear();
        fabricaPizza.crearHorneado().hornear();
        System.out.println("Pizza lista para servir.");
    }
}

