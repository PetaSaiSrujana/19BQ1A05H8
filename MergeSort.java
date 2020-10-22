/*6.Suppose  you  have  a  big  problem.  To  solve  this,  you  recursively  breaking  down  a problem 
into  two  or  more  sub-problems  of  the  same  or  related  type,  until  these become simple enough 
to be solved directly. The solutions to the sub-problems are then combined to give a solution to the original
problem. Implement java code this with the help of a set of numbers. (Merge sort).*/ 




public class MergeSort
{
	public static void main(String args[])
	{
		//int a[]; // array reference
                int a[]={67,56,78,92,34};
		int n=a.length;

		System.out.println("\n Before sorting...");
		display(a,n);
		
		mergepass(a,0,n-1); // calling sorting function

		System.out.println("\n After sorting...");
		display(a,n);
	}

	public static void mergepass(int a[], int lb,int ub)// divide the list into 2 sublists
	{
		int mid;
		if(lb!=ub)// if(a.length!=1)
		{
			mid = (lb+ub)/2;
			mergepass(a,lb,mid); // divide further left sublist
			mergepass(a,mid+1,ub); // divide further right sublist
			mergeSort(a,lb,mid,ub);
		}
	}

	public static void mergeSort(int a[], int lb,int mid,int ub)
	{
		int i; // indicates the starting position of left sublist
		int j; // indicates the starting position of right sublist
		int k; // index of temp array (third list)
		int temp[];
		temp = new int[20];
	
		i = lb;
		j = mid+1;
		k = lb;
		while((i<=mid) && (j<=ub))// as long as there are elements in both sublists, we do merge -->repeat the loop
		{
			if(a[i] <= a[j])
			{
				temp[k] = a[i];
				k++; i++;
			}
			else
			{
				temp[k] = a[j];
				k++; j++;
			}		
		} // MERGE
		
		while(i<=mid) // case 2, dumping remaining elements in the sublist1
		{
			temp[k] = a[i];
			k++; i++;
		}	
		while(j<=ub)// case 3, dumping remaining elements in the sublist 2
		{
			temp[k] = a[j];
			k++; j++;		
		}
		for(i=lb;i<=ub;i++) 	// post all the elements from temp to back orginial array 'a'
			a[i] = temp[i];
	}

	public static void display(int a[],int n)
	{
		for(int i=0;i<n;i++)
		 System.out.print(a[i]+"   ");
	}
}



/*output:
 Before sorting...
67   56   78   92   34
 After sorting...
34   56   67   78   92
*/