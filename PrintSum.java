public class PrintSum{

    // public static int Printt(int n){
    //     int sum = n;
    //     if(n==1){
    //         return n;
    //     }

    //     sum  = sum + Printt(n-1);
    //     return sum;       

    // }

    //Alternative method 
    public static int Printt(int n){
        if(n==1){
            return 1;
        }
        int Sumnm1 = Printt(n-1);
        int Sum = n + Sumnm1;
        return Sum;
    }




    public static void main (String args[]){
        int n=3;
        System.out.println(Printt(n));

    }
}