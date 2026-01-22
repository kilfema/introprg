/*
 *Kilian Fernández - 21/01/2026
 * 
 * Aquest programa separa un text en fragments utilitzant els espais en blanc com a separadors, amb
 * l’opció d’incloure o no aquests espais en el resultat, i retorna un array de String amb el
 * resultat de la separació.
 *
 */
 
 public class Main {

     public static void main(String[] args) {

         System.out.println("Separador?");

         String separador = Entrada.readLine();

         System.out.println("Darrer separador?");

         String darrerSeparador = Entrada.readLine();

         System.out.println("Valors:");

         if (args.length > 0) {

             for (int i=0; i < args.length; i++) {

                 System.out.printf("- \"%s\"%n", args[i]);

             }

         } else {

             System.out.println("Cap valor");

         }

         System.out.printf("junta(valors, \"%s\", \"%s\") -> \"%s\"%n",

                             separador, darrerSeparador,

                             UtilString.junta(args, separador, darrerSeparador));

     }
}
