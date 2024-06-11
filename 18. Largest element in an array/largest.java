public class largest{
    public static void main(String[] args) {
        int [] marks= {25,35,42,85,52,48};

        int max= marks[0];

        for(int i=0; i<marks.length; i++){
            if(max<marks[i]){
                max=marks[i];
            }
        }
        System.out.println(max);
    }
}