/*
 * Kilian Fernández - 8/10/2025
 * Programa  amb ternari que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class Ternari {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        //Calcula el módulo
        int comprobacionModulo = numero % 2;
        
        String resultat = (comprobacionModulo == 0) ? "parell" : "senar";
        
        //Mostra resultat
        System.out.println("El número " + numero + " és " + resultat);
    }
}


