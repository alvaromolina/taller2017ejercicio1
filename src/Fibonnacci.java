/**
 * Created by amolina on 13/02/17.
 */
public class Fibonnacci {


    public static void main(String[] args){


        final int MAX_NUMBER = 4_000_000;
        int fib0 = 1;
        int fib1 = 1;
        int fib2 = 2;

        int suma = 0;

        while(fib2 < MAX_NUMBER){
            if(fib2 % 2 == 0){
                suma += fib2;
            }
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib1 + fib0;

        }
        System.out.println(suma);

    }

}
