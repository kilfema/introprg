/*
 *Kilian Fernández - 20/01/2026
 * Programa que demana un text i el retorna repetint-lo normalitzat; sense caracters especials.
 */
 
public class LloroNormalitzador {
    public static void main(String[] args) {
        
    while (true) {
    
    System.out.println("El lloro espera un text");
    String text = Entrada.readLine();
    
    if (text.isEmpty()) {
        System.out.println("El lloro s'acomiada atentament");
        return;
    }    
    System.out.println("El lloro respon: " + normalitzaBlancs(text));  
    }                
    }
    
    public static String normalitzaBlancs(String text) {
        
        text = UtilString.treureEspaisInicialsFinals(text);
        String resultat="";
        
        boolean teEspaiAnterior = false;
        
        for (int i=0; i<text.length(); i++) {
            
            char caracter = text.charAt(i);
            
            if (Character.isWhitespace(caracter)) {

                if (!teEspaiAnterior) {
                
                    teEspaiAnterior = true;
                    resultat += caracter;
                    
                } else continue;
                
            } else {
            
                resultat += caracter;
                if (teEspaiAnterior) teEspaiAnterior = false;
            }
        }
        
        return resultat;   
    }
}
    
    
