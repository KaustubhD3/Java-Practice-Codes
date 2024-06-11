public class duplicate{
    public static void main(String[] args) {
        int [] arr= {15,28,17,25,29,18,28,15};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]== arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
