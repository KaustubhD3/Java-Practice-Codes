import java.util.*;
public class x_divisors{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int x= sc.nextInt();
        int count =0;

        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        int b=count;

        if(b==x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}