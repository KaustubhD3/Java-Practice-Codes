import java.util.*;
public class print_duplicae {
    public static void main(String[] args) {
        int arr[]= {1,2,3,13,2,11,2,13};
        Arrays.sort(arr);
        int temp[]= new int[arr.length];
        int j=0;
        for(int i =0; i<arr.length-1; i++){
            if (arr[i]==arr[i+1]) {
            temp[j++]= arr[i];
                
            }
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(temp[k]);
        }

    }
}
