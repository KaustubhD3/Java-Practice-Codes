import java.util.Scanner;
public class sum_of_elements_array{
    public static void main(String[] args) {
        int []arr= {25,15,17,28};
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }
}