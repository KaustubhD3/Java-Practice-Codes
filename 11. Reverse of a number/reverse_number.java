import java.util.*;
public class reverse_number{
    public static void main(String[] args) {
        int reverse= 0;
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            int rem= n%10;
            reverse= reverse*10+ rem;
            n/=10;
        }
        System.out.println("Reverse"+ reverse);
    }
}