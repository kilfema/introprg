/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa simula un informe on extreu diferents dades d'una cadena de text
 */
public class QuadratNombres {
    public static void main(String[] args) {
        
    
    System.out.println("Valor final?");
    String entrada = Entrada.readLine();
    
    if (entrada.isBlank()) {
    System.out.println("Valor inadequat");
    
    } else {
        int v = Integer.parseInt(entrada);
        
        for (int fila = 1; fila <= v; fila++) {
                
            for (int columna = 1; columna <= v; columna++) {
            System.out.print(" " + columna);
            }
            
        System.out.println();                   
        }
    }       
    }
}
