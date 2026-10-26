package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 10;
        int var2 = 2;
        double var3 = 16;
        double var4 = 20;
        int var5 = 1;
        int var6 = 11;
        
        System.out.println("---- Solucion al problema ----");
        
        //Para este ejercicio usare la funcion Math.pow y Math.sqrt
        double resultado = Math.pow(var1, var2) + Math.sqrt(var3) + 
                (var4 / (var5 + var6));
        //Respuesta del ejercicio
        System.out.println(resultado);
                
    }
    
}
