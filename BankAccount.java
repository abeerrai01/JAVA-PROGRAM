import java.util.*;
 
public class BankAccount 
{
    static double balance=1000;
   static void withdraw(double w)
    {
        System.out.print("ENTER AMOUNT TO WITHDRAW : ");
         double withdraw=w;
        if(balance>=withdraw)
        {
            balance=balance-withdraw;
            System.out.println("AMOUNT WITHDRAWL : "+withdraw);

            System.out.println("THANKING FOR USING OUR BANK");
        }
        else
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
    static void deposit(double d)
    {
        System.out.println("AMOUNT TO BE DEPOSIT : "+d);
        balance=balance+d;
    }
    static void check()
    {
    System.out.println("CURRENT BALANCE : "+balance);
    }
    public static void main(String[] args) 
    {
       Scanner in=new Scanner(System.in);
       double withdraw,d;
       boolean loop=true;
       while(loop==true)
       {
       System.out.println("CHOOSE FROM THE FOLLOWING OPERATION : \n 1 : CHECK BALANCE \n 2 : DEPOSIT \n 3 : WITHDRAW");
       int c=in.nextInt();
       switch (c) {
        case 1:
            check();
            break;
       case 2:
       {
          System.out.print("ENTER THE AMOUNT YOU WANT TO DEPOSIT : ");
          d=in.nextDouble();
           deposit(d);
           break;
       }
       case 3:
       {
          System.out.print("ENTER THE AMOUNT YOU WANT TO WITHDRAW : ");
          withdraw=in.nextDouble();
           withdraw(withdraw);
           break;
       }
        default:
            break;
       }
      System.out.println("do you want to wish to operate again \n 1 : yes \n 2 : no");
      int choice=in.nextInt();
      if(choice==1)
      {
        loop=true;
      }
      else
      {
        loop=false;
      }
    }
    }
}