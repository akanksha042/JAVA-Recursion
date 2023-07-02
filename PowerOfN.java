public class PowerOfN {
    public static int Power(int x, int n){
        if( n == 0 ){
            return 1;
        }
        // int xnm1 = Power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        // alternative
        return x * Power(x, n-1);
    }
    public static void main(String args[]){
        int x = 2;
        int n = 4;
        System.out.println("Power of X raise to N is : " + Power(x, n));

    }
    
}
