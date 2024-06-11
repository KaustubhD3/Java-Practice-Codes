import java.util.*;
public class no_of_times_digit_occur{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  num = sc.nextInt();
        int a= 5;
        int count =0;

        while(num>0){
            int rem = num%10;
            if(rem == a){
                count++;
            }
            num = num /10;

        }
        System.out.println(count);

    }
}