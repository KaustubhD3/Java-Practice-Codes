public class merge {
    public static void main(String[] args) {
        int arr1[]= {15,18,22,27};
        int arr2[]={112,17,19,25};

        // arr3 = 15,18,22,27,112,17,19,25
        int arr3[]= new int[arr1.length+ arr2.length];

        for(int i=0; i< arr1.length; i++){
            arr3[i]= arr1[i];

        }
        int val=0;
        for(int i = arr1.length; i<(arr1.length+arr2.length); i++){
            arr3[i]= arr2[val];
            val++;
        }

        for(int j =0; j<(arr1.length+arr2.length); j++){
            System.out.println(arr3[j]);
        }
     }
}
