import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ravi");

        System.out.println(sb);

        //char at index 0
       // System.out.println(sb.charAt(0));

        //set char at index 0
      //  sb.setCharAt(0, 'k');
      //  System.out.println(sb);

      //insert a index
      sb.insert(4, 'j');
      System.out.println(sb);

      //delete the extra 'n'
      sb.delete(1, 4);
      System.out.println(sb);
    }
}
