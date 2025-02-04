package edu.unisabana.pizzafactory;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Preparando pizza con masa gruesa:");
        PreparadorPizza pizzaMasaGruesa = new PreparadorPizza(new MasaPanFactory());
        pizzaMasaGruesa.prepararPizza();

        System.out.println("\nPreparando pizza con masa integral:");
        PreparadorPizza pizzaMasaIntegral = new PreparadorPizza(new MasaIntegralFactory());
        pizzaMasaIntegral.prepararPizza();
    }
}


