/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa simula un informe on extreu diferents dades d'una cadena de text
 */
public class InformeString {
    public static void main(String[] args) {
        
        //Demana valors
        System.out.println("Text principal?");
        String principal = Entrada.readLine();
        
        System.out.println("Text secundari?");
        String secundari = Entrada.readLine();
        
        System.out.println("Número positiu?");
        int positiu = Integer.parseInt(Entrada.readLine());
        
        //length
        System.out.println("\"" + principal + "\".length(): " + principal.length());
        
        //startsWith
        System.out.println("\"" + principal + "\".startsWith(\"" + secundari + "\"): " + principal.startsWith(secundari));
        
        //endsWith
        System.out.println("\"" + principal + "\".endsWith(\"" + secundari + "\"): " + principal.endsWith(secundari));
        
        //equals
        System.out.println("\"" + principal + "\".equals(\"" + secundari + "\"): " + principal.equals(secundari));
        
        //equalsIgnoreCase
        System.out.println("\"" + principal + "\".equalsIgnoreCase(\"" + secundari + "\"): " + principal.equalsIgnoreCase(secundari));
        
        //isBlank
        System.out.println("\"" + principal + "\".isBlank(): " + principal.isBlank());
        
        //isEmpty
        System.out.println("\"" + principal + "\".isEmpty(): " + principal.isEmpty());
        
        //charAt
        System.out.println("\"" + principal + "\".charAt(" + positiu +"): " + principal.charAt(positiu));
        
        //concat
        System.out.println("\"" + principal + "\".concat(\"" + secundari +"\"): " + principal.concat(secundari));
        
        //repeat
        System.out.println("\"" + principal + "\".repeat(" + positiu +"): " + principal.repeat(positiu));
        
        //toUpperCase
        System.out.println("\"" + principal + "\".toUpperCase(): " + principal.toUpperCase());
        
        //toLoweCase
        System.out.println("\"" + principal + "\".toLowerCase(): " + principal.toLowerCase());
        
    }
}
