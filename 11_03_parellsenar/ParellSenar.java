/*
 * Kilian Fernández - 8/10/2025
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        //Calcula el módulo
        int comprobacionModulo = numero % 2;
        
        //Condición que comprueba si es parell o senar
        if (comprobacionModulo == 0) {
            System.out.println("El número " + numero + " és parell");
        } else {
            System.out.println("El número " + numero + " és senar");
            }
    }
}
