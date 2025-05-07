import java.util.*;

public class Campare {
    public static void main(String[] args) {
        String name1 = "Ravi";
        String name2 = "Ravi";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value
        
        //1.programming
       // if (name1.compareTo(name2) == 0) {
       //     System.out.println("They are the same string");
       // } else {
        //    System.out.println("They are different string");
        //}

        //2.programming
      //  if (name1 == name2) {
       //     System.out.println("They are same string");
       // } else {
       //     System.out.println("They are different string");
       // }

       //3.question
       if(new String("Ravi") == new String("Ravi")){
        System.out.println("String are equal");
       }
       else{
        System.out.println("String are Not Equal");
       }
    }
}
