public class PrintAllOccurence {
    public static void print(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.println(i + " ");
        }
        print(arr, key, i+1);
    }


    public static void main (String args[]){
        int arr[] = {3,2,2,4,5,6,8,2,4,7,1,2};
        int key = 2;
        print(arr, key, 0);
        System.out.println();

    }
    
}
