/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna amb: vocals en minúscula, no vocals en majúscula, nombres
 * entre parèntesi i treient la resta de caràcters que no són espais
 */
 
public class ComptaVocals {
    public static void main(String[] args) {
        
    System.out.println("Text?");    
    System.out.println(
                transformaText(
                    Entrada.readLine()
                )
    );   
    }
    
    public class String transformaText(String text) {
    
    String resultat = "";
    text = text.toLowerCase();
    
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i); 
        
        if ()
    }
    
    return resultat;
    }   
}
