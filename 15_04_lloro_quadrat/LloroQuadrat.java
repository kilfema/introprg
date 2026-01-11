/*
 *Kilian Fernández - 9/1/2026
 * Lloro que repeteix el string que li és donat. Si es demana que dibuixi un quadrat o un rectangle, ho fa. Finalitza quan es dona un string vuit.
 */
 
public class LloroQuadrat {
    public static void main(String[] args) {
        
      while (true) {
      System.out.println("El lloro espera paraula:");
      String text = Entrada.readLine();
      
      if (text.isEmpty()) {
        System.out.println("Adéu");
        return;
      }
      
      if (text.equals("dibuixa quadrat")) {
        dibuixaQuadrat();
        
      } else if (text.equals("dibuixa rectangle")) {
        dibuixaRectangle();
        
      } else {
        System.out.println("El lloro repeteix: " + text);
      }
      }  
    }
          
    public static void dibuixaQuadrat() { 
           
        for (int j = 0; j < 5; j++) {
            dibuixaLinia();
            finalitzaLinia();
        }
    }
    
    public static void dibuixaRectangle() {
    
        for (int i = 0; i < 5; i++) {
            dibuixaLinia();
            dibuixaLinia();
            finalitzaLinia();
        }  
    }
        
    public static void dibuixaLinia() {
             
        for (int k = 0; k < 5; k++) {
            System.out.print(" X");
        }      
    }
    
    public static void finalitzaLinia() {
        System.out.println("");
    }
    
}
