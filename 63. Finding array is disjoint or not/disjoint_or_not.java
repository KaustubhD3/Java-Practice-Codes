public class disjoint_or_not{

    static boolean disjoint(int arr1[], int arr2[]){

        for(int i =0; i<arr1.length;i++){
            for(int j =0; j<arr2.length; j++){
                if(arr1[i]== arr2[j]){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int arr1[]= {45,1,2,18,27};
        int arr2[]= {45,1,2,18,27};

        if(disjoint(arr1, arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}