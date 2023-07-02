public class Factorial {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
       
        // System.out.print(n);
        //fnm1 = Factorial of n minus of 1
        int fnm1 = fact(n-1);
        int factt = (fnm1 * n);
        return factt;
        
    }





    public static void main(String args[]){
        int n = 5;
        // fact(n);
        System.out.println(fact(n));
    }
    
}
