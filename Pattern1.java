/*   Question 1--Input: 5
Output:
12345
23451
34512
45123
51234  */
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a>n)
                    a=1;
                System.out.print((a++)+" ");
            }
            b++;
            a=b;
            System.out.println();
        }
    }
}
