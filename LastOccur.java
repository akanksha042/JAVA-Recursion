public class LastOccur {

    // public static int Occur(int arr[], int i, int key){
    //     if(i == arr.length){
    //         return -1;
    //     }
    //     if(arr[i] == key){
    //         return i;
    //     }
    //     return (Occur(arr,i-1,key));
    // }

    //alternative
    public static int Occur(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = Occur(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
       
        return isFound;
    }


    public static void main (String args[]){
        int arr[] = {1,6,5,7,8,9,7,5,6,7,0};
        int key = 7;
        int last = arr.length-1;
        System.out.println("target key is : " + key);
        System.out.println("array length  :" + (arr.length-1));
        //System.out.println("Target Key last occurence is at index : " + Occur(arr,last,key));
         System.out.println("Target Key last occurence is at index : " + Occur(arr,0,key));
    }
    
}
