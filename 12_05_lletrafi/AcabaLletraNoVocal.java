/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa rep una entrada de text i retorna si acaba amb vocal o no.
 */
 
public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        
        //Demana text
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty() || text.isBlank()) {
            System.out.println("EL text no té lletres");
        } else {
            //extrae ultima letra y cambia a minuscula
            char ultimaLletra = text.charAt(text.length()-1);
            char ultimaLletraMin = Character.toLowerCase(ultimaLletra);
            
            if (ultimaLletraMin == 'a' || ultimaLletraMin == 'e' || ultimaLletraMin == 'i' || ultimaLletraMin == 'o' || ultimaLletraMin == 'u') {
            
                System.out.println(String.format("\"%s\" no finalitza amb lletra no vocal", text));
            } else {
                System.out.println(String.format("\"%s\" finalitza amb lletra no vocal '%c'", text, ultimaLletra));
            } 
        }

    }
}
