/*
*
*  Kilian Fernández - 09/02/2026
*
* Biblioteca de utilidades para operar sobre tablas de caracteres,
* proporcionando funciones puras de transformación sin modificar
* las estructuras originales.
*
*/
public class UtilTaula {
    
    /*Recorre una tabla rectangular de caracteres y construye una nueva tabla sustituyendo un carácter
    ** origen por uno destino, sin modificar la estructura ni el contenido de la tabla original.
    */
    public static char[][] substitueix(char taula[][], char primer, char segon) {
        
        char[][] desti = new char[taula.length][taula[0].length];
        
        for (int i=0; i<desti.length; i++) {
            
            for (int j=0; j<desti[0].length; j++) {
                 
                if (taula[i][j] == primer) desti[i][j] = segon;
                
                else desti[i][j] = taula[i][j];
            }
        }
        
        return desti;
    }
    
    /* Funció pura que composa un String a partir del contingut d'una taula d'enters. Els valors
    ** apareixeran separats amb un espai i representa els números com a mínim amb vuit posicions. 
    */
    public static void inicialitzaSequencial(int[][] taula, int valorInicial) {
        
        
        for (int i=0; i<taula.length; i++) {
            for (int j=0;j<taula[0].length; j++) {
                
                taula[i][j] = valorInicial;
                
                valorInicial++;
            }
        }
    }
    
    public static String taulaToString(int[][] taula) {
        
        String resultat = "";

        
        for (int i=0; i<taula.length; i++) {
            
            for (int j=0; j<taula[0].length; j++) {
                                
                resultat += String.format("%8d", taula[i][j]);                               
            }
            resultat += "\n";
        }
        
        return resultat;  
    }
}
