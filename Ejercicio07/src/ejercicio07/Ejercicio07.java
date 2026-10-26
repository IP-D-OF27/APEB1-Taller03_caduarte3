package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        double var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        double var6 = 100;
        int var7 = 25;
        
        System.out.println("---- Solucion al problema ----");
        
        //Use el operador "&&" para representar "AND" y || para "OR"
        boolean resultado = ((Math.sqrt(var1) + var2) / var3 == var2) 
                || (var4 > var5) && ((var6 / var7) >= Math.sqrt(var6));
        System.out.println(resultado);
        
        
        
    }
    
}
