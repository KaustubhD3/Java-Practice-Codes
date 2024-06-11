import java.util.Arrays;
public class remove_duplicate{
    public static void main(String args[]){
        int arr[]={1,33,562,33,18,33,562,5};
        Arrays.sort(arr);
        int j =0;

        int temp []= new int [arr.length];

        for(int i =0; i<arr.length-1; i++){
            if(arr[i]!= arr[i+1]){
                temp[j++]= arr[i];
            }
        }

        for(int k =0; k<arr.length; k++){
            System.out.println(temp[k]);
        }
    }
}