public class PrintIncreasing {

    // public static void printt(int n){
    //     int limit = 10;
    //     if(n==limit){
    //         return;
    //     }
    //     System.out.println(n);
    //     printt(n+1);
    // }



    //another alternative
    public static void printt(int n){
        if(n==1){
            return;
        }
        printt(n-1);
        System.out.println(n);
    }
    
    public static void main(String args[]){
        int n = 10;
        printt(n);
    }
}
