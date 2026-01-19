/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el codifica canviant cada caràcter, pel valor següent en l'orde establert (abecedari, número següent...)
 */
 
 public class Codifica {
    public static void main (String[] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    int index = Integer.parseInt(args[0]);
    
    System.out.println(
                        codifica(text, index)
                    );    
    }
    
    public static String codifica (String text, int index) {
    
    if (index <= 0) return text;
    
    String resultat = "";
    String majus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String minus = "abcdefghijklmnopqrstuvwxyz";
    String numeros = "0123456789";
    
    for (int i = 0; i < text.length(); i++) {
    
        char caracter = text.charAt(i);
        
        if (Character.isLetter(caracter) && !(esCaracterEspecial(caracter))) {
            
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
    
    /* He creat una funció que retorna un booleà per analitzar si una lletra és un caràcter especial
    *  Ja que en aquest programa les lletres especials no es modifiquen ni canvien, sino que es
    *  es conserven tal i com apareixen en el string d'entrada.
    */
    
    public static boolean esCaracterEspecial(char caracter) {
    
    caracter = Character.toLowerCase(caracter);
    
    String especials = "àáèéëìíïòóöùúüçñ";
    
        for (int i = 0; i < especials.length(); i++) {
            if (especials.charAt(i) == caracter) return true;
        }
    
    return false;
    }
 }
 
