
public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;

           //outer loop
        for(int i=1; i<=n; i++){

            //inner loop -> space print
        for(int j=1; j<=n-1; j++){
            System.out.println(" ");
         }  
            //inner loop -> star print
          for(int j=1; j<=i; j++) {
          System.out.println("*");
         }
         System.out.println(); 
        }    
    }
    
}
