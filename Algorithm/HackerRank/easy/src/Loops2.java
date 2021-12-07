import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int plus = 0;
            int total;
            for (int j=1; j<n+1; j++){
                plus += (int) ((Math.pow(2,j-1)) *b);
                total = plus + a;
                System.out.print(total+" ");

            }
            System.out.println("");

        }
        in.close();
    }
}