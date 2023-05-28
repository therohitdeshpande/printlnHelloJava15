package PracticalBased;
import java.util.*;
//To display the prime-adam integers in a given range by user
class Pract12
{
    int m,n;
    
    Pract12()
    {
        m=0;
        n=0;
    }
    
    void acceptRange()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lower limit");
        m=sc.nextInt();
        System.out.println("Upper limit");
        n=sc.nextInt();
        if(m<0 || n<0)
        {
            System.out.println("Please enter positive numbers only!");
            acceptRange();
        }
        
        if(m>n)
        {
            System.out.println("Lower limit should be less than upper limit! Please try again");
            acceptRange();
        }
    }
    
    boolean checkPrime(int x)
    {
        int k=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                k++;
                break;
            }
        }
        return (k==0)?true:false;
    }
    
    int reverseNum(int x)
    {
        int xrev=0;
        while(x!=0)
        {
           xrev=xrev*10+(x%10);
           x=x/10;
        }
        return xrev;
    }
    
    boolean checkAdam(int x)
    {
        int y=x*x;
        int x1=reverseNum(x);
        if(checkPrime(x1)==true)
        {
            int y1=x1*x1;
            return (reverseNum(y1)==y)?true:false;
        }
        else
        {
            return false;
        }
    }
    
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        Pract12 ob=new Pract12();
        ob.acceptRange();
        int frq=0;
        System.out.println("The Prime-Adam integers are: ");
        for(int i=ob.m;i<=ob.n;i++)
        {
           if(ob.checkPrime(i)==true)
           {
               boolean x=ob.checkAdam(i);
               if(x==true)
               {
                   System.out.print(i+",");
                   frq++;
               }
           }
        }
        System.out.println();
        System.out.println("Frequency of Prime-Adam integers is: "+frq);
    }
}
