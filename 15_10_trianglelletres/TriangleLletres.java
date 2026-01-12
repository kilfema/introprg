/*
* Kilian Fernández - 12/01/2026
* Programa que demana un text i crea un triangle amb l'entrada donada.
*
*/

public class TriangleLletres {
    public static void main(String[] args) {
    //demana text    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    if (text.isEmpty()) return;
    
    dibuixaTriangle(text);
    }
    
    public static void dibuixaTriangle (String text) {
        for (int i = 1; i <= text.length(); i++) {
            dibuixaLinia(text, i);
            System.out.println(); 
        }
    }
    
    public static void dibuixaLinia(String text, int linia) {
        for (int j = 0; j < linia; j++) {
            if (j > 0) {
                System.out.print(", ");
            }
            System.out.print(text.charAt(j));
        }
    }

}
