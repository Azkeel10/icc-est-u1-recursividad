public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------Programa funcionando----------\n");
        
        int numNor = 4;
        int num = 124; 
        int expo = 3;

        System.out.println("Numero normal: " + numNor);
        System.out.println("Numero:" + num);
        System.out.println("Exponente: " + expo);

        EjerciciosRecursivos e = new EjerciciosRecursivos();
//----------------------------------------------------------------------------------------------------------------------
        int fibonacci = e.fibonacci(numNor);
        System.out.println("\nResultado de Fibonacci: " + fibonacci);
//----------------------------------------------------------------------------------------------------------------------
        int sumaConsecutivos = e.sumaConsecutivos(numNor);
        System.out.println("Resultado de Suma consecutiva: " + sumaConsecutivos);
//----------------------------------------------------------------------------------------------------------------------
        int potencia = e.getPotencia(numNor,expo);
        System.out.println("Resultado de Potencia: " + potencia);
//----------------------------------------------------------------------------------------------------------------------
        int sumaDeDigitos = e.sumaDeDigitos(num);
        System.out.println("Resultado de suma de digitos: " + sumaDeDigitos);
//----------------------------------------------------------------------------------------------------------------------
        e.imprimirDescendente(5);
        System.out.println("Desendente");
//----------------------------------------------------------------------------------------------------------------------
        int reverso = e.reverso(num);
        System.out.println("En Reverso: " + reverso);
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

