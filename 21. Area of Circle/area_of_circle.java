import java.util.Scanner;
public class area_of_circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();

        double Area = 3.14* radius* radius;
        System.out.println(Area);

        double Circumferrence = 2*3.14* radius;
        System.out.println(Circumferrence);
       
    }
}