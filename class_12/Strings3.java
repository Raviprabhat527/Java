import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String UserName = " ";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                UserName += email.charAt(i);
            }
        }
        System.out.println(UserName);
    }
}
