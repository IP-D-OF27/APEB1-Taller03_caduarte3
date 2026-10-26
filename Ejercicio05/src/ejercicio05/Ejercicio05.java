package ejercicio05;
public class Ejercicio05 {
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 2;
        double var2 = 12;
        int var3 = 1;
        int var4 = 3;
        
        System.out.println("---- Solucion al problema ----");
        
        //Para esta operacion use la misma variable al tener el mismo valor 
        //en base como en exponente
        double resultado = (Math.pow(var1, var1) + var2 - var3) / var4;
        
        System.out.println(resultado);
        
        
    }
    
}
