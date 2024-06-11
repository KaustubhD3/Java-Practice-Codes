// 10  115   16   18   30
//10    16    18    30

public class deletion{
    public static void main(String[] args) {
       int arr[]= {10,20,30,40,50,60,70};
       int delete= 40;

       for(int i = 0; i<arr.length; i++){
        if(delete== arr[i]){
            for(int j=i; j<arr.length-1; j++){
                arr[j]= arr[j+1];

            }
            break;
        }
       }
       for(int i=0; i<arr.length-1; i++){
        System.out.println(arr[i]);
       }


    }
}