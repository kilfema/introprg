/*
*Exercici per treballar amb els operadors relacionals
*/

public class OperadorsRelacionals{
    public static void main(String[] args) {
    
    //la teva edat és superior als 18 anys
    int edad = 22;
    boolean mayorDieciocho = edad > 18;
    
    //tens menys de 5 germans
    int hermanos = 2;
    boolean menosHermanos = hermanos < 5;
    
    //la suma de 2 més 5 és igual a 7
    boolean igualSiete = (2 + 5) == 7;
    
    //la suma de 2 més 5 és diferent a 7
    boolean diferenteSiete = (2 + 5) != 7;
    
    //l'any que ve seràs major d'edat
    boolean mayorProximoAno = (edad + 1) >= 18;
    
    //l'any passat encara no eres major d'edat
    boolean menorAnoPasado = (edad - 1) <18;
    
    //tens com a molt 35 companys a classe
    int companerosClase = 32;
    boolean cantidadCompaneros = companerosClase <= 35;
    
    //tens tants companys a classe com anys
    boolean igualCompanerosAnos = companerosClase == edad;
    
    //el Renat té quatre potes
    int patasRenat = 2;
    boolean cantidadPatas = patasRenat == 4;
    
    //estem a més de 28 graus
    int grados = 23;
    boolean temperaturaMasDe = grados > 28;
    
    //Kil es el delegado de clase
    boolean kilDelegado = true;
    boolean confirmarDelegado = kilDelegado == true;
    
    //Kil ha sacado un 10 en el examen de programación
    double notaKil = 10.5;
    boolean confirmarNota = notaKil >= 10;
    
    if (notaKil >10) {
        System.out.println("Y le han sumado medio punto por ser el mejor alumno :D");
       
        }
    }
}
