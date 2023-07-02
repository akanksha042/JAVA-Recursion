public class contiguousSubstring {
    public static int Print(String str, int i, int j , int n){
        if (n == 1){
            return 1 ;
        }
        if(n <= 0){
            return 0;
        }

        int res = Print(str, i+1, j, n-1) + Print(str, i, j-1, n-1) - Print(str, i+1, j-1, n-2);

        if (str.charAt(i) == str.charAt(j)){
            res ++ ;
        }
        return res;

    }
    public static void main(String args[]){
        //We are given a string S, we need to find the count of all contiguous substrings
// starting and ending with the same character.

        String str = "abcab";
        // a abca b bcab c a b
        int n = str.length();
        System.out.println(Print(str, 0, n-1, n));

    }
    
}
