
public class prime_range{
    public static void main(String[] args) {
        int a= 2;
        int b=5;
        int j;
        int count =0;
        for(int i=2; i<=15; i++){
            if((b%i)!=0){
                // System.out.println(i);
                count++;
            }
            
        }
        System.out.println(count);


 }
}