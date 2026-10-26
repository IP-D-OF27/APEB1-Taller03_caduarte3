package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        // TODO code application logic here
        double var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 5;
        int var5 = 2;
        
        //Al tener booleanos directos combine operaciones matematicas y logicas
        boolean resultado = ((Math.sqrt(var1) * var2) >= var3) 
                && true || false || ((var2 / var4) >= var5);
        
        System.out.println(resultado);
    }
    
}
