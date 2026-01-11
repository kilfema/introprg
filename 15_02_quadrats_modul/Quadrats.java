/*
 *Kilian Fernández - 9/1/2026
 * Programa que demana un número enter. Dibuixa tants quadrats com s'hagi indicat.
 */
 
public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrats();    
    }
    
    public static void dibuixaQuadrats() {
    
    System.out.println("Quants?");
    int quadrats = Integer.parseInt(Entrada.readLine());
    
    if (quadrats < 1) return;
    
    for (int i = 0; i < quadrats; i++) {
        
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(" X");
            }
            System.out.println("");
        }
    System.out.println("");
    }   
    }
}
