//Print the sum of first N Natural numbers.
package class_4;
import java.util.*;

public class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum=0;
            for(int i=0;i<=11;i++){
                sum = sum + 1;
            }
          System.out.println(sum);
        }
    }
