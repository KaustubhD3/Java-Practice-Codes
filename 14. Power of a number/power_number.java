import java.util.Scanner;
public class power_number{
    
    
    public static void main(String[] args) {

        

        
    Scanner sc= new Scanner(System.in);
    int base= sc.nextInt();
    int power=sc.nextInt();
    int res= 1;

    while(power!=0){

        res = res*base;
        power--;
    }
    System.out.println(res);


    }
}