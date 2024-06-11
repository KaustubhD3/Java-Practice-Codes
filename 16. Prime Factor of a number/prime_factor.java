import java.util.Scanner;

public class prime_factor{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int c;

        for(int i=2; i<n; i++){
            if(n%i==0){
              for(int j =2; j<=i; j++){
                if(i%j==0){
                    System.out.println(j);
                }
              }  
            }
        }

      
       

       


    }
}