/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa genera taules de multiplicar personalitzades a partir de quatre valors numèrics introduïts per l'usuari: dos per als primers operands i dos per als segons operands.
Si algun valor inicial és més gran que el valor final corresponent, el programa intercanvia els valors i treballa sempre en ordre creixent.
A continuació mostra totes les multiplicacions possibles entre el rang dels primers operands i el rang dels segons operands.
 */
 
public class RectanglesAMida {
    public static void main(String[] args) {
        
    int fila = 1;
    boolean esPositiu = true;
    int columna = 1;
    
    while (esPositiu) {
    
    fila = columna;   
    System.out.println("\n" + fila + " x ?");
    columna = Integer.parseInt(Entrada.readLine());
    
    if (columna < 1) {
        esPositiu = false;
        
    } else {
    
    for (int i = 1; i<= fila; i++) {
        
        for (int j = 0; j < columna; j++) {
            
            if (j==0) System.out.print("  ");
            
            System.out.print(j);
        }
    
    System.out.println("");
    
        for (int k = 0; k < fila; k++) {
            System.out.print(k + " ");
            
            for (int t = 1; t <= columna; t++) {
                System.out.print("*");
            }
        }  
        
    }
    }   
    }
        
    }
}
