import java.util.*;
public class fibonacci 
{
    public static void main(String[] args) 
    {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter Number Of Terms");
     int l=in.nextInt();
     int i,a=0,b=1,sum;
     System.out.print(a+" ,"+b);
     for(i=1;i<=l;i++)
     {
       sum=a+b;
       a=b;
       b=sum;
       System.out.print(" ,"+sum);
     }   
    }
}
