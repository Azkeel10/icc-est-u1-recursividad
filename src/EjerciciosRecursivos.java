public class EjerciciosRecursivos {
    public int fibonacci(int n){
        if (n <= 1){
        return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
//----------------------------------------------------------------------------------------------------------------------
    public int sumaConsecutivos(int n){
        //if(n==1) return 1;

        //return n + sumaConsecutivos(n-1);

        if (n == 1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n - 1);
        int resultado = n + resultadoParcial;
        return resultado;
    }
//----------------------------------------------------------------------------------------------------------------------
    public int getPotencia(int base, int expo){
        if (expo == 0) {
            return 1;

        } else if (expo < 0) {
            return 1 / getPotencia(base, -expo);

        } else {
            return base * getPotencia(base, expo - 1);
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    public int sumaDeDigitos(int num){
        if (num < 10){
            return num;
        }else{
            int ultimo = num %10;
            int primero = num /10;
            return sumaDeDigitos(primero) + ultimo;
        }
        
        
    }
//----------------------------------------------------------------------------------------------------------------------
public void imprimirDescendente(int n) {
    if (n < 1) return;
    System.out.print(n + " ");
    imprimirDescendente(n - 1);
}
//----------------------------------------------------------------------------------------------------------------------
    public int reverso(int n) {
        return reversoHelper(n, 0);
    }

    private static int reversoHelper(int n, int resultado) {
        if (n == 0) return resultado;
        return reversoHelper(n / 10, resultado * 10 + n % 10);
    }
    
//----------------------------------------------------------------------------------------------------------------------
}
//----------------------------------------------------------------------------------------------------------------------
/*      Codigo fibonacci
 * public int fibonacci(int n){
 *      if (n==0){
 *          return 0;
 *      }else if(n==1){
 *          retutn 1;
 *      }
 *      return fibonacci(n-1) + fibonacci(n-2);
 *  }
 */