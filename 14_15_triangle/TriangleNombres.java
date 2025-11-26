/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa demana un enter entre 1 i 9 i imprimeix un triangle numèric creixent.
 * Per a cada línia, mostra els nombres des del valor de la línia fins a 1.
 * Si l’entrada no és vàlida, mostra el missatge “Valor inadequat”.
 */
public class TriangleNombres {
    public static void main(String[] args) {
        
    
    System.out.println("Nombre?");
    int v = Integer.parseInt(Entrada.readLine());
        
        if (v < 1 || v > 9) {
        System.out.println("Valor inadequat");
        
        } else {
        
        for (int i = 1; i <=v; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
        System.out.println("");
        }
        }
           
    }
}
