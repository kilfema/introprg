/*
 * Aquest programa demana el color del semàfor i retorna la instrucció de què has de fer
 */
 
public class Semafor {
    public static void main(String[] args) {
    
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
