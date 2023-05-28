package PracticalBased;
//Date of Birth 
import java.io.*;
class Pract2
{ static int d;
  static int m;
  static int y;
  static int dm[]={31,28,31,30,31,30,31,31,30,31,30,31};
  static boolean LeapYear;
  void input()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    
    System.out.println("Enter your date of birth in DD MM YYYY format");
    d=Integer.parseInt(in.readLine());
    m=Integer.parseInt(in.readLine());
    y=Integer.parseInt(in.readLine());
  }
  
  boolean check()
  { if(m>12 || m<1)
     return false;
    else
    { if((y%4==0 && y%100!=0) || y%400==0)
      { dm[1]=29;
        LeapYear=true;
      }
     
     if(d>dm[m-1] || d<1)
       return false;
      
     if(m==3)
       { if(d>29 && y>=2021)
          return false;
        }
     
     if(m>3 && y>=2021)
      return false;
     else
      return true;
     } 
   }
  
   int daynum()
  { int dn=d;
    for(int i=1;i<m;i++)
    { switch(i)
     {case 1: 
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12: dn+=31;
      break;
      case 4:
      case 6:
      case 9:
      case 11: dn+=30;
      break;
      case 2: 
      if(LeapYear)
        dn+=29;
      else
        dn+=28;
      }
    }
    
    return dn;
   }
   
  static void main()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    Pract2 ob=new Pract2();
     
    ob.input();
    boolean k=ob.check();
    if(k==false)
     System.out.println("INVALID DATE");
    else if(k==true)
    { System.out.println("VALID DATE");
      int day=ob.daynum();
      System.out.println(day);
    }
  }
}
