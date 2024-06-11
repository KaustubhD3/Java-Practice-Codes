import java.util.Scanner;
public class max_handshakes{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();

        int ways= (num)*(num-1)/2;

        System.out.println(ways);
    }
}