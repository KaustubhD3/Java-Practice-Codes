import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int a =0;
        int b= 1;
        System.out.println(a);
        System.out.println(b);
        for(int i =0; i<=10; i++){
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
