package edu.unisabana.pizzafactory;


public interface PizzaFactory {
    Amasado crearAmasado();
    Moldeado crearMoldeado();
    Horneado crearHorneado();
}
