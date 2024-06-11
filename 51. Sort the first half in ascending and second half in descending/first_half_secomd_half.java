import java.util.*;
public class first_half_secomd_half{

    static void print_order(int arr[], int n){

        Arrays.sort(arr);

        for(int i =0; i<n/2; i++){
            System.out.println(arr[i]);
        }

        for(int j=n-1; j>=n/2; j-- ){
                System.out.println(arr[j]);
        }

    }
    public static void main(String[] args) {
        int arr[]= {4,3,2,1,18,25,69,45};
        int n = arr.length;

        print_order(arr, n);

        
    }

}