import java.util.Scanner;
public class zero_to_one{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        String s= Integer.toString(num);

        String str= s.replaceAll("0", "1");

        System.out.println(str);
        
        
    }
}