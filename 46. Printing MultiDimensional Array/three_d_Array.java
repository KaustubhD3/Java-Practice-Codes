public class three_d_Array
{
    public static void main(String[] args) {
        int arr[][]= {{40,15},{1,7,1},{8,14}};
        for(int i=0; i<arr.length; i++ ){
            for(int j =0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}