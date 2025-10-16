/*
 * Aquest programa simula un ascensor virtual. Demana la planta actual i quants pisos es volen pujar i retorna el resultat.
 */
public class Ascensor {
    public static void main(String[] args) {
    
        //Demana valors
        System.out.println("pis?");
        String pis = Entrada.readLine();
        
        System.out.println("botó?");
        String boto = Entrada.readLine();
        
        if (pis == "planta baixa" && boto == "pujar un") {
            System.out.println("primer pis");
        } else if (pis == "planta baixa" && boto == "pujar dos") {
            System.out.println("segon pis");
        } else {
            System.out.println("Error");
        }
        
    }
}

dev@introprgvm:~/introprg/11_16_ascensor$ java Ascensor
pis?
planta baixa
botó?
pujar un
Error

