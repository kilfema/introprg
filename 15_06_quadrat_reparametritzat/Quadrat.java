/*
 *Kilian Fernández - 9/1/2026
 * Mostra quadrat de X del tamany del valor donat a args.
 */
 
public class Quadrat {
    public static void main(String[] args) {
    
    int num = Integer.parseInt(args[0]);
    char lletra = args[1].charAt(0);
    
    if (num < 1) return;
    
    dibuixaQuadrat(num, lletra);
    }   
       
    public static void dibuixaQuadrat(int valor, char lletra) {
        
        for (int col = 1; col <= valor; col++) {
            for (int lin = 1; lin <= valor; lin++) {
            System.out.print(" " + lletra);
        }
            System.out.println("");
        }
    }    
}
