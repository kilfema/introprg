/* 
 * Kilian Fernández - 8/10/2025
 * Programa que pide mes y año y devuelve mes anterior y posterior al dado
 */
 
public class MesAny {
    public static void main(String[] args) {
      
      //demana mes
      System.out.println("Mes?");
      int mes = Integer.parseInt(Entrada.readLine());
      
      //demana any
      System.out.println("Any?");
      int any = Integer.parseInt(Entrada.readLine());
      
      
      //calcula el mes anterior
      int mesAnterior = switch (mes) {
        case 1 -> 12;
            
        default -> mesAnterior = mes - 1;
        };
        
      //calcula l'any anterior  
      int anyAnterior = switch (mesAnterior) {
        case 12 -> anyAnterior = any - 1;
        
        default -> any;
      }; 
     
     //calcula mes seguent
      int mesSeguent = switch (mes) {
        case 12 -> 1;
        
        default -> mesSeguent = mes + 1;
      };
      
      //calcula any seguent
      int anySeguent = switch (mesSeguent) {
        case 1 -> anySeguent = any + 1;
      
        default -> any;
      };
      
      if (mes <1 || mes >12) {
        System.out.println("Has introduït un mes incorrecte");
      } else {
            System.out.println("Mes anterior " + mesAnterior + "/" + anyAnterior + " i mes següent " + mesSeguent + "/" + + anySeguent);
            }
            
    }
}


