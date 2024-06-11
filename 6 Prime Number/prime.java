import java.util.Scanner;
public class prime{
     public static void main(String[] args) {
        Scanner pmn= new Scanner(System.in);
        int n= pmn.nextInt();
        int temp = 0;

        for(int i=2; i<n; i++){
            if(n%i==0){
                temp= temp+1;
            }
            
        }
        if(temp>0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }


     }
}
