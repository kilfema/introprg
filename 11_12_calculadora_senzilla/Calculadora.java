/*
 * Aquest programa demana dos operands i un operador binari (+, -, * o /)
 * i mostra el resultat del càlcul corresponent
 */
public class Calculadora {
    public static void main(String[] args) {
    
        System.out.println("Operand 1?");
        double operand1 = Double.parseDouble(Entrada.readLine());
        System.out.println("Operador?");
        char operador = Entrada.readLine().charAt(0);
        System.out.println("Operand 2?");
        double operand2 = Double.parseDouble(Entrada.readLine());
        

        
        double resultat = switch (operador) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> (operand2 == 0)? 
                if (operand2 == 0) {
                    System.out.println("No es pot dividir entre 0");
                    
                } else {
                    operand1 / operand2;
                }
                
            default -> {
                System.out.println("L'operador " + operador + " no està disponible");
                yield =
            }
            
           }
        }; 
        
    }
}
