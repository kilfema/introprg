/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa demana un enter entre 1 i 9 i imprimeix un triangle numèric creixent.
*Per a cada línia, mostra els nombres des del valor de la línia fins a 1.
*Si l’entrada no és vàlida, mostra el missatge “Valor inadequat”.
 */
public class TriangleNombres {
    public static void main(String[] args) {
        
    
    System.out.println("Valor final?");
    int v = Integer.parseInt(Entrada.readLine());
        
        if (v < 1 || v > 9) {
        System.out.println("Valor inadequat");
        
        } else {
        for (int fila = 1; fila <= v; fila++) {   
            for (int columna = 1; columna <= v; columna++) {
            System.out.print(" " + columna);
            }  
        System.out.println();                   
        }
        }
           
    }
}
