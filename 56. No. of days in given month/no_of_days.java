import java.util.*;
public class no_of_days{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int month = sc.nextInt();
        int year= sc.nextInt();

        if(month>12 || month <0){
            System.out.println("Invalid input");
        }

        else if(month ==2 && year%4==0){
            System.out.println(29);
        }
        else if(month==2){
            System.out.println(28);
        }
        else if(month==1 || month==3|| month ==5 || month ==7|| month==8|| month==10 || month ==12){
            System.out.println(31);
        }
        else{
            System.out.println(30);
        }
    }
}