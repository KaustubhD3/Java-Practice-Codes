import java.util.*;
public class ArrayList_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(16);
        al.add(12);

        for(int i =0; i<al.size() ; i++){
            if((al.get(i))>(al.get(i+1))){
                int temp = al.get(i);
                al.get(i)= al.get(i+1);
                al.get(i+1)= temp;
            }
        }

        System.out.println(al);
    }
}
