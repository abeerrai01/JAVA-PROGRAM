import java.util.*;
public class SmallestAndMaximumInArray
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY");
        int l=in.nextInt();
        int temp;
     int a[]=new int[l];
     System.out.println("ENTER ARRAY");
     for(int i=0;i<l;i++)
     {
       a[i]=in.nextInt();
     } 
     for(int i=0;i<l-1;i++)
     {
        for(int j=0;j<l-1;j++)
        {
        if(a[j]>a[j+1])
        {
            temp=a[j+1];
            a[j+1]=a[j];
            a[j]=temp;
        }
     } 
    }
     System.out.println("smallest number in array : "+a[0]);
     System.out.println("Largest number in array : "+a[l-1]);

}
}