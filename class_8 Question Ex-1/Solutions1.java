import java.util.*;

public class Solutions1 {
    public static Double getcircumference(Double radius){
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();

        System.out.println(getcircumference(r));
    }
    
}
