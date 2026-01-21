/*
 *Kilian Fernández - 20/01/2026
 * Programa que demana un text i el retorna repetint-lo normalitzat; sense caracters especials.
 */
 
public class EsEnter{
    public static void main(String[] args) {
        
       System.out.println("Introdueix els texts a analitzar:");
       
       while (true) {
            
            String text = Entrada.readLine();
            
            
            if (text.isEmpty()) {
                System.out.println("Adéu");
                return;
            }
            
            if (Character.isWhitespace(text.charAt(0)) || 
            Character.isWhitespace(text.charAt(text.length()-1))) {
                
                text = UtilString.treureEspaisInicialsFinals(text);
            }            
            
            if (UtilString.esEnter(text)) {
                System.out.println("\"" + text + "\" és enter");
            
            } else {
                System.out.println("\"" + text + "\" no és enter");
            }
       }          
    }
    

} 
    
    
