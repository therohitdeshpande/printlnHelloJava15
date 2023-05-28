package PracticalBased;
//Botchagaloop of a number 'x'
import java.io.*;
class Pract6
{ static int x,p,q;
    static String s1,s2;

    Pract6()
    { x=0;
        p=0;
        q=0;
    }

    int convToOctal(int a)
    { String num="";
        int n=a;

        while(n>0)
        { int r=n%8;
            n/=8;
            num=r+num;
        }

        return Integer.parseInt(num);
    }

    int convToDecimal(int b)
    { int num=0;
      int n=b,pow=0;

        while(n>0)
        { int r=n%10;
          n/=10;
          num=num+((int)Math.pow(8,pow)*r);
          pow++;
        }

        return num;
    }

    int sortDigits(int c)
    { String sn="";
        int n=c,d=0;
        while(n>0)
        { d++;
            n/=10;
        }
        n=c;
        int arr[]=new int[d];
        int i=0,j=0;

        while(n>0)
        { arr[i]=n%10;
            n/=10;
            i++;
        }

        for(i=0;i<arr.length-1;i++)
        { for(j=0;j<(arr.length-1)-i;j++)
          { if(arr[j]>arr[j+1])
            { int t=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=t;
            }
          }
        }
    
        for(i=0;i<arr.length;i++)
            sn=sn+arr[i];

        return Integer.parseInt(sn);
    }

    static void main()throws IOException
    { InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Pract6 obj=new Pract6();

        System.out.println("Please enter any number");
        x=Integer.parseInt(in.readLine());
        int y=x;
        if(x<=0)
        { System.out.println("Please enter a positive number only!");
          obj.main();
        }
        else
        {System.out.print("Botchagaloop of "+x+" is- ");

            int i=1;
            while(i<=5)
            { p=obj.convToOctal(x);
              q=obj.sortDigits(p);

              if(q<p)
              {   y=obj.convToDecimal(p)-obj.convToDecimal(q);
                  i++;
              }
                else
                    break;
            }

            System.out.print(y);
        }
    }
}

