public class string_palindrome{
    public static void main(String[] args) {
        String original = "arora";
        String rev= "";
        for(int i =(original.length())-1; i>=0; i--){
            rev = rev + original.charAt(i);
        }
        if(original.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not  a plaindrome");
        }
    }
}