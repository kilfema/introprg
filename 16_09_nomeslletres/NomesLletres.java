/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna amb totes les lletres i separades per comes.
 */
 
public class NomesLletres{

    public static void main(String[] args) {

        System.out.println("Text?");

        System.out.println(

                UtilString.lletresSeparades(

                    UtilString.nomesLletres(

                        Entrada.readLine()

                        )

                    )

                );

    }

}
