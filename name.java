
// write a java program to print hcf betwen two number,number is given by user 

package b;
import java.util.Scanner;
public class name {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter two number");
        int a,b,i=1,gcd=1;
        a=obj.nextInt();
        b=obj.nextInt();
        while(i<=a&&i<=b)
        {
            if(a%i==0&&b%i==0)
            {
                gcd=i;}
            i++;
            }
     System.out.print("\n hcf="+gcd);   
        
        }
}  
    

    
