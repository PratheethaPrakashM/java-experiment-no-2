import java.util.*;
import java.io.*;
class frequency {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter a string value ::");
        String str = obj.nextLine();
        System.out.println("Enter a particular character ::");
        char character = obj.nextLine().charAt(0);
      int count = 0;
        String str1=str.toLowerCase(); 
      for (int i=0; i<str1.length(); i++){
         if(character == str1.charAt(i)){
            count++;
         }
      }
      System.out.println("Frequency of the give character:: "+count);
    }
}