import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                temp++;
            }
        }
        if(temp>0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
