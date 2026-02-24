/*
 * Intro a POO - Herencia
 *
 * Sistema de Gestión de una flota de Alquiler 
 *
*/

public class Moto extends Vehiculo {
    
    public Moto(String marca, String modelo, double precioBase, int cilindrada) {
    
        super(marca, modelo, precioBase);
        
        this.cilindrada = cilindrada;
    }
    
    private int cilindrada;
    
    public double calcularAlquiler(int dias) {
        
        double precioMoto = super.calcularAlquiler(dias);
        
        if (cilindrada>125) return precioMoto + 10;
        
        else return precioMoto;
    }
}
