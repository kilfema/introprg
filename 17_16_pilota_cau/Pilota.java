/*
*
*  Kilian Fernández - 09/02/2026
*
* Programa que muestra una animación simple en terminal moviendo una
* pilota dentro de una matriz de caracteres, modificando su estado
* mediante mutabilidad y entrada del usuario.
*
*/
 public class Pilota {

     public static final int N_FILES = 9;

     public static final int N_COLS = 13;


     public static void netejaPantalla() {

         // NOTA: La neteja de pantalla podria no funcionar fora del terminal.

         System.out.print("\033[H\033[2J");

         System.out.flush();

     }

     public static void mostraCamp(char[][] camp) {

         for (int i=0; i<N_FILES; i++) {

             for (int j=0; j<N_COLS; j++) {

                 System.out.print(camp[i][j]);

             }

             System.out.println();

         }

     }

     public static void netejaCamp(char[][] camp) {

         for (int i=0; i<N_FILES; i++) {

             for (int j=0; j<N_COLS; j++) {

                 camp[i][j] = '·';

             }
        }
     }

     public static void netejaPosicio(char[][] camp, int fila, int col) {
        
        camp[fila][col] = '·';
         

     }

     public static void posicionaPilota(char[][] camp, int fila, int col) {

         for (int i=0; i<N_FILES; i++) {
            for (int j=0; j<N_COLS; j++) {
                
                if (fila == 9) camp[0][col] = 'O';
                
                else if (col == 13) camp[fila][0] = 'O';
                
                else camp[fila][col] = 'O';
            }
         }

     }

     public static int seguentFila(int actual) {

         int fila = actual + 1;
         
         if (fila == 9) fila = 0;
         
         return fila;
     }

     public static int seguentCol(int actual) {

         int col = actual + 1;
         
         if (col == 13) col = 0;
         
         return col;
     }

     public static void main(String[] args)  {

         char[][] camp = new char[N_FILES][N_COLS];

         netejaCamp(camp);

         int fila = 0;

         int col = 0;

         do {

             posicionaPilota(camp, fila, col);

             netejaPantalla();

             mostraCamp(camp);

             netejaPosicio(camp, fila, col);

             fila = seguentFila(fila);

             col = seguentCol(col);

             System.out.printf("%nEnter per continuar");

         } while (Entrada.readLine().isEmpty());

     }
}
