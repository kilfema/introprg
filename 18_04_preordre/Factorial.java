 public class Factorial {
    public int factorial(int n) {
        
        if (n==0) return 1;
        
        return n * factorial(n-1);
    }
    
    public static void main(String[] args) {
        
        Factorial valor = new Factorial();
        System.out.println(valor.factorial(5) + "\n");
    }
}

