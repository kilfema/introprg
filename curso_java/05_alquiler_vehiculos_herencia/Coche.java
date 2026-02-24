/*
 * Intro a POO - Herencia
 *
 * Sistema de Gestión de una flota de Alquiler 
 *
*/
public class Coche extends Vehiculo {

    public Coche(String marca, String modelo, double precioBase, boolean tieneGps) {
        
        super(marca, modelo, precioBase);
        
        this.tieneGps=tieneGps;
    }
    
    private boolean tieneGps;
    
    public double calcularAlquiler(int dias) {
        
        double precioCoche=super.calcularAlquiler(dias);
        
        double extraGps = 5 * dias;
        
        if (tieneGps) return precioCoche + extraGps;
        
        else return precioCoche;
    }
}


