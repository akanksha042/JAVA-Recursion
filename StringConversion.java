public class StringConversion {
    static String digits[] = {"zero" , "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


    public static void print(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        print(number/10);
        System.out.print(digits[lastDigit]  + " ");

    }
    public static void main(String args[]){
        print(1234);
        print(0);

    }
    
}
