/**
* 
* Introducción a POO - Modularización, encapsulamiento y constructores. Uso de getter, setter y this. 
*
* ESto es un programa de ejemplo para practicar la sintaxis y estructura.
*/


public class Agente {

    // DECLARACIÓN DE PROPIEDADES
    private double version;
    private int tokensDisponibles;
    private String dispositivo;
    private String nombre;
    
    // CONSTRUCTOR, ASIGNACIÓN DE VALOR INICIAL
    public Agente() {
        
        version = 0.1;
        
        tokensDisponibles = 5000;
        
        dispositivo = "portátil";
        
        nombre = "Nox";
    }
    
    /* FUNCIONES, DENTRO DE SETTER Y GETTER
    *
    *   Setter --> dar o modificar el valor de una variable (input). Casi siempre es void
    *
    *   Getter --> obtener o leer el valor de una variable. Tiene return (output)
    *
    */
    
    public String mostrarDatosGenerales() {
        
        return "\nINFORMACIÓN GENERAL DEL AGENTE:\n" +
        "\n - Nombre: " + nombre +
        "\n - Versión: " + version + 
        "\n - Dispositivo de uso: " + dispositivo;
    }
    
    
    public void setNombre(String nombre) {
        
        
        if (nombre.length() > 12) System.out.println("\n----ERROR\nMáximo 12 carácteres");
        
        else {
        
            this.nombre = nombre;
            System.out.println("Nombre cambiado con éxito\n");     
        } 
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String enviarMail(String correo, String asunto) {
        
        return "Mensaje enviado a " + correo + " con el asunto: " + asunto;
        
    }

