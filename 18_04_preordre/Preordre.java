/*
 * Kilian Fernández
 * 13/02/2026
 *
 * Programa que demana un text a l’usuari i calcula la suma de tots
 * els dígits numèrics que apareixen en el text, utilitzant una
 * solució recursiva sense iteradors.
 */

 public class Preordre {
    public static void main(String[] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    text = nomesLletres(text);
    
    mostraSubcadena(text);
    
    }

    public static void mostraSubcadena(String text) {
    
    String resultat = "";
    
    // cas base
    if (text.length() == 0) return;
    if (text.length() == 1) {
    
        System.out.printf("%4d: %s%n", text.length(), text);
        return;
    }
    
    System.out.printf("%4d: %s%n", text.length(), text);
    
    String textPrimeraMeitat = text.substring(0, dividirText(text));
    
    mostraSubcadena(textPrimeraMeitat);
    
    String textSegonaMeitat = text.substring(textPrimeraMeitat.length(), text.length());
    
    mostraSubcadena(textSegonaMeitat);
    
    }

    public static int dividirText(String text) {
        
        int modul = 0;
        
        if (text.isEmpty()) return modul;
        
        if ((text.length() % 2) == 0) return text.length() / 2;        
        
        else return (int)Math.floor(text.length() / 2);
    }
    
    public static String nomesLletres(String text) {
        
        String resultat = "";
        
        for (int i=0; i<text.length(); i++) {
            
            char caracter = text.charAt(i);
            
            if (Character.isLetter(caracter)) resultat += caracter;
        }
        
        return resultat;
    }   
  }
