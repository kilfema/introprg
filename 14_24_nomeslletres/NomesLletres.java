/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text a l’usuari i imprimeix únicament les lletres que conté, mantenint-ne l’ordre original i separant cada lletra amb una coma. La resta de caràcters (espais, números, signes de puntuació, etc.) s’ignoren.
 */
 
public class NomesLletres {
    public static void main(String[] args) {
        
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    char caracter = 0;
    
    boolean esPrimeraLletra = true;
    
    for (int i = 0; i < text.length(); i++) {
        
        caracter = text.charAt(i);
        
        if (Character.isLetter(caracter)) {
            
            if (esPrimeraLletra) {
                System.out.print(caracter);
                esPrimeraLletra = false;
                
            } else {
                System.out.print(", " + caracter);
            }
            
        }       
    }
    
    System.out.println("");
        
    }
}
