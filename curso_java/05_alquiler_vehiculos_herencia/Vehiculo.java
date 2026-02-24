/*
 * Intro a POO - Herencia
 *
 * Sistema de Gestión de una flota de Alquiler 
 *
*/
public class Vehiculo {
    
    public Vehiculo(String marca, String modelo, double precioBase) {
        
        this.marca=marca;
        
        this.modelo=modelo;
        
        this.precioBase=precioBase;
    }
    
    private String marca;
    private String modelo;
    private double precioBase;
    
    public String mostrarDatos() {
        
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio Base: " + precioBase;
    }
   
   public double calcularAlquiler(int dias) {
        
        return precioBase * dias;
   }
}









