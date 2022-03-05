/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		  Scanner sc=new Scanner(System.in);
		  int t=sc.nextInt();
		  while(t-->0)
		  {
		      long n=sc.nextLong();
		      long m=sc.nextLong();
		      long cal=m/2+m%2;
		      long tot=n/2+n%2;
		      System.out.println(tot*cal);
		  }
		} catch(Exception e) {
		} finally {
		}
	}
}
