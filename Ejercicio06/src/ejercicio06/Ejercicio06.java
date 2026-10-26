package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        // TODO code application logic here
        double var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        
        System.out.println("---- Solucion al problema ----");
        
        //Use el operador "&&" para representar "And"
        boolean resultado = ((Math.sqrt(var1) + var2) / var3 == var2) 
                && (var4 > var5) ;
        System.out.println(resultado);
        
        
    }
    
}
