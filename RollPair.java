/*7.Write  a  java  program  to  make  rolling  a  pair  of  dice  10,000  times  and  counts  the number
  of  times  doubles  of  are  rolled  for  each  different  pair  of  doubles.  Hint: Math.random()
*/
import java.util.Random;
public class RollPair{
	public static void main( String[] args){
		Random randomNumbers = new Random();
		int[][] count=new int[6][6];
		int dice1,dice2; 
		for ( int roll = 1; roll <= 10000; roll++ )
		{ 
			dice1 = 1 + randomNumbers.nextInt( 6 ); 
			dice2 = 1 + randomNumbers.nextInt( 6 );
			count[dice1-1][dice2-1]++;
		} 
		System.out.println("Each pair has rolled the following number of times");				
                for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
				System.out.print("pair "+(i+1)+","+(j+1)+"="+count[i][j]+"  ");
			System.out.println( );
		}

	} 
}


/*output:
Each pair has rolled the following number of times
pair 1,1=269  pair 1,2=298  pair 1,3=274  pair 1,4=262  pair 1,5=284  pair 1,6=282
pair 2,1=291  pair 2,2=290  pair 2,3=291  pair 2,4=280  pair 2,5=273  pair 2,6=271
pair 3,1=285  pair 3,2=272  pair 3,3=303  pair 3,4=267  pair 3,5=286  pair 3,6=281
pair 4,1=264  pair 4,2=277  pair 4,3=264  pair 4,4=309  pair 4,5=256  pair 4,6=276
pair 5,1=251  pair 5,2=276  pair 5,3=276  pair 5,4=254  pair 5,5=274  pair 5,6=274
pair 6,1=279  pair 6,2=272  pair 6,3=279  pair 6,4=299  pair 6,5=278  pair 6,6=283
*/