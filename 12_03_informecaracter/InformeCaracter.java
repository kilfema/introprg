/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa simula un informe on extreu diferents dades d'un caracter de la cadena de text introduïda
 */
 
public class InformeCaracter {
    public static void main(String[] args) {
        
        //Demana valors
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty() || text.isBlank()) {
            System.out.println("Error");
            
        } else {
        
        System.out.println("Posició?"); 
        int posicio = Integer.parseInt(Entrada.readLine()); 

            //comprova si la posicio està fora de rang   
            if (posicio < 0 || posicio > text.length()) {
                System.out.println("Fora de rang");
             
             //mostra resultats   
            } else {
            
                char caracter = text.charAt(posicio);
                      
                //getName
                System.out.println("Character.getName(\'" + caracter + "\'): " + Character.getName(caracter));
                
                //isDigit
                System.out.println("Character.isDigit(\'" + caracter + "\'): " + Character.isDigit(caracter));
                
                //isJavaIdentifierStart
                System.out.println("Character.isJavaIdentifierStart(\'" + caracter + "\'): " + Character.isJavaIdentifierStart(caracter));
                
                //isJavaIdentifierPartisDigit
                System.out.println("Character.isJavaIdentifierPart(\'" + caracter + "\'): " + Character.isJavaIdentifierPart(caracter));
                
                //isLetter
                System.out.println("Character.isLetter(\'" + caracter + "\'): " + Character.isLetter(caracter));
                
                //isLowerCase
                System.out.println("Character.isLowerCase(\'" + caracter + "\'): " + Character.isLowerCase(caracter));
                
                //isUpperCase
                System.out.println("Character.isUpperCase(\'" + caracter + "\'): " + Character.isUpperCase(caracter));
                
                //isWhitespace
                System.out.println("Character.isWhitespace(\'" + caracter + "\'): " + Character.isWhitespace(caracter));
                
                //toLowerCase
                System.out.println("Character.toLowerCase(\'" + caracter + "\'): " + Character.toLowerCase(caracter));
                
                //toUpperCase
                System.out.println("Character.toUpperCase(\'" + caracter + "\'): " + Character.toUpperCase(caracter));
            }
        }
    }
}
