public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------Programa funcionando----------");
        
        int num = 5;

        EjerciciosRecursivos e = new EjerciciosRecursivos();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("Resultado de Fibonacci: " + e.fibonacci(num));
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("Resultado de Suma consecutiva: " + e.sumaConsecutivos(num));
//----------------------------------------------------------------------------------------------------------------------
        /* 
        int n = 5;
        int resultado = factorial(n);
    
        System.out.println("Resultado: " + resultado);
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            System.out.println("Alcancé el caso base");
            return 1;
        }
    
        int resultado = n * factorial(n - 1);
        System.out.println("Calculando factorial de: " + n + " * factorial(" + (n - 1) + ")" + " = " + resultado);
    
        return resultado;
        */
//----------------------------------------------------------------------------------------------------------------------
    }
}

