import java.util.*;

public class Vote {
    public static boolean isElligible(int age){
        if(age>18){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int age = x.nextInt();

        System.out.println(isElligible(age));
    }
}
