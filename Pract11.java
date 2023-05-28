package PracticalBased;
//import java.io.*;
//convert a sentence into palindromic sentence
//PRACT5 WITHOUT USING STRING BUFFER
import java.io.*;
public class Pract11
{
    String str,str1;
    int len;

    Pract11()
    {
        str="";
        str1="";
    }

    void accept()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a sentence");
        str=in.readLine();
        str=str.trim();
        if(str.indexOf('.')==-1 && str.indexOf('!')==-1 && str.indexOf('?')==-1)
        {
            System.out.println("The sentence should end with '.','!' or '?' only. Please try again");
            accept();
        }
        else
        {
            int k=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='.' || str.charAt(i)=='?' || str.charAt(i)=='!')
                {
                    k=i;
                    break;
                }
            }
            str=str.substring(0,k);
            str=str.toUpperCase();
            len=str.length()+1;
        }
    }

    boolean checkPalin(String x1)
    {
        String p="";
        for(int i=x1.length()-1;i>=0;i--)
        {
            p=p+x1.charAt(i);
        }

        return (p.equals(x1))?true:false;
    }

    String convPalin(String x2)
    {
        String p="";
        for(int i=x2.length()-2;i>=0;i--)
        {
            p=p+x2.charAt(i);
        }
        x2=x2+p;
        return x2;
    }

    void display()
    {
        System.out.println("Original string: "+str);
        System.out.println("Modified string: "+str1);
    }

    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Pract11 ob=new Pract11();

        ob.accept();
        int p=0;
        ob.str=ob.str+" ";
        String x="",y="";
        for(int i=0;i<ob.len;i++)
        {
            if(ob.str.charAt(i)==' ')
            {
                x=ob.str.substring(p,i);
                p=i+1;
                if(ob.checkPalin(x)==true)
                {
                    y=y+x+" ";
                }
                else
                {
                    y=y+ob.convPalin(x)+" "; 
                } 
            }
        }
        ob.str1=y;
        ob.display();
    }
}
