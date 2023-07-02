public class BinaryStringProblem {
    public static void Print(int n,int lastDigit, String str ){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // if(lastDigit == 0){
        //     //sit 0 on chair n
        //     Print(n-1,0,str.append("0"));
        //     Print(n-1,1,str.append("1"));
        // }

        // else{
        //     Print(n-1, 0, str.append("0"));
        // }


        Print(n-1, 0, str+"0");
        if(lastDigit == 0){
            Print(n-1,1,str+"1");

        }

    }




    public static void main(String args[]){
        Print(3, 0,"");

    }
    
}
