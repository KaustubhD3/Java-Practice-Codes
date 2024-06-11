import java.util.Scanner;
public class no_of_digits{
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        int num = ss.nextInt();

        int digits =0;

        while(num!=0){
            int rem = num%10;
            digits++;
            num = num/10;

        }
        System.out.println(digits);

    }
}