/*
Print the pattern 
Input=4
Output:
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/
import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int size=2*num-1,end=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int value = num - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(value);
            }
            System.out.println();
        }
        
    }
}


