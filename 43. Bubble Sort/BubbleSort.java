public class BubbleSort{
    
    void sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j =0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

    }
    void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int arr1[]= {44,15,1,7,18,27,5};
        BubbleSort ob= new BubbleSort();
        ob.sort(arr1);
        System.out.println("The sorted array is :");
        ob.print(arr1);
    }
}