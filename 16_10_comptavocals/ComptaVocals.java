/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna cuantes vocals minuscules té.
 */
 
public class ComptaVocals {
    public static void main(String[] args) {
        
    System.out.println("Text?");
    
    System.out.println(
        numVocalsMinuscules(
            Entrada.readLine()
        )
    ); 
    }
    
    public static int numVocalsMinuscules(String text) {
    int comptador = 0;
       
    for (int i = 0; i < text.length(); i++) {
        char caracter = Character.toLowerCase(text.charAt(i));
        
        if (UtilString.esVocal(caracter)) comptador++;
    }
    
    return comptador;
    }   
}
