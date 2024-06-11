public class sort{

   
    
    public static void main(String[] args) {
        int arr[]= {15,28,45,58,28};
        int n= arr.length;

        for(int i =0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }

            }
        }

        for(int k =0; k<n; k++){
            System.out.println(arr[k]);
        }



    }
}