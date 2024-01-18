import java.util.Scanner;
public class sumofirstevennumber {
    
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    System.out.print("enter any numner");

    {
        int a=obj.nextInt();
        int sum=0,count=0,i=2;
        do{if(i%2==0)
        {System.out.print(i+" ");
            sum=sum+i;
            count++;}
            i++;}
        while(count!=a);
        System.out.print("sum="+sum);
         
}
}
}