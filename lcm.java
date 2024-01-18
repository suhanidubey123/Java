import java.util.Scanner;
public class lcm {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter two numner:");
        int num1,num2,lcm,hcf=1,i;
        num1=obj.nextInt();
        num2=obj.nextInt();
        
        for(i=1;i<=num1&&i<=num2;i++);
        {
            if(num1%i==0&&num2%i==0)
            {
                hcf=i;}
        }
        
        lcm=(num1*num2)/hcf;
        System.out.print("\nLcm="+lcm);
            }
        }
        
        
        
        
        
        
        
        
