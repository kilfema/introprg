public class repaso_array {
    public static void main(String[] args) {
    
    String[] frutas = {"Poma", "Platan", "Kiwi"};
    
    int[][] ventas =  {{5, 2, 3},
                       {1, 4, 7},
                       {4, 23, 23}};
    
    mostraVendes(ventas);
    
    int[] totalDia = new int[ventas.length]; 
    
    int[] totalFrutas = new int[ventas[0].length];
    
    mostraTotalDia(sumaTotalDia(ventas, totalDia));
    
    mostraTotalFrutas(sumaFrutas(ventas, totalFrutas), frutas);
    
    // AMPLIACIÓ
    
    String[] nuevasFrutas = new String[4];
    
    int[][] nuevasVentas = new int[3][4];
    
    for (int i=0; i<ventas.length; i++) {
                   
        for (int j=0; j<ventas.length; j++) {
                                 
            nuevasVentas[i][j] = ventas[i][j];
        }
        
        nuevasFrutas[i] = frutas[i];
    } 
    
    nuevasFrutas[3] = "Pera";
    
    for (int i=0; i<ventas.length; i++) nuevasVentas[i][3] = 5;
    
    mostraVendes(nuevasVentas);
    
    int[] totalDia = new int[nuevasVentas.length]; 
    
    int[] totalFrutas = new int[nuevasVentas[0].length];
       
    mostraTotalDia(sumaTotalDia(nuevasVentas, totalDia));
    
    mostraTotalFrutas(sumaFrutas(nuevasVentas, totalFrutas), nuevasFrutas);
       
    }

    public static void mostraVendes(int[][] ventas) {
    
    System.out.println("VENTAS DEL DIA\n---------------");
    
    for (int i=0; i<ventas.length; i++) {
        
        System.out.print("Dia " + (i+1) + ":");
        
        for (int j=0; j< ventas[0].length; j++) {
            
            System.out.printf("%4d", ventas[i][j]);
        }
        
        System.out.println();
    }
    }
    
    public static int[] sumaTotalDia(int[][] ventasSetmana, int[] totalDia) {
      
        for (int i=0; i<ventasSetmana.length; i++) {
            
            int suma=0;
            
            for (int j=0; j<ventasSetmana[0].length; j++) {
                
                suma+=ventasSetmana[i][j];
                
            }
            
            totalDia[i] = suma;

        }
        
        return totalDia;
    }
    
    public static void mostraTotalDia(int[] totalDia) {
    
    System.out.println("\nVENTAS TOTALES POR DÍA" + "\n-----------------------");    
        
        for (int i=0; i<totalDia.length; i++) {

            System.out.println("Dia " + (i+1) + ": " + totalDia[i]);
        }
        
   }
   
   public static int[] sumaFrutas(int[][] ventas, int[] totalFrutas) {

        for (int i=0; i<ventas[0].length; i++) {

            int suma = 0;
            
            for (int j=0; j<ventas.length; j++) {
                
                suma+= ventas[j][i];

            }
            
            totalFrutas[i] = suma;
        }
        
        return totalFrutas;
   }
   
   public static void mostraTotalFrutas(int[] totalFrutas, String[] frutas) {
        
        System.out.println("\nVENTAS TOTALES DE FRUTAS" + "\n------------------------");
        
        for (int i=0; i<totalFrutas.length; i++) {
            
            System.out.println(frutas[i] + ": " + totalFrutas[i]);
        }
   }

} 
