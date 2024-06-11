public class array_sorted {
    public static void main(String[] args) {
        int arr[]= {10,18,19,25,45,17};
        int count=0;

        for(int i =0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }

        if(count>0){
            System.out.println("Not sorted");
        }else{
            System.out.println("sorted");
        }


    }
}
