import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum=0;
        int c= num;
        while(num>0){
            int rem= num%10;
            sum = sum*10 + rem;
            num= num/10;
        }

        if(c==sum){
            System.out.println("The no. is palindrome");
        }
        else{
            System.out.println("The no. is not palindrome");
        }
    }
}