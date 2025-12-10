public class ex1 {
    public static void main (String[] args) {
    
    System.out.println("Introdueix una frase:");
    String frase = Entrada.readLine(); 
    
    String fraseMin = frase.toLowerCase();
    
    boolean teVocal = false;
    
    char caracter = 0;
    
    for (int i = 0; i < fraseMin.length(); i++) {
        
        caracter = frase.charAt(i);
        
        if (caracter == 'a' || 
            caracter == 'e' || 
            caracter == 'i' || 
            caracter == 'o' || 
            caracter == 'u') {

            teVocal = true;
        }
    
    }
    
    System.out.print("\n La frase " + frase);
    
    if (teVocal) {
        System.out.print(" conté vocal.");
    } else {
        System.out.print(" no conté vocal.");
    }

    
    }
}
