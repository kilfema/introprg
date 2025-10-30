/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa rep una entrada de text i retorna si comença amb vocal o no.
 */
 
public class IniciaVocal {
    public static void main(String[] args) {
        
        //Demana text
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        char primeraChar= text.charAt(0); //identifica primera lletra
        
        String primeraString = String.valueOf(primeraChar); //transforma a String
        
        //compara si string és equivalent a alguna de les vocals
        boolean esVocal = primeraString.equalsIgnoreCase("a") || primeraString.equalsIgnoreCase("e") || primeraString.equalsIgnoreCase("i") || primeraString.equalsIgnoreCase("o") || primeraString.equalsIgnoreCase("u");
        
        //resposta que retorna
        String missatgeVocal = String.format("\"%s\" inicia amb la vocal '%c'", text, primeraChar);
        
        String missatgeNoVocal = String.format("\"%s\" no inicia amb vocal", text);
        
        //mostra missatge del boleà de comparaió
        if (esVocal) {
            System.out.println(missatgeVocal);
            
        } else  {
            System.out.println(missatgeNoVocal);
        }
    }
}
