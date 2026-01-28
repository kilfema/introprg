/*

 *  Kilian Fernández  28/01/2026
 
 * Simulació de tres en ratlla amb arrays bidimensionals

 */


public class TresEnRatlla {

    public static void main(String[] args){

        // declaració del tauler

        char[][] tauler = new char[3][3];


        // inicialització de la fila 0

        tauler[0][0] = '·';
        
        tauler[0][1] = '0';
        
        tauler[0][2] = '0';

        // inicialització de la resta de files

        tauler[1][0] = '·';
        
        tauler[1][1] = 'X';
        
        tauler[1][2] = '·';

        
        tauler[2][0] = '·';
        
        tauler[2][1] = '·';
        
        tauler[2][2] = 'X';
        
        // mostra la posició inicial del tauler

        System.out.println("La posició inicial del taulell:");

        mostraFila(tauler[0]);     // mostra la línia 0

        mostraFila(tauler[1]);     // mostra la línia 1

        mostraFila(tauler[2]);     // mostra la línia 2


        // demana coordenades del moviment del jugador X

        System.out.println("Fila del següent moviment?");

        int fila = Integer.parseInt(Entrada.readLine());

        System.out.println("Columna del següent moviment?");

        int columna = Integer.parseInt(Entrada.readLine());


        // marquem el nou moviment

        

        if (fila<0 || fila>2 || columna<0 || columna>2) {
            System.out.println("Posició no vàlida");
            return;
        } 

        tauler[fila][columna] = 'X';

        

        // tornem a mostrar el tauler

        System.out.println("La posició final del taulell:");

        for (int i=0; i < 3; i++) {
            mostraFila(tauler[i]);
        }

    }


    // mostra el contingut de la fila per sortida estàndard

    public static void mostraFila(char[] fila) {

        for (int i=0; i<fila.length; i++) {

            System.out.print(fila[i]);

        }

        System.out.println();

    }

}


