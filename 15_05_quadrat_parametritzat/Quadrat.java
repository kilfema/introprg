/*
 *Kilian Fernández - 9/1/2026
 * Mostra quadrat de X del tamany del valor donat a args.
 */
 
public class Quadrat {
    public static void main(String[] args) {
    
    int entrada = Integer.parseInt(args[0]);
    dibuixaQuadrat(entrada);
    }   
       
    public static void dibuixaQuadrat(int valor) {
        
        for (int col = 1; col <= valor; col++) {
            for (int lin = 1; lin <= valor; lin++) {
            System.out.print(" X");
        }
            System.out.println("");
        }
    }
    
    /*public static void dibuixaLinia(int valorLin) {
        
        for (int lin = 1; lin <= valorLin; lin++) {
            System.out.print(" X");
        }
    }*/
}
