import java.util.Scanner;
public class Arm_strong {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num,n,digit=0,rem,sum=0;
        System.out.print("enter any number");
        num=obj.nextInt();
        n=num;
        while(num!=0)
        {
            num=num/10;
            digit++;}
        num=n;
        while(num!=0)
        {
            rem=num%10;
            sum+=Math.pow(rem,digit);
            num=num/10;}
        if(n==sum)
        {System.out.print("Armstrong number");}
        else{System.out.print("not Armstrong number");}
        
        }
            
        
    }
    
