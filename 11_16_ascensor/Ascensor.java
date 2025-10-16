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
        
        //condicional planta baixa
        if (pis.equals("planta baixa") && boto.equals("pujar un")) {
            System.out.println("primer pis");
        } else if (pis.equals("planta baixa") && boto.equals("pujar dos")) {
            System.out.println("segon pis");
            
        //primera planta    
        } else if (pis.equals("primer pis") && boto.equals("pujar un")) {
            System.out.println("segon pis");
        } else if (pis.equals("primer pis") && boto.equals("baixar un")) {
            System.out.println("planta baixa");
            
        //segona planta
        } else if (pis.equals("segon pis") && boto.equals("baixar un")) {
            System.out.println("primer pis");
        } else if (pis.equals("segon pis") && boto.equals("baixar dos")) {
            System.out.println("planta baixa");
        } else {
            System.out.println("error");
        }
        
    }
}

