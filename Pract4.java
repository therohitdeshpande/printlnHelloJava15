package PracticalBased;
//Array Sorting, Matrix Display as per sorted array
import java.io.*;
class Pract4
{ static int n;
  boolean checkforN()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    
    System.out.println("N= ");
    n=Integer.parseInt(in.readLine());
    if(n>2 && n<10)
      return true;
    else
      return false;
  }

  void operation()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int a[]=new int[n];
    System.out.println("ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY");
    for(int i=0;i<n;i++)
    { a[i]=Integer.parseInt(in.readLine());
      if(a[i]<=0)
      { System.out.println("ENTER POSITIVE NUMBER");
        a[i]=Integer.parseInt(in.readLine());
      }
    }
  
    int min=0,t=0;
    for(int i=0;i<n;i++)
    { min=i;
     for(int j=i+1;j<n;j++)
     { if(a[j]<a[min])
       min=j;
      }
     t=a[i];
     a[i]=a[min];
     a[min]=t;
    }
   
    System.out.println("Sorted Array");
    for(int i=0;i<n;i++)
     System.out.println(a[i]);
  
    int b[][]=new int[n][n];
    for(int i=n-1,k=0;i>=0;i--,k++) 
    { for(int j=0;j<=i;j++) 
        b[k][j]=a[j];
      for (int l=n-1;l>i;l--) 
        b[k][l]=a[l-i-1];
    }
  
    System.out.println("FILLED MATRIX: ");
    for(int i=0;i<n;i++)
    { for(int j=0;j<n;j++)
        System.out.print(b[i][j]+"\t");
      System.out.println();
    }
  }
  
  
  static void main()throws IOException
  { InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    Pract4 ob=new Pract4();
    
    boolean k=ob.checkforN();
    if(k==true)
     ob.operation();
  }
}



  
  
    
  
  
    
