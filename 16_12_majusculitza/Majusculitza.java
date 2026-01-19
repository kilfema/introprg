/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna amb el caracter inicial de cada paraula en majuscula, i la resta en minúscula.
 */
 
public class Majusculitza {
    public static void main(String[] args) {
        
    System.out.println("Text?");    
    System.out.println(
                Majusculitza(
                    Entrada.readLine().toLowerCase()
                )
    );   
    }
    
    public static String Majusculitza(String text) {
    
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
    
        char caracter = text.charAt(i);
    
        if (Character.isLetter(caracter)) {
        
            if (i == 0 ||
                !Character.isLetter(text.charAt(i - 1))) {
                
                resultat += Character.toUpperCase(caracter);
                continue;
            }    
        }
    resultat += caracter;             
    }
    
    return resultat;
    }   
}
