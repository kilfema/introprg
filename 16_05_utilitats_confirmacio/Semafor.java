/*
 * Aquest programa demana el color del semàfor i retorna la instrucció de què has de fer
 */
 
public class Semafor {
    public static void main(String[] args) {
        
        //pregunta edat
        System.out.println("Ets major d'edat?");
        String edat = Entrada.readLine();
        boolean esMajorEdat = UtilitatsConfirmacio.respostaABoolean(edat);
        
        if (!esMajorEdat) {
            System.out.println("No pots fer servir aquest programa sense supervisió");
            return;
        }
        
        //demana color
        System.out.println("Color?");
        String color = (Entrada.readLine());

        //condicionals
        if (color.equals("verd")) {
            System.out.println("passa");
            
        } else if (color.equals("groc")) {
            System.out.println("corre!");
            
        } else if (color.equals("vermell")) {
            System.out.println("espera");
            
        } else {
            System.out.println("ves a l'oculista");
        }
       
        
    }
}
