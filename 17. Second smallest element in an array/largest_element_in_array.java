public class largest_element_in_array {
   public static void main(String[] args) {
    int arr[] = {46,1,2,45,7,8,9,15,18};
    int max= arr[0];

    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max= arr[i];
        }
    }
    System.out.println(max);
   } 
}
