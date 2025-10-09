/* 
 * Kilian Fernández - 9/10/2025
 * Programa que pide tres números y los devuelve ordenados de menor a mayor
 */
 
public class TresEnOrdre {
    public static void main(String[] args) {
      
      //demana primer num
      System.out.println("Primer?");
      int primer = Integer.parseInt(Entrada.readLine());
      
      //demana segon num
      System.out.println("Segon?");
      int segon = Integer.parseInt(Entrada.readLine());
      
      //demana tercer num
      System.out.println("Tercer?");
      int tercer = Integer.parseInt(Entrada.readLine());
      
      int mesGran = 0;
      
      int enMig = 0;
      
      int mesPetit = 0;
      
      //compara primer
      if (primer > segon && primer > tercer) {
        mesGran = primer;
        
      } else if (primer > segon ^ primer > tercer) {
        enMig = primer;
      } else {
        mesPetit = primer;
      }
      
      //compara segon
      if (segon > primer && segon > tercer) {
        mesGran = segon;
      } else if (segon > primer ^ segon > tercer) {
        enMig = segon;
      } else {
        mesPetit = segon;
      }
      
      //compara tercer
       if (tercer >= segon && tercer >= primer) {
        mesGran = tercer;
      } else if (tercer >= segon ^ tercer >= primer) {
        enMig = tercer;
      } else {
        mesPetit = tercer;
      }
      
       if ((primer == segon) && (primer > tercer)) {
            enMig = primer;
            mesGran = segon;
            mesPetit = tercer;
        
      } else if ((primer == segon) && (primer < tercer)) {
            enMig = segon;
            mesGran = tercer;
            mesPetit = primer;
        
      } else if ((tercer == segon) && (tercer > primer)) {
            enMig = tercer;
            mesGran = segon;
            mesPetit = primer;
        
      } else if ((tercer == segon) && (tercer < primer)) {
            enMig = segon;
            mesGran = primer;
            mesPetit = tercer;
      
      } else if (primer == segon && primer == tercer) {
            enMig = primer;
            mesPetit = segon;
            mesGran = tercer;
      }
      
      System.out.println(mesPetit + ", " + enMig + " i " + mesGran);
      
    }
}
