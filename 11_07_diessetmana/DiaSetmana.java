/*
 * Kilian Fernández - 8/10/2025
 * Aquest programa distingueix quin dia de la setmana és quan l'usuari indica un número
 */
 
public class DiaSetmana {
    public static void main(String[] args) {
        
        //número que indica l'usuari
        int numero = Integer.parseInt(args[0]);
        
        //condicionals
        if (numero == 1) {
            System.out.println("Dilluns");
        
        } else if (numero == 2) {
            System.out.println("Dimarts");
            
        } else if (numero == 3) {
            System.out.println("Dimecres");
            
        } else if (numero == 4) {
            System.out.println("Dijous");
            
        } else if (numero == 5) {
            System.out.println("Divendres");
            
        } else if (numero == 6) {
            System.out.println("Dissabte");
            
        } else if (numero == 7) {
            System.out.println("Dimarts");
            
        } else {
            System.out.println("Error");
        }
        
    }
}
