package PracticalBased;
//Day number to Date, Future date after 'N' days
import java.io.*;
class Pract3
{ static String a="DAY NUMBER",b="YEAR",c="DATE AFTER (N DAYS)",d="OUT OF RANGE";
  static int dn,y,d0,n,d1,m;
  static boolean LeapYear;
  static int x[]={31,28,31,30,31,30,31,31,30,31,30,31};
  static String mth[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
  
  void input()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    
    System.out.println(a);
    dn=Integer.parseInt(in.readLine());
    System.out.println(b);
    y=Integer.parseInt(in.readLine());
    System.out.println(c);
    n=Integer.parseInt(in.readLine());
  }
  
  boolean check()
  { if(y<1000 || y>9999)
    { System.out.println(b+" "+d);
      return false;
    }
      
    if((y%4==0 && y%100!=0) || y%400==0)
     { LeapYear=true;
       if(dn<1 || dn>366)
       { System.out.println(a+" "+d);
         return false;
       }
       if(n<1 || n>100)
       { System.out.println(c+" "+d);
         return false;
       }
       else
        return true;
    }
    else
     { if(dn<1 || dn>365)
       { System.out.println(a+" "+d);
         return false;
       } 
       if(n<1 || n>100)
       { System.out.println(c+" "+d);
         return false;
       } 
       else
        return true;
    }
  }
  
  void date()
  { x[1]=(LeapYear)?29:28;
    m=0;
    d0=dn;
    while(d0>x[m])
    { 
      if(m>11)
      { m=m-1;
        break;
      }
      if(m==1)
      { LeapYear=((y%4==0 && y%100!=0)||y%400==0)?true:false;
        x[m]=(LeapYear)?29:28;
      }
      d0=d0-x[m];
      m++;
    }
    
    System.out.println("DATE: ");
    switch(d0%10)
    { case 1: 
        if(d0>10 && d0<20)
       System.out.println(d0+"TH "+mth[m]+", "+y);
      else
       System.out.println(d0+"ST "+mth[m]+", "+y); 
       break;
      case 2: 
      if(d0>10 && d0<20)
       System.out.println(d0+"TH "+mth[m]+", "+y);
      else
       System.out.println(d0+"ND "+mth[m]+", "+y); 
      break;
      case 3: 
      if(d0>10 && d0<20)
       System.out.println(d0+"TH "+mth[m]+", "+y);
      else
       System.out.println(d0+"RD "+mth[m]+", "+y); 
       break;
      default: System.out.println(d0+"TH "+mth[m]+", "+y);
    }
  }
  
  void date1()
  { d1=dn+n; 
    m=0;
    while(d1>x[m])
    { 
      d1=d1-x[m];
      m++;
      if(m>11)
      { m=0;
        y++;
      }
      if(m==1)
      { LeapYear=((y%4==0 && y%100!=0)||y%400==0)?true:false;
        x[m]=(LeapYear)?29:28;
      }
    } 
     
    System.out.println("DATE AFTER "+n+" DAYS: ");
    switch(d1%10)
    { case 1: System.out.println(d1+"ST "+mth[m]+", "+y); break;
      case 2: 
      if(d1>10 && d1<20)
       System.out.println(d1+"TH "+mth[m]+", "+y);
      else
       System.out.println(d1+"ND "+mth[m]+", "+y); 
      break;
      case 3: System.out.println(d1+"RD "+mth[m]+", "+y); break;
      default: System.out.println(d1+"TH "+mth[m]+", "+y);
    }
  }
  
  static void main()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    Pract3 ob=new Pract3();
    
    ob.input();
    boolean k=ob.check();
    if(k==true)
    { ob.date();
      ob.date1();
    }
  }
}
    
    
    
     
       
      

    
