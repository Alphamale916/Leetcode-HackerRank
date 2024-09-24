/*
Question 2
Input: 5
Output:
    1
   21
  321
 4321
54321
*/
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                if(j<=i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

