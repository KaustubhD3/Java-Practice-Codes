public class remove_vowel{
    public static void main(String[] args) {
        String s= "prepinsta";
        String s1= "";
        s1= s.replaceAll("[aeiou]", "");
        System.out.println(s1);
    }
}