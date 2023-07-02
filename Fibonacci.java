public class Fibonacci{


    public static int fibo(int n){
        if(n == 0 || n == 1 ){
            return n;
        }
        // if(n == 1){
        //     return 1;
        // }
        int fibonm1 = fibo(n-1);
        int fibonm2 = fibo(n-2);
        int finalfibo = fibonm1 + fibonm2;
        return finalfibo;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(fibo(n));

    }
    
}