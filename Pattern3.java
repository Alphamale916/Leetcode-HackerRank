/*
Question 3
Input: 6
Output:
                1
              2 4
            3 5 7
        6 8 10 12
    9 11 13 15 17
14 16 18 20 22 24

*/

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxWidth = String.valueOf(n * 2).length() + 1;
        int a=2,b=1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                if(j<=i){
                    if(i%2==0){
                        System.out.printf("%" + maxWidth + "d", a);
                        a+=2;
                    }else{
                        System.out.printf("%" + maxWidth + "d", b);
                        b+=2;
                    }
                        
                }else{
                    System.out.print(" ".repeat(maxWidth));
                }
            }
            System.out.println();
        }
    }
}
