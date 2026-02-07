/**
* 
* Introducción a POO - Modularización, encapsulamiento y constructores. Uso de getter, setter y this. 
*
* ESto es un programa de ejemplo para practicar la sintaxis y estructura.
*/


public class Agente {

    // DECLARACIÓN DE PROPIEDADES
    private double version;
    private String nombre;
    
    // CONSTRUCTOR, ASIGNACIÓN DE VALOR INICIAL
    public Agente(String nombre) {
        
        version = 0.1;
        
        this.nombre = nombre;
    }
    
    public String getInfoAgente() {

        return "\nAgente " + nombre + "\n Versión: " + version;
    }
    
    public void setVersion() {
    
        version+= 0.1;   
    }
}
