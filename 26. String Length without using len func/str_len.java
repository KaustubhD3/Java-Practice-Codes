import java.util.Scanner;
public class str_len{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String a ="Kaustubh";
        int length =0;

        for(char el:a.toCharArray()){
            length++;
        }
        System.out.println(length);
            
    }
}