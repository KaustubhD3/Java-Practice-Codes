public class odd{
    public static void main(String[] args) {
        int arr[] = {15,12,18,1,8,2,5};
        int n = 7;
        int count=0;
        int ar[]=new int[n];

        for(int i =0; i<n; i++){
            if(arr[i]%2==0){
                count++;
                ar[i]=arr[i];   
            }
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
}

        // int arr[]= new int[n-count];
    