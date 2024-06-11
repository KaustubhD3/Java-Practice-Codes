import java.util.Scanner;
public class even_odd{
    public static void main(String[] args) {
        
        Scanner a= new Scanner(System.in);
        int b= a.nextInt();

        if(b%2==0){
            System.out.println("The no. is even");
        }
        else{
            System.out.println("Odd");
        }
    }
}