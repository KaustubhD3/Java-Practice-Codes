public class count_fr {

    public static void main(String[] args) {
        int arr1[]= {1,18,15,15,1,2,2,22,18,25};
        int n =arr1.length;

        count(arr1, n);

        
    }
    static void count(int arr[], int n){

        for(int i=0; i<n; i++){
            int flag=0;
            int count=0;

            for(int j=i+1; j<n; j++){
                if(arr[i]== arr[j]){
                    flag=1;
                    break;
                }
            }

            if(flag ==1){
                continue;
            }

            for(int j =0;j<=i; j++){
                if(arr[i]== arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" "+ count);
        }

    }
    /*public static void main(String[] args) {
        int arr1[]= {1,18,15,15,1,2,2,22,18,25};
        int n =arr1.length;

        count(arr1, n);

        
    }*/
}
