import java.util.*;
public class Anagram {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter first string: ");
      String str1 = sc.nextLine();

      System.out.print("Enter second string: ");
      String str2 = sc.nextLine();

      if(str1.length() != str2.length()){
        System.out.println("Not Anagrams");
        return;
      }
      int[] count = new int[256];

      for(int i = 0; i < str1.length(); i++){
        count[str1.charAt(i)]++;
        count[str2.charAt(i)]--;
      }
      boolean anagram = true;

      for(int i = 0;i < 256;i++){
        if(count[i] != 0){
          anagram = false;
          break;
        }
      }
      if(anagram){
        System.out.println("Anagrams");
      }else{
        System.out.println("Not Anagrams");
      }
  }
}