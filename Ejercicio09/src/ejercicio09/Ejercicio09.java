package ejercicio09;
public class Ejercicio09 {
    public static void main(String[] args) {
        // TODO code application logic here
        double var1 = 81;
        double var2 = 25;
        int var3 = 10;
        int var4 = 50;
        
        System.out.println("---- Solución del ejercicio ----");
        
        //La multiplicación se resuelve antes que las sumas
        boolean resultado = (Math.sqrt(var1) + (Math.sqrt(var2) * var3)) >= var4;
        
        System.out.println(resultado);
    }
    
}
