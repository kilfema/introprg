/*
*
* Intro a POO - Práctica de static y final (Ejercicio propuesto por Gemini)
*
* Simulación de un club de socios que gesiona las membersías
*
*/

public class Socio {
    
    // DECLARACION DE PROPIEDADAES
    private String nombre;
    
    private final int ID_SOCIO;
    
    private static int contadorSocios = 1;
    
    // CONSTRUCTOR
    public Socio(String nombre) {
    
        this.nombre = nombre;
        
        ID_SOCIO = contadorSocios++;
            
    }
    
    public String getDatos() {
        
        return "\nNombre: " + nombre + "\nID: " + ID_SOCIO;
    }
    
    public static int getTotalSocios() {
        
        return contadorSocios - 1;
    } 
    
}
