public class reverse{
    public static void main(String[] args) {
        int arr[]= {45,15,46,18,19};

        int n = arr.length;
        int start= 0; int end = n-1;

        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}