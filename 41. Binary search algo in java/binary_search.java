import java.util.*;
public class binary_search{
    public static void main(String[] args) {
        int[] arr= {18,27,15,25,16,8,12};

        Arrays.sort(arr);

        int search = 16;
        int l=0;
        int r=arr.length-1;
        int mid= (l+r)/2;
        
        while(l<=r){
        if(arr[mid]== search){
            System.out.println("Elements is at"+ mid+" index position");
            break;
        }
        else if(arr[mid]<search){
            l= mid+1;
        }
        else{
            r= mid-1;
        }
        mid= (l+r)/2;
    }
    if(l>r){
        System.out.println("Element is not present");
    }
    }
}