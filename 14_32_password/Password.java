/*
 *Kilian Fernández - 9/1/2026
 * Programa que demana una contrasenya i valida si compleix totes les restriccions indicades (longitud, presència de números/majúscules/minúscules/símbols, recompte de majúscules vs minúscules, sense espais, repeticions només per vocals, límits de tipus consecutius i de números consecutius), mostrant el primer error detectat seguint l’ordre de comprovacions de l’enunciat.
 */
 
public class Password {
    public static void main(String[] args) {
    
    //demana entrada
    System.out.println("Introdueïx una contrasenya:");
    String password = Entrada.readLine();
    
    //valora si està vuit
    if (password.isBlank()) {
        System.out.println("Cap valor introduït");
        return;
    }
    //valora LLARG
    if (password.length() < 8 || password.length() > 16) {
        System.out.println("Llargada incorrecta");
        return;
    }
    
    boolean teBlanc = false;
    boolean teNumero = false;
    boolean teMajus = false;
    boolean teMinus = false;
    boolean teSimbol = false;
    boolean repeteixCons = false;
    int contadorMajus = 0;
    int contadorMinus = 0;
    String contadorCons = "";
    String vocals = "aeiouAEIOU";
    String lletres = "ABCDEFGHIJKLMNOPQRSTUVWXYZÑÇ";
    boolean esVocal = false;
    
    //recorregut de password 
    for (int i = 0; i < password.length(); i++) {
        esVocal = false;
        char caracter = password.charAt(i);
        
        //valida si te ESPAI BLANC
        if (Character.isWhitespace(caracter)) {
            teBlanc = true;
            System.out.println("No pot contenir espais blancs");
            break;
        }
        
        //si es DIGIT
        if (Character.isDigit(caracter)) {
            teNumero = true;
            continue;
        }
        
        //si es LLETRA
        if (Character.isLetter(caracter)) {
        
            for (int l = 0; l < lletres.length(); l++) { //recorre string lletres. valida si hay una mayuscula
                char lletraFor = lletres.charAt(l);
                
                //MAJUS i MINUS
                if (lletraFor == caracter) {
                    teMajus = true;
                    contadorMajus++;
                    System.out.println(contadorMajus);
                    break;
                    
                } else {
                    teMinus = true;
                    contadorMinus++;
                    System.out.println("min " + contadorMinus);
                    break;
                }     
            }
            
            //comproba si son vocals, per validar posteriorment si hi ha repetició de consonants
            for (int k = 0; k < vocals.length(); k++) {
                char vocalFor = vocals.charAt(k);
                
                if (caracter == vocalFor) {
                    esVocal = true;
                    continue;
                }
            }
        
        if (!esVocal) {
            
            //recorregut CONSONANTS, per validar posteriorment si hi ha repetició
            for (int j = 0; j < contadorCons.length(); j++) {
                char charCons = contadorCons.charAt(j);
                
                if (charCons == caracter) {
                    repeteixCons = true;
                    break;                  
                }
            }
        }
        
        //SIMBOL
        } else {
            teSimbol = true;
            continue;
        }  
        
        //comproba si s'ha repetit consonant. If false, suma al comptador de consonants, if true, trenca bucle principal
        if (!repeteixCons) {
            contadorCons = contadorCons + caracter;
        }        
    }
    
    if (!teNumero) {
        System.out.println("No conté números");
        return;
        }
        
    if (!teMajus) {
        System.out.println("No conté majúscula");
        return;
    }
    
    if (!teMinus) {
        System.out.println("No conté minúscula");
        return;
    }
    
    if (!teSimbol) {
        System.out.println("No conté símbol");
        return;
    }
    
    if (contadorMajus < contadorMinus) {
        System.out.println("No pot tenir menys majúscules que minúscules");
        return;
    }
    
    if (repeteixCons) {
        System.out.println("No pot repetir consonant");
        return;
    }
    }
}
