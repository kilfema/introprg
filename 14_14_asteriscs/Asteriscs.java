/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa simula un informe on extreu diferents dades d'una cadena de text
 */
public class Asteriscs {
    public static void main(String[] args) {
        
    int v = Integer.parseInt(args[0]);
        
        if (v < 1) {
        System.out.println("Valor inadequat");
        
        } else {
        
        String salida = "*";
         
        for (int i = 1; i <= v; i++) {
        
        System.out.println(salida);
        salida = salida + "*";
        }
        }
           
    }
}
