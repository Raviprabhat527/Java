package class_7;

import java.util.Scanner;

public class Function1 {
   // public static void printMyName(String name)
    public static int printMyName(String name){
         System.out.println(name);
         return 1;
        // return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        
        printMyName(name); // function ko call kiye
    }
}
