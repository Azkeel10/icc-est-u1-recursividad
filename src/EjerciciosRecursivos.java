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