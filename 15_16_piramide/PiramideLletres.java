/*
 *Kilian Fernández - 12/01/2026
 * Programa que que rep un text com a primer argument de la línia de comandes, i dibuixa piràmide amb les seves lletres.
 */
 
public class PiramideLletres {
    public static void main(String[] args) {
        
    String text = args[0];
    piramitza(text);        
    }
    
    public static void piramitza(String text) {
    
    //columna
    for (int i = 1; i <= text.length(); i++) {
    //linia
        //punts esquerra
        for (int j = 0; j <= text.length() - i; j++) {
            
            //condicion para añadir un punto extra. necesario visualmente porque text se muestra separado con puntos entre cada caracter.
            if (j > 0) {
                System.out.print(".");
            }
            System.out.print(".");       
        }
        //text esquerra
        for (int l = 0; l < i; l++) {
            char caracter = text.charAt(l);
            
            if (l > 0) {
                System.out.print(".");
            }
            System.out.print(caracter);
        }
        
        //text dreta
        for (int k = i - 2; k >= 0; k--) {
            
            
            char caracter = text.charAt(k);
                        
            System.out.print("." + caracter);
        }
        
        for (int j = 0; j <= text.length() - i; j++) {
        
            if (j > 0) {
                System.out.print(".");
            }
            System.out.print(".");       
        }
                
        
    System.out.println();
    }
    }
}
