package currency;

import java.util.Scanner;


public class currencyconvert
{
    double doller,rupees,euro,yen;

   public void con()
   {
     
 
    Scanner sc=new Scanner(System.in);
    System.out.println("1.dollor --rupees \n 2.Euno--Rupees \n 3.Yen--Rupees \n 4.Rupees--doller \n5.Rupees--Euno\n6.Rupees--Yen");
    int op=sc.nextInt();
    switch(op)
    {
        case 1:
        {
            System.out.println("enter doller");
            doller=sc.nextDouble();
            rupees=doller *68.68;
            System.out.println("rupees="+rupees);
    break;
        }
        case 2:
            {
            System.out.println("enter Euro");
            euro=sc.nextDouble();
            rupees=euro * 80.62;
            System.out.println("rupees="+rupees);
    break;
            }
        case 3:
            {
            System.out.println("enter Yen");
            yen=sc.nextDouble();
            rupees=yen* 0.62;
            System.out.println("rupees="+rupees);
break;
            }
       
         case 4:
        {
            System.out.println("enter rupees");
            rupees=sc.nextDouble();
            doller=rupees *0.015;
            System.out.println("doller="+doller);
        break;
        }
         case 5:
        {
            System.out.println("enter rupees");
            rupees=sc.nextDouble();
            euro=rupees *0.012;
            System.out.println("euro="+euro);
        break;
        }
          case 6:
        {
            System.out.println("enter rupees");
            rupees=sc.nextDouble();
            yen=rupees *1.62;
            System.out.println("yen="+yen);
        break;
        }
    }
    }
   
   
}
package distance;

import java.util.Scanner;


public class distance {
     double m,km,mile;

   public void convert()
   {
       
   
    Scanner sc=new Scanner(System.in);
    System.out.println("1.m-km\n2.mile-km\n3.km-m\n4.km-mile");
    int op=sc.nextInt();
    switch(op)
    {
        case 1:
        {
            System.out.println("enter meter");
            m=sc.nextDouble();
            km=m *0.001;
            System.out.println("kilometer="+km);
            break;
        }
   case 2:
        {
            System.out.println("enter miles");
            mile=sc.nextDouble();
            km=mile *1.62;
            System.out.println("kilometer="+km);
            break;
        }
   case 3:
        {
            System.out.println("enter kilometer");
            km=sc.nextDouble();
            m=km *1000;
            System.out.println("meter="+m);
            break;
        }
   case 4:
        {
            System.out.println("enter kilometer");
            km=sc.nextDouble();
            mile=km *0.62;
                    ;
            System.out.println("mile="+mile);
            break;
        }
   
    }}}    


package time;

import java.util.Scanner;
public class time {
      double hr,min,sec;
   public void convert()
   {
       
   
    Scanner sc=new Scanner(System.in);
    System.out.println("1.hr-min\n2.hr-sec\n3.min-hr\n4.sec-hr");
    int op=sc.nextInt();
    switch(op)
    {
        case 1:
        {
            System.out.println("enter hour");
            hr=sc.nextDouble();
            min=hr *60;
            System.out.println("min="+min);
            break;
        }
     case 2:
        {
            System.out.println("enter hour");
            hr=sc.nextDouble();
            sec=hr *3600;
            System.out.println("seconds="+sec);
            break;
        }
     case 3:
        {
            System.out.println("enter min");
            min=sc.nextDouble();
            hr=min *0.016;
            System.out.println("hours="+hr);
            break;
        }
     case 4:
        {
            System.out.println("enter seconds");
            sec=sc.nextDouble();
            min=sec *0.0002;
            System.out.println("min="+min);
            break;
        }
    }}}
    

package convertion;
import currency.* ;
import distance.*;
import time.*;
import java.util.Scanner;
public class Convertion {

    
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("1.currency converter \n 2.distance converter \n3.Time converter");
        System.out.println("enter your chioce:") ;     
        int ch=sc.nextInt();
              
                switch(ch)
                {
                    case 1:
                    {
        currencyconvert cur=new currencyconvert();
        cur.con();
        break;
                    }
                    case 2:
                    {
                        distance dis=new distance();
                    dis.convert();
                    break;
                    }
                    case 3:
                    {
                      time t=new time();
                    t.convert();
                    break;
                    }

                    }
        
        System.out.println("do your want to continue 1.y   or  2.n") ;
         c=sc.nextInt();
        }while(c==1)  ;
    }
}