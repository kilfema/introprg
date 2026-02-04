/*
* Intro POO - Ejercicio propuesto por Gemini para practicar los conceptos dados hasta la fecha
*
* Objetivo: Crear un programa modular que gestione el saldo de una cuenta bancaria, aplicando
* encapsulamiento, constructores y lógica de negocio en los métodos (Getters/Setters).
*/

public class CuentaCorriente {
    
    private String titular;
    private double saldo;
    
    // Constructor
    public CuentaCorriente(String nombre) {
        
        titular = nombre; 
        saldo = 0;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo () {
    
        return saldo;
    }
    
    public boolean ingresar(String cantidad) {
        
        for (int i=0; i<cantidad.length(); i++) {
            char caracter = cantidad.charAt(i);
            
            if (!Character.isDigit(caracter) || caracter == '.') return false;
        }
        
        double cantidadDecimal = Double.parseDouble(cantidad);
        
        if (cantidadDecimal < 0) return false;
        
        saldo += cantidadDecimal;
               
        return true;
    }
    
    public boolean retirar(String cantidad) {
        
        for (int i=0; i<cantidad.length(); i++) {
            char caracter = cantidad.charAt(i);
            
            if (!Character.isDigit(caracter) || caracter == '.') return false;
        }
        
        double cantidadDecimal = Double.parseDouble(cantidad);
        
        if (cantidadDecimal > saldo) return false;
        
        saldo -= cantidadDecimal;
               
        return true;
    }
}
