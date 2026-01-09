/*
 *Kilian Fernández - 9/1/2026
 * Programa que llegeix textos successius (fins que l’usuari introdueix una línia buida), acceptant sempre el primer text si no és buit, i continuant només mentre cada nou text contingui el darrer caràcter del text anterior; quan un text no el conté, el programa finalitza mostrant “Adéu”.
 */
 
public class ConteDarrer {
    public static void main(String[] args) {
    
    System.out.println("Introdueix texts (enter sol per finalitzar)");
    String text = Entrada.readLine();
    text = text.toLowerCase();
    
    if (text.isEmpty()) {
        System.out.println("Adéu");
        return;
    }
      
    System.out.println("bé");
    
    char ultimCaracter = '0';
    boolean noConte = false;
     
    while (!noConte) {
        ultimCaracter = text.charAt(text.length() - 1);
        text = Entrada.readLine();
        text = text.toLowerCase();
        
        for (int i = 0; i < text.length(); i++) {
            char actual = text.charAt(i);

            if (actual == ultimCaracter) {
                System.out.println("bé");
                break;
                
            } else if (i == text.length() - 1) {
                noConte = true;
            }
        }
    }
    
    System.out.println("Adéu");
       
    }
}
