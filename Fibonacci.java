package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int n = input.nextInt();
        int count=1;
        int c=1,b=1,a=0;
        while(count < n){
            if (count == 1){
                //System.out.print(c+" ");
            }
            c=b+a;
            //System.out.print(c+" ");
            
            a=b;
            b=c;
        
            count++;
        }
        System.out.println();
    }
}
