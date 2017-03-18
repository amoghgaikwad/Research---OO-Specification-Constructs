import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor
{
	// OVERVIEW: Provides a number of  procedures
    //           useful for implementing PrimeFactor Program
	public static void main (String args[]) 
	{
        try
        {
            Scanner s1=new Scanner(System.in);

    		System.out.println("enter number of elements fo 1st array");

    		int n1=s1.nextInt();

    		List<Integer> arr1 = new ArrayList<Integer>();
    		
    		System.out.println("enter elements for 1st array");

    		for(int i=0;i<n1;i++){//for reading array
        		arr1.set(i, s1.nextInt());
        	}

        	Scanner s2=new Scanner(System.in);

    		System.out.println("enter number of elements fo 2nd array");

    		int n2=s2.nextInt();

    		List<Integer> arr2 = new ArrayList<Integer>();

    		System.out.println("enter elements for 2nd array");

    		for(int i=0;i<n2;i++){//for reading array
        		arr2.set(i, s2.nextInt());
        	}
        	FindPrimeFactor(arr1,arr2);
        	s2.close();
        	s1.close();
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }
        catch(ArithmeticException d)
        {
        	System.out.println("Divide By zero Exception");
        }
        catch(IndexOutOfBoundsException IOOB)
        {
			System.out.println("IndexOutOfBoundsException ");
        }
        
	}
	public static void FindPrimeFactor(List <Integer> a,List <Integer> b)
	{
		// REQUIRES: List a and List b.
	    // EFFECTS: If x in a is a factor of x in b, and x in b is prime then 
		// returns an index where x is stored
		// @param list a and list b -> two list of integer values 
		// given as input
		try
		{
			for(int i=0;i<a.size() && i<b.size();i++)
			{
				if(a.get(i) % b.get(i)==0)
				{
					int t=isPrime(b.get(i));
					if(t==1)
					{
						System.out.println("Output =  " + i);
						break;
					}
				}
			}
		}
		catch(NullPointerException e)
        {
            System.out.println("NullPointerException caught");
        }
		catch(IllegalArgumentException IAE)
		{
			System.out.println("Illegal Argument ");
		}
		catch(IndexOutOfBoundsException IOOB)
		{
			System.out.println("IndexOutOfBoundsException ");
		}
    }
/*
 * To find whether a number is prime or not
 */
	public static int isPrime(int n)
	{
		// REQUIRES: A non-negative number n
	    // EFFECTS: If n is prime then returns 1 else returns 0
		// @param n -> the number to be checked whether prime or not
		
			int temp;
			int P=1;
			if(n<=1) throw new IllegalArgumentException();
			for(int i=2;i<=n/2;i++)
			{
            	temp=n%i;
	   			if(temp==0)
	   			{
	      			P=0;
	      			break;
	   			}
			}
			return P;
	}  
}