/*
 *Kilian Fernández - 28/10/2025
 * 
 */
 
public class Parentitza {
    public static void main(String[] args) {
        
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    char caracter = 0;
    
    for (int pos = 0; pos < text.length(); pos++) {
        
        caracter = text.charAt(pos);
        
        if (Character.isLetter(caracter)) {
            System.out.print("(" + caracter + ")");
        } else {
            System.out.print(caracter);
        }
    }
        
    }
}
