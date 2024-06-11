import java.util.Scanner;
public class sum_of_digits{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int rem, sum=0;
    System.out.println("The Number given is ");    
    int n= sc.nextBigInteger();
    

    while(n>0){
        rem = n%10;
        sum = sum + rem;
        n= n/10;

    }
        System.out.println(sum);
    }
}