/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el codifica canviant cada caràcter, pel valor següent en l'orde establert (abecedari, número següent...)
 */
 
 public class Codifica {
    public static void main (String[] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    System.out.println("Index?");
    int index = Integer.parseInt(Entrada.readLine());
    
    System.out.println(
                        codifica(text, index)
                    );    
    }
    
    public static String codifica (String text, int index) {
    
    String resultat = "";
    String majus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String minus = "abcdefghijklmnopqrstuvwxyz";
    String numeros = "0123456789";
    
    for (int i = 0; i < text.length(); i++) {
    
        char caracter = text.charAt(i);
        
        if (Character.isLetter(caracter)) {
            
            //CAS CARACTER LLETRA MAJUSCULA
            if (Character.isUpperCase(caracter)) {
            
            /*Recorre abecedari majuscules. Calcula la posició final dins l'abecedari que ocuparà 
            el caràcter actual un cop aplicat els salts que indica l'index
            */ 
                for (int j = 0; j < majus.length(); j++) {
                    char caracterMajus = majus.charAt(j);
                    
                    
                    if (caracterMajus == caracter) {
                        
                        int posFinal = (j + index) % majus.length();
                        
                        resultat += majus.charAt(posFinal);
                        break;
                    }
                }    
            
            //CAS CARACTER LLETRA MINUSCULA    
            } else {

                for (int j = 0; j < minus.length(); j++) {
                    char caracterMinus = minus.charAt(j);

                    if (caracterMinus == caracter) {
                        int posFinal = (j + index) % minus.length();
                        resultat += minus.charAt(posFinal);
                        break;
                    }
                }
            }          
     
        } else if (Character.isDigit(caracter)) {
        
                for (int j = 0; j < numeros.length(); j++) {
                    char caracterNum = numeros.charAt(j);

                    if (caracterNum == caracter) {
                        int posFinal = (j + index) % numeros.length();
                        resultat += numeros.charAt(posFinal);
                        break;
                    }
                } 
                
        } else {
            resultat += caracter;
        }
    }
    
    return resultat;
    }
 }
 
