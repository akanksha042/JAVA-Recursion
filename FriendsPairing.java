public class FriendsPairing {
    public static int Pairing(int n){
        //base case
        if(n == 1 || n == 2){
            return n;

        }
        //choices
        //if single 
        // int fnm1 = Pairing(n-1);
        // //if pairing 
        // int fnm2 = Pairing(n-2);

        // int pairways = (n-1)*fnm2;
        // int totalWays = fnm1 + pairways;
        // return totalWays;

        // simplified way
        return Pairing(n-1) + (n-1)*Pairing(n-2);
    }



    public static void main(String args[]){
        System.out.println(Pairing(3));

    }
    
}
