/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna invertint l'ordre de caràcters que el composen separant-lo per comes
 */
 
public class TextReves {
    public static void main(String[] args) {
    
    System.out.println("Text?");
    System.out.println(UtilString.inverteix(
                            UtilString.cometeja(
                                Entrada.readLine()
                            )
                        )    
                      );
    }
}
