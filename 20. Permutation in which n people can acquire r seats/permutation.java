import java.util.Scanner;
public class permutation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();

        int fact1= 1;

        for(int i =1; i<n+1;i++){
            fact1= fact1*i;
        }
        
        int num = n-r;

        int fact2=1;
        for(int i= num; i>1; i= i-1){
            fact2= fact2*i;
        }
        System.out.println(fact1/fact2);


    }
}