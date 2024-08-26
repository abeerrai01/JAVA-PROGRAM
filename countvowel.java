import java.util.*;
public class countvowel 
{
 public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    s=s.toLowerCase();
  
    int countV=0,countC=0;
    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        if(c=='a' || c=='e'|| c=='o'|| c=='i'|| c=='u')
        {
            countV++;
        }
        else if(c==' ')
        {

        }
        else{
            countC++;
        }
    }
    System.out.println("NUMBER OF VOWELS : "+countV);
    System.out.println("NUMBER OF consonants : "+countC);
 }
    
}
