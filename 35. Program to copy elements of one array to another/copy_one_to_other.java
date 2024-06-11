public class copy_one_to_other{
    public static void main(String[] args) {
        int arr[]= {46,1,8,15,25,70};
        int arr1[]= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr1[i]= arr[i];
        }
        System.out.println("Elements of original array are: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println("Elements of duplicate array");
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}