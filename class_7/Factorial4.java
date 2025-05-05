package class_7;

import java.util.Scanner;

public class Factorial4 {
    public static void PrintFactorials(int n){
        int fact=1;
        for(int i=n; i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintFactorials(n);
    }
    
}
