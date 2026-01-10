/*
 *Kilian Fernández - 9/1/2026
 * Demana textos per teclat fins que un d’ells no contingui el darrer caràcter del text anterior. El primer text s’accepta sempre, excepte si és buit; a partir d’aquí, cada nou text ha de contenir el caràcter final de l’anterior, i quan no es compleix aquesta condició el programa finalitza mostrant “Adéu”.
 */
 
public class EndevinaNombre {
    public static void main(String[] args) {
    
    int nombrePensat = Integer.parseInt(args[0]);
    String entrada = "";
    int nombreEntrada = 0;
    boolean teLletres = false;
    
    while (true) {

    teLletres = false; //reinicia variable
    //demana nombre
    System.out.println("Nombre?");
    entrada = Entrada.readLine();
    
    //bucle per analitzar si l'entrada té lletres
    for (int i = 0; i < entrada.length(); i++) {
        char caracter = entrada.charAt(i);
        
        if (!Character.isDigit(caracter)) {
        teLletres = true;
        System.out.println("Només nombres");
        break;
        }
    }        
    
    if (!teLletres) {
        nombreEntrada = Integer.parseInt(entrada);
        
        if (nombreEntrada < 0 || nombreEntrada > 100) {
            System.out.println("Fora de rang");
        
         } else if (nombreEntrada < nombrePensat) {
            System.out.println("Massa petit");
        
        } else if (nombreEntrada > nombrePensat) {
            System.out.println ("Massa gran");
            
        } else {
            System.out.println("Encertat!");
            return;
        }
            
        }
    }

    
    }
}
