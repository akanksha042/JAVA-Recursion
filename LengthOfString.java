import java.util.StringTokenizer;

public class LengthOfString {
    public static int print(String str){
        if(str.length() == 0 ){
            return 0 ;
        }
        return print(str.substring(1))  + 1;

    }
    public static void main (String args[]){
        String str = "akanskha";
        System.out.println(print(str));

    }
    
}
