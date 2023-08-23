
package XII_Record_Programs;


import java.util.*;
public class ddmmyy 
{
    public static void main(String[]args)
    {
        String s,d="",m="",y="",M="",D,Y="";
        int check=0;
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the six digits - ddmmyy");
        s=sc.nextLine();
        int len=s.length();
        for (int i=0;i<len;i++)
        {
            char c=s.charAt(i);
            if(i==0||i==1)
                d=d+c;
            if(i==2||i==3)
            m=m+c;
            if(i==4||i==5)
            y=y+c;
        }
        int mon=Integer.parseInt(m);
        int day=Integer.parseInt(d);
        if(mon<=12)
        {
        for(int i=0;i<12;i++)
        {
            
            if(mon-1==i)
            {
                if (mon==2)
                {
                    if(day>29)
                    {
                        System.out.println("INVALID DATE");
                        i=13;
                        check=1;
                        break;
                    }
                    else
                    M=month[i];
                }
                else
                M=month[i];
            }
        }
        }
        else 
        {
           System.out.println("INVALID DATE");
           check=1;
                
         }
        if(check!=1&&day<=31)
        {
            if(mon==2)
            {
                if(day>0&&day<=10)
                {
                    if(d.charAt(1)=='1')
                    d=d+"st ";
                    else if(d.charAt(1)=='2')
                    d=d+"nd ";
                    else if(d.charAt(1)=='3')
                    d=d+"rd ";
                    else
                    d=d+"th ";
                }
                else if(day>20&&day<=29)
                {
                    if(d.charAt(1)=='1')
                    d=d+"st ";
                    else if(d.charAt(1)=='2')
                    d=d+"nd ";
                    else if(d.charAt(1)=='3')
                    d=d+"rd ";
                    else
                    d=d+"th ";
                }
                else
                d=d+"th ";
            }
            else if(mon%2==0&&mon!=2)
            {
                if(day>0&&day<=10)
                {
                    if(d.charAt(1)=='1')
                    d=d+"st ";
                    else if(d.charAt(1)=='2')
                    d=d+"nd ";
                    else if(d.charAt(1)=='3')
                    d=d+"rd ";
                    else
                    d=d+"th ";
                }
                else if(day>20&&day<=31)
                {
                    if(d.charAt(1)=='1')
                    d=d+"st ";
                    else if(d.charAt(1)=='2')
                    d=d+"nd ";
                    else if(d.charAt(1)=='3')
                    d=d+"rd ";
                    else
                    d=d+"th ";
                }
                else
                d=d+"th ";
                
            }
            else
            {
                if(day>0&&day<=10)
                {
                    if(d.charAt(1)=='1')
                    d=d+"st ";
                    else if(d.charAt(1)=='2')
                    d=d+"nd ";
                    else if(d.charAt(1)=='3')
                    d=d+"rd ";
                    else
                    d=d+"th ";
                }
                else if(day>20&&day<=30)
                {
                    if(d.charAt(1)=='1')
                    d=d+"st ";
                    else if(d.charAt(1)=='2')
                    d=d+"nd ";
                    else if(d.charAt(1)=='3')
                    d=d+"rd ";
                    else
                    d=d+"th ";
                }
                else
                d=d+"th ";
            }
        }
        else
        {
            System.out.println("INVALID DATE");
            check=1;           
        }
        if(check!=1)
        {
            Y=y;
            System.out.println(d+M+", "+"20"+Y);
            System.out.println("VALID DATE");
        }
    }
}
        
            
                
        
        