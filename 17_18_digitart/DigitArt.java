/*
*
*  Kilian Fernández - 09/02/2026
*
* Programa de pruebas que aplica utilidades sobre tablas de caracteres
* para transformar y mostrar resultados en formato visual por terminal.
*
*/

 public class DigitArt {

     public static char[][] construeix1() {

         return new char[][] {

             {'·', '·', '·', '·', '·'},

                 {'·', 'X', 'X', '·', '·'},

                 {'·', '·', 'X', '·', '·'},

                 {'·', '·', 'X', '·', '·'},

                 {'·', '·', 'X', '·', '·'},

                 {'·', 'X', 'X', 'X', '·'},

                 {'·', '·', '·', '·', '·'}

         };

     }


     public static char[][] construeix2() {

         return new char[][] {

                 {'·', '·', '·', '·', '·', '·'},

                 {'·', 'X', 'X', 'X', 'X', '·'},

                 {'·', '·', '·', '·', 'X', '·'},

                 {'·', 'X', 'X', 'X', 'X', '·'},

                 {'·', 'X', '·', '·', '·', '·'},

                 {'·', 'X', 'X', 'X', 'X', '·'},

                 {'·', '·', '·', '·', '·', '·'},

         };

     }


     public static char[][] construeix3() {

         return new char[][] {

                 {'·', '·', '·', '·', '·', '·'},

                 {'·', 'X', 'X', 'X', 'X', '·'},

                 {'·', '·', '·', '·', 'X', '·'},

                 {'·', 'X', 'X', 'X', 'X', '·'},

                 {'·', '·', '·', '·', 'X', '·'},

                 {'·', 'X', 'X', 'X', 'X', '·'},

                 {'·', '·', '·', '·', '·', '·'},

         };

     }

     public static void mostraResultat(char[][] origen, char[][] resultat) {
        
        
        /* array.length --> MUESTRA LA LONGTIUD DE LA FILA
        ** array-lenth[0] --> MUESTRA LA LONGITUD DE LA COLUMNA */
        
         for (int i=0; i<origen.length; i++) {
            for (int j=0; j<origen[0].length; j++) {
                
                System.out.print(origen[i][j]);
                
                
            }
            
            System.out.print(" -> ");
            
            
            for (int k=0; k<resultat[0].length; k++) {
                    
                System.out.print(resultat[i][k]);
            }
            
            System.out.println();
         }

     }

     public static void processaCaracter(char ch) {

         char[][] origen;

         switch (ch) {

             case '1': origen = construeix1();

                       break;

             case '2': origen = construeix2();

                       break;

             case '3': origen = construeix3();

                       break;

             default: return;    // no conec aquest caràcter

         }

         char[][] desti = UtilTaula.substitueix(origen, 'X', ch);

         mostraResultat(origen, desti);

         System.out.println();

     }

     public static void processaArgument(String arg) {
            
         for (int i=0; i<arg.length(); i++) {
            
            processaCaracter(arg.charAt(i));
         }        
     }

     public static void main(String[] args){

         if (args == null) return;
                 
         int count = 0;
         String nums = "";
         
         for (int i=0; i<args.length; i++) {
            
            for (int j=0; j<args[i].length(); j++) {
                
                char caracter = args[i].charAt(j);
                
                if (caracter == '1' || caracter == '2' || caracter == '3') {
                        count++;
                        nums += caracter;
                }
            }
         }
         
         if (count<1) return;
         
         processaArgument(nums);
                           
     }
 }
