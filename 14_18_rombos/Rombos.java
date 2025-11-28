/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa demana un número enter positiu n i retorna el dibuix d'un rombo n vegades.
 */
 
public class Rombos {
    public static void main(String[] args) {
        
    
    System.out.println("quants?");
    int v = Integer.parseInt(Entrada.readLine());
    
    if (v >= 1) {
        
        //bucle que imprimeix n triangles
        for (int i = 1; i <= v; i++) {
        
        //bucle que controla cada línia del triangle superior que conforma el rombo. arriba fins a 10
        for (int line = 1; line <= 10; line++) {
            
            //bucle pels punts inicials
            for (int j = 9 - line + 1; j >= 1; j--) {
                System.out.print(".");
            }
            
            //bucle per numeració banda esquerra
            for (int k = 9 - line + 1; k <=9; k++) {
                System.out.print(k);
            }
            
            //bucle per numeració banda dreta
            for (int y = 8; y >= 9 - line + 1; y--) {
                System.out.print(y);
            }
            
            //bucle pels punts finals de la linia
            for (int z = 9 - line + 1; z >= 1; z --) {
                System.out.print(".");
            }
         
         
        System.out.println("");
        }
        
        //triangle inferior que conforma el rombo. controla cada linia fins arribar a la novena
        for (int line = 1; line <= 9; line++) {
        
            for (int w = 1; w <= line; w++) {
                System.out.print(".");
            }
            
            for (int t = 1 + line - 1 ; t <= 9; t++ ) {
                System.out.print(t);
            }
            
            for (int r = 8; r >= line; r--) {
                System.out.print(r);
            }
            
            for (int x = 1; x <= line; x++) {
                System.out.print(".");
            }
            
        System.out.println("");
        }
            
        
        }
    }  
    
    }
}
