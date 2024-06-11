 public class sub_array{

    static void res(int arr[]){
        int result= arr[0];
        int n =arr.length;
        for(int i=0;i<n; i++){
            int mul = arr[i];

            for(int j =i+1; j<n; j++){
                mul= mul* arr[j];
            }

            result = Math.max(result, mul);
        }
        System.out.println(result);
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4};
        res(arr);
    }
}