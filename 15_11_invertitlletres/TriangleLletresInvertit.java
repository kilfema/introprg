/*
* Kilian Fernández - 12/01/2025
* Programa que demana un text i mostra un triangle invertit amb el text donat
*
*/

public class TriangleLletresInvertit {
    public static void main(String[] args) {
    
    //demana text
    System.out.println("Text");
    String text = Entrada.readLine();
    
    dibuixaTriangleInvertit(text);
    }
    
    public static void dibuixaTriangleInvertit(String text) {
        for (int i = 1; i <= text.length(); i++) {
            dibuixaLiniaInvertida(text, i);
            System.out.println();
        }
    }
    
    public static void dibuixaLiniaInvertida(String text, int linia) {
        for (int j = 0; j <= (text.length() - linia); j++) {
            if (j > 0) {
                System.out.print(", ");
            }
            System.out.print(text.charAt(text.length() - 1 - j));
        }
    }
}
