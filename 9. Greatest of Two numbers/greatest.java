import java.util.Scanner;
public class greatest{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number 1");
        int a= sc.nextInt();
        System.out.println("Enter the number 2 ");
        int b= sc.nextInt();

        if(a>b){
            System.out.println("The no."+ a+ "a is greater");
        }
        else if(b>a){
            System.out.println("The no."+ b+" bis greater");
        }
        else{
            System.out.println("Both are equAL");
        }
    }
}