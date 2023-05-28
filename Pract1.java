package PracticalBased;
//Display number in words
import java.io.*;
class Pract1
{ 
  int accept()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    
    System.out.println("Enter a natural number less than 1000");
    int n=Integer.parseInt(in.readLine());
    return n;
  }
  
  String convert(int n)
  { String s="";
    int x=n;
    
    String a[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    String teens[]={"TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
    String t[]={"","TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
    
    if(x>=100)
    { s=a[(x/100)]+" HUNDRED ";
      x%=100;
    }
    
    if(x>10 && x<20)
    { if(n>=100)
        s=s+"AND "+teens[(x%10)];
      else
        s=s+teens[(x%10)];
      x%=10;
    }
    else if(x==10 || x>20)
    { if(n>=100)
        s=s+"AND "+t[(x/10)];
      else
        s=s+t[(x/10)];
      x%=10;
      
      if(x>0)
       s=s+" "+a[x];
    }
    
    return s;
  }
   
  void display(String s)
   { System.out.println(s);
    }
    
   
  static void main()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
     
    Pract1 ob=new Pract1();
    int k=ob.accept();
    if(k<1 || k>999)
      System.out.println("OUT OF RANGE");
    else 
     { String x=ob.convert(k);
       ob.display(x);
     }
    }
}

