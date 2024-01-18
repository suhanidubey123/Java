
// write a java program to print multiplication table of given number using do while loop

import java.util.Scanner;
public class multiplication_table {
    
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.print("enter any number");
        int num=obj.nextInt();
        int i=1;
        do{
            System.out.println(i+"X"+num+"="+i*num);
            i++;}
        while(i<=10);
        }
        
        
        
        
        
        
        
        
        
    }
    
