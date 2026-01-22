/*
 *Kilian Fernández - 12/01/2026
 * 
 * UTILITATS D'STRING - AGRUPACIÓ DE FUNCIONS
 *
 */
 
public class UtilString {
    public static void main(String[] args) {
    
    }
     
   /*
   
   * Funció que rep un caràcter i retorna un booleà indicant si és vocal
   
   */
   
    public static boolean esVocal(char caracter) {
        
        String vocals = "aàeèéiíïoóòuúü";
        
            for (int j = 0; j < vocals.length(); j++) {
                if (caracter == vocals.charAt(j)) {
                    return true;
                }
            }
     return false;   
    }
    
   /*
  
   * Funció que rep un string amb un text i retorna el mateix text només amb lletres.
   * NO manté espais blancs, dígits, símbols...
   
   */
   
    public static String nomesLletres(String text) {
    
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);
        
        if (Character.isLetter(caracter)) {
            resultat+= caracter;
        }
    }
    
    return resultat;    
    }
    
   /*
  
   * Funció que rep un string amb un text i retorna el mateix text separant cada caràcter amb comes.
   
   */
   
    public static String lletresSeparades(String text) {
   
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
        
        if (i > 0) {
            resultat+= ", ";
        }
        
        resultat += text.charAt(i);
    }   
   
    return resultat; 
    }
    
   /*
   
   * Funció que rep un caràcter i retorna un booleà indicant si és consonant minuscula
   
   */
    
    public static boolean esConsonant(char caracter) {
        
        String consonants = "bcdfghjklmnpqrstvwxyzñç";
        
            for (int j = 0; j < consonants.length(); j++) {
                if (caracter == consonants.charAt(j)) {
                    return true;
                }
            }
     return false;   
    }
    
    /*
   
   * Funció que rep un String i retorna el string del revés
   
   */
    
    public static String inverteix(String text) {
    
        String resultat= "";
    
        for (int i = text.length() - 1; i >= 0; i--) {
        
            char caracter = text.charAt(i);
            
            resultat += caracter;
        }
        
        return resultat;    
    }
    
   /* 
   
   * Funció que rep un string amb un text i retorna el string separant cada caracter amb comes.
   
   * Primer, elimina els possibles espais blancs a l'inici o final del text cridant a una altra
   
   * funció anomenada treureEspaisInicialsFinals
   
   */
    
    public static String cometeja(String text) {
    
    if (text.isEmpty()) return text;
    
    text  = treureEspaisInicialsFinals(text);
    
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
       
        char caracter = text.charAt(i);
        
        if (Character.isWhitespace(caracter)) continue;
        
        if (i > 0) {
            resultat += ", ";
        }
        
        resultat += caracter;
    }
    
    return resultat;
    }   
    
    
   /* 
   
   * Funció que rep un string amb un text i retorna el mateix text només amb lletres.
   
   * NO manté espais blancs, dígits, símbols...
   
   */

   
    public static String treureEspaisInicialsFinals(String text) {
    
    String resultat = "";
    int primerCaracter = primerCaracterValid(text);
    int ultimCaracter = ultimCaracterValid(text);
    
    for (int i = primerCaracter; i <= ultimCaracter; i++) {
        char caracter = text.charAt(i);
        
        resultat += caracter;   
    }
    
    return resultat;    
    }

   /* 
   
   * Funció que rep un string amb un text i retorna a quina posició char es troba el primer caràcter
   
   * que NO és espai blanc. El programa no està pensat per rebre strings vuits.
   
   */
       
    public static int primerCaracterValid (String text) {
    
    int caracterValid = 0;
        
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);
        
        if (!Character.isWhitespace(caracter)) {
            caracterValid = i;
            break;
        }
    }
    return caracterValid;   
    }
    
   /* 
   
   * Funció que rep un string amb un text i retorna a quina posició char es troba l'últim caràcter
   
   * que NO és espai blanc. El programa no està pensat per rebre strings vuits.
   
   */
   
    public static int ultimCaracterValid (String text) {
    
    int caracterValid = 0;
        
    for (int i = text.length() - 1; i >= 0; i--) {
        char caracter = text.charAt(i);
        
        if (!Character.isWhitespace(caracter)) {
            caracterValid = i;
            break;
        }
    }
    return caracterValid;   
    }
    
    /* 
   
   * Funció que rep un text i i recorre cada caràcter per detectar si n'hi ha algún caracter 
   
   * especial: vocals amb accent o dièresi i ç (c trencada). En cas afirmatiu, crida a la funció
   
   * normalitzaChar, que s'encarrega de retornar el caracter normalitzat.
   
   */

    public static String normalitzaText(String text) {
        
        String charEspecials = "àáäèëéìíïòóöùúüçÀÁÄÈÉËÌÍÏÒÓÖÙÚÜÇ";
        String resultat = "";
        
        for (int i=0; i<text.length(); i++) {
            
            boolean esEspecial = false;
            char caracter = text.charAt(i);            
            
            for (int j = 0; j<charEspecials.length(); j++) {
            
                if (caracter == charEspecials.charAt(j)) {
                
                    resultat+= UtilString.normalitzaChar(caracter);
                    esEspecial = true;
                    break;
                }    
            }
            
            if (!esEspecial) resultat+= caracter;   
            }
            
        return resultat;
    }   
   
   /* 
   
   * Funció que rep un caràcter especial (vocal amb accent o dierèsi, o c trencada), i el retorna
   
   * normalitzat.
   
   */

    public static char normalitzaChar(char caracter) {
    
        String especials = "àáäèëéìíïòóöùúüç";
        boolean esMajuscula = false;
        char normalitzat = '0';
        
        if (Character.isUpperCase(caracter)) esMajuscula = true;
        
        caracter = Character.toLowerCase(caracter);
        
        for (int i=0; i<especials.length(); i++) {
            
            if (caracter == especials.charAt(i)) {
                    
                if (i>=0 && i<=2) normalitzat = 'a'; 
                
                if (i>= 3 && i<=5) normalitzat = 'e';
                
                if (i>=6 && i<=8) normalitzat = 'i';
                
                if (i>=9 && i<=11) normalitzat = 'o';
                
                if (i>=12 && i<=14) normalitzat = 'u';
                
                if (i==15) normalitzat = 'c';
                   
            }
        }
    
        if (esMajuscula) return Character.toUpperCase(normalitzat);
        
        return normalitzat;    
    }

   /* 
   
   * Funció que rep un string i el retorna sense espais extres a l'inici i al final cridant a la
   
   *funció treureESpaisInicialsFinals. I també elimina els espais extra entre paraules.
   
   */
      
    public static String normalitzaBlancs(String text) {
                
        
        String resultat="";               
        if (text.isBlank() || text.isEmpty()) return resultat;
        
        text = treureEspaisInicialsFinals(text);
        boolean teEspaiAnterior = false;
                
        for (int i=0; i<text.length(); i++) {
            
            char caracter = text.charAt(i);
           // int tab = (int)caracter;
           // System.out.println("QUe es?"+tab);
            if (Character.isWhitespace(caracter)/* || (int)caracter == 9*/) {

                if (!teEspaiAnterior) {
                
                    teEspaiAnterior = true;
                    resultat += ' ';
                    
                } else continue;
                
            } else {
            
                resultat += caracter;
                if (teEspaiAnterior) teEspaiAnterior = false;
            }
        }
        
        return resultat;   
    }

   /* 
   
   * Funció que rep un string i comproba si és enter. Només el retornarà com a valid si
   
   * tots els caràcters son digits, i també, si el primer caràcter és '+' o '-'. 
   
   */
  
    public static boolean esEnter(String text) {
        
        if (text.isEmpty()) return false;
           
        for (int i=0; i<text.length(); i++) {
            
            char caracter = text.charAt(i);
            
            if (Character.isDigit(caracter)) {
                continue;
                
            } else {
                
                if (i == 0 && (caracter == '+' || caracter == '-')) {
                    continue;
                
                } else return false;

            }
        }    
        
    return true;
    }
    

   /* 
   
   * Funció que rep un string i comproba si és enter cridant a esEnter(). Si no ho és, demana un
   
   * fins que rebi un enter correcte. 
   
   */
    public static int demanaEnterValid(String num) {
        
        int numEnter;
            
        while (true) {
            
            if (esEnter(num)) {
                    
                numEnter = Integer.parseInt(num);
                break;
            }
                
             System.out.println("Per favor, un valor enter");
             num = Entrada.readLine();  
         }
            
        return Integer.parseInt(num);            
        }

   /* 
   
   * Funció que rep un string i retorna un char que s'utilitza com a separador. Si és vuit, 
   
   * retorna una ',' per defecte.
   
   */
   
        public static char separadorChar(String text) {
        
            if (text.isEmpty()) return ',';
            
            return text.charAt(0);
        
        }

   /* 
   
   * Funció que rep un array int i un char. Retorna string enumerant els elements del char separats
   
   * amb el char que s'hagi introduït.
   
   */
   
        
    public static String entreComes(int valors[], char separador) {
        
        String resultat = "";
        
        if (valors.length == 0) return resultat;
        
        for (int i = 0; i < valors.length; i++) {
            
            if (i>0) resultat += (separador + " ");
            resultat+= (valors[i]);
        }
        
     return resultat;  
     }
     
     
    /*
    
    * Funció que rep un text i un booleà indicant si vol incloure espais, i retorna un array amb
    
    * cada paraula separada en un element individual. Si el booleà és true, també s'inclouen els
    
    * espais (NOMÉS UN, NORMALITZA ESPAIS),
    
    */
    
    public static String[] separa(String text, boolean inclouBlancs) {
        
        String[] resultat = new String [text.length()];
       
        boolean anteriorEsBlanc = false;
        int countElements= 0;
        String paraula = "";
        
            
            for (int i=0; i<text.length(); i++) {
            
                char caracter = text.charAt(i);
                
                if (Character.isWhitespace(caracter)) {
                   // System.out.println("ejecuta ");
                    
                    if (!anteriorEsBlanc) { 
                       
                        if (!paraula.isEmpty()) {
                            resultat [countElements] = paraula;
                            //System.out.println("\"" + resultat[countElements] + "\"");
                            countElements++;
                            paraula = "";
                        }
                        
                        if (inclouBlancs) {
                        
                        resultat [countElements] = " ";
                        anteriorEsBlanc = true;
                        countElements++;
                        }
                    }
                           
                } else {
                    
                    anteriorEsBlanc = false;
                    paraula += caracter;
                    
                    if (i == text.length() -1) {
                        resultat [countElements] = paraula;
                    }
                }
            }            

    return resultat;
    }
    
    
    /*
    
    * Funció, rep array d'string, un string separador i un darrer string separador. Retorna 
    
    * el string amb els elements de l'array ordenats i separats amb els separadors indicats.
    
    */
        
    public static String junta(String[] cadenes, String separador, String darrerSeparador) {
    
    String resposta = "";
    
    for (int i=0; i<cadenes.length; i++) {
        
        if (i==cadenes.length-1) {
            
            resposta += darrerSeparador + " " + cadenes[i];
            return resposta;
        }
        
        resposta += cadenes[i] + separador + " ";
    }
    
    return resposta;
    }
    
    
    /*
    
    * Funció alternativa de junta. Només considera un separador per tot l'string. Crida a 
    
    * junta(String[], String, String) complet amb el mateix argument pels dos strings que demana.
    
    */
    
    public static String junta(String[] cadenes, String separador) {
 
        return junta(cadenes, separador, separador);
    }
} 


