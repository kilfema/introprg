/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa demana un enter positiu major que 0 i imprimeix un triangle numèric decreixent, des del nombre introduït fins a 1.
 * A cada línia mostra els nombres de l’1 fins al valor de la línia.
 * Si l’entrada no és vàlida, indica “Valor inadequat”.
 */
public class TriangleInvertit {
    public static void main(String[] args) {
        
    
    System.out.println("Nombre?");
    int v = Integer.parseInt(Entrada.readLine());
        
        if (v < 1 || v > 9) {
        System.out.println("Valor inadequat");
        
        } else {
        
        for (int i = 1; i <= v; i++) {
            
            for (int j = 1; j <= v - i + 1 ; j++) {
                System.out.print(j);
                if (!(j == v- i + 1)) System.out.print(", "); 
                //si no correspon a la última fila, afegeix coma
            }
            
        System.out.println("");
        }
        
        }
           
    }
}
