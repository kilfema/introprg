/*
* Kilian Fernández - 4/11/2025
* Aquest programa demana un text. Si comença i acaba amb la mateixa vocal, el repeteix. Sinó, demana una nova paraula. Si el text és vuit, acaba el programa.
*/
public class LloroVocalIniFi {
    public static void main(String[] args) {

        boolean estaBuida = false;
 
        while (estaBuida == false) { // mentres no sigui un string vuit
            
            //demana valor
            System.out.println("Paraula?");
            String text = Entrada.readLine();
            
            if (text.isEmpty() || text.isBlank()) { //si està vuida
                    estaBuida = true;
                    
            } else {
            
                String textMinus = text.toLowerCase(); //pasa text a minuscula
                
                char primeraLletra = textMinus.charAt(0);
                
                char ultimaLletra = textMinus.charAt(textMinus.length()-1);
                
                boolean esVocal = primeraLletra == 'a' || primeraLletra == 'e' || primeraLletra == 'i' || primeraLletra == 'o' || primeraLletra == 'u'; //comproba si la primera lletra és alguna vocal
                
                    if (esVocal && primeraLletra == ultimaLletra) { //si es vocal, repeteix
                        System.out.println("Repeteixo: " + text);
                    }
            }
        }

        // acaba el bucle i es despedeix
        System.out.println("Adéu");
    }
}
