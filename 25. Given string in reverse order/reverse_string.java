import java.util.Scanner;
public class reverse_string{
    public static void main(String[] args) {
        String original = "Kaustubh";
        String rev = "";

        for(int i =original.length()-1; i>=0; i--){
            rev = rev+ original.charAt(i);
        }

        System.out.println(rev);

    }
}