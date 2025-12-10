public class ex1 {
    public static void main (String[] args) {
    
    System.out.println("Introdueix una frase:");
    String frase = Entrada.readLine(); 
    
    System.out.println("---------\n" + frase);
    
    for (int pos = 0; pos < frase.length(); pos++) {
        System.out.print(pos);
        
        if (pos != frase.length() - 1) {
            System.out.print(", ");
        }
    }
    
    System.out.println("");
    
    }
}
