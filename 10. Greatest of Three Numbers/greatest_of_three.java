import java.util.*;
public class greatest_of_three{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("The no. a is greater");
        }
        else if(b>=a && b>=c){
            System.out.println("The no.. bis greater");
        }
        else{
            System.out.println("The no. c is grater");
        }


    }
}