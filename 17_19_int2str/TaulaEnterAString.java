/**
 * Nombre: Kilian Fernández
 * Fecha: 10/02/2026
 *
 * Descripción:
 * Programa que lee especificaciones de dimensiones de tablas desde los argumentos de la línea
 * de comandos, valida el formato “n x m” (con n y m entre 1 y 99), crea tablas de enteros con
 * esas dimensiones, las inicializa con el valor 1 y muestra su contenido formateado.
 */

public class TaulaEnterAString {

    public static void main(String[] args){

        for (int i=0; i<args.length; i++) {

            System.out.println(args[i]);

            int files = obteFiles(args[i]);
            
            System.out.println(files);
            
            int columnes = obteColumnes(args[i]);

            if (files < 1 || columnes < 1) {

                System.out.println("Especificació no vàlida");

            } else {

                int[][] taula  = new int[files][columnes];

                UtilTaula.inicialitzaTaula(taula, 1);

                String resultat = UtilTaula.taulaToString(taula);

                System.out.println(resultat);

                System.out.println();

            }

        }

    }


    public static boolean especificacioCorrecta(String especificacio) {

        /* retorna true si l'especificació és de la forma n'x'm on n i m

         * són dos strings d'un o dos dígits.  Exemple: "12x5" seria

         * correcta, mentre que "x3454" no.  */

        String[] coordenades = especificacio.split("x");

        if (coordenades.length != 2) return false;

        for (int i=0; i<coordenades.length; i++) {

            if (! UtilString.esEnter(coordenades[i])) return false;

            int valor = Integer.parseInt(coordenades[i]);

            if (valor < 0 || valor > 99) return false;
        }
         
        return true;
    }


    public static int obteFiles(String especificacio) {
        
        String files = "";
        
        int filesInt = 0;
        
        for (int i=0; i<especificacio.length(); i++) {
            
            char caracter = especificacio.charAt(i);
            
            if (Character.isDigit(caracter) && (i==0 || i==1)) {
                files += caracter;
                continue;
                                           
            } else if (caracter == 'x' && (i==1 || i==2)) break;
            
            else return -1;
            
        }
        
        if (!files.isEmpty()) filesInt = Integer.parseInt(files);
        
        if (filesInt>= 1 && filesInt <= 99) return filesInt;
        
    return -1;
    }


    public static int obteColumnes(String especificacio) {
       
       boolean teX = false;
       
       String col = "";
       
       for (int i=0; i<especificacio.length(); i++) {
            
            char caracter = especificacio.charAt(i);
            
            if (caracter == 'x') teX=true;
                 
            if (!teX) continue;
            
            if (Character.isDigit(caracter)) col+= caracter;
       }
       
       if (col.isEmpty() || col.length() > 2) return -1;
       
       return Integer.parseInt(col);
    }

}
