public class FirstOccur {

    public static int Index(int arr[], int i, int key){
    
        //int key = 10;
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
        return i;
    }
    return (Index(arr , i-1, key));
}

    

    public static void main (String args[]){
        int arr[] = {1,5,6,4,5,7,8,9,5};
        int key = 5;
        System.out.println(Index(arr, 0, key));
      
        

    }
}

