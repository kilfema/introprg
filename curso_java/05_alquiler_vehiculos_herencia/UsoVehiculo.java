/*
 * Intro a POO - Herencia
 *
 * Sistema de Gestión de una flota de Alquiler 
 *
*/
public class UsoVehiculo {
    public static void main(String[] args) {
    
    Coche miCoche1 = new Coche("Seat", "Ibiza", 25, true);
    
    Moto miMoto1 = new Moto("XWR", "Blackbolt", 20, 500);
    
    Vehiculo[] misVehiculos = new Vehiculo[] {miCoche1, miMoto1};
    
    for (Vehiculo v : misVehiculos) {
        
        System.out.println("\nDatos del vehículo: \n---------\n" + v.mostrarDatos());
        
        System.out.println("\nPrecio alquiler 7 días: " + v.calcularAlquiler(7));
    
    }
        
    }
}
