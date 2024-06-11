import java.util.Scanner;
public class insertion{
    public static void main(String[] args) {
        int size, pos, item,i;
        Scanner sc= new Scanner(System.in);
        size= sc.nextInt();
        int arr[] = new int[size+1];

        for(i =0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        pos= sc.nextInt();
        item= sc.nextInt();

        for(i= size; i>pos; i--){
            arr[i]= arr[i-1];
        }
        arr[pos]= item;
        
        for( i =0; i<arr.length; i++){
            System.out.println(arr[i]);

        }




    }
}