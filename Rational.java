/*10.Develop   Rational   number   class   in   Java.   Use   JavaDoc   comments   for
documentation.  Your  implementation  should  use  efficient  representation  for  a rational number,
i.e. (500 / 1000) should be represented as (½).
*/
import java.io.*;
import java.util.*;
class Rational
{
    int numerator;
    int denominator;
    void readInput()
    {
           Scanner in=new Scanner(System.in);
           System.out.println("Enter the numerator");
           numerator=in.nextInt();
           System.out.println("Enter the denominator");
           denominator=in.nextInt();
    }
    int calculate()
   {
          int i;
          int k=(numerator<denominator)?numerator:denominator;
          for(i=k;i>1;i--)
         {
                  if((numerator%i==0)&&(denominator%i==0))
                  break;
         }
         return i;
   }
   void displayResult(int gcd)
   {
         if(numerator==0)
        {
               System.out.println("Numerator can't be zero it is invalid");
        }
        else if(denominator==0)
       {
               System.out.println("Denominator can't be zero it is invalid");
      }
     else
     {
             
             numerator=numerator/gcd;
             denominator=denominator/gcd;
             System.out.println("The resultant value is:"+numerator+"/"+denominator);
     }
   }
}
class Main
{
    public static void main(String args[])
    {
            Rational ra=new Rational();
            ra.readInput();
            int gcd=ra.calculate();
            ra.displayResult(gcd);
    }
}

/*output:
Enter the numerator
500
Enter the denominator
1000
The resultant value is:1/2
*/