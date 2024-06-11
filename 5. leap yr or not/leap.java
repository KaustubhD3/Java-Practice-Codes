import java.util.Scanner;
public class leap{
    public static void main(String[] args) {
        Scanner lp= new Scanner(System.in);
        int leap= lp.nextInt();

        if(leap%4==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}