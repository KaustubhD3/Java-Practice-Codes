public class smallest{
    public static void main(String[] args) {
        int [] marks= {025,85,20,84,64};
        int smallest= marks[0];

        for(int i=0; i<marks.length; i++){
             if(smallest>marks[i]){
                smallest= marks[i];
             }
        }
        System.out.println(smallest);
    }
}