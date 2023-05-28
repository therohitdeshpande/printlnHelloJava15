[package PracticalBased;
//permutable prime
import java.io.*;
class Pract7
{ 
  static int n,k;
  
  Pract7()
  { n=0;
    k=0;
  }
  
  boolean singleDigitCheck(int z)
  { int n1=z;
    int cd=0;
    boolean c;
    while(n1!=0)
    { n1/=10;
      cd++;
    }
    
    c=(cd==1)?true:false;
    return c;
  }
  
  int permutations(int z)
  {

  boolean checkPrime(int z)
  { int x=0;
    boolean f;
    for(int i=0;i<=z;i++)
     x=(z%i==0)? x++:x;
    f=(x==2)? true:false;
    return f;
  }
  
  static void main()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    Pract7 ob=new Pract7();
    
    System.out.println("N= ");
    n=Integer.parseInt(in.readLine());
    
    boolean a=ob.singleDigitCheck(n);
    boolean b=
 
  
 