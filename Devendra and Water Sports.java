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
		       long a=sc.nextLong();
		       long b=sc.nextLong();
		       long c=sc.nextLong();
		       long d=sc.nextLong();
		       long e=sc.nextLong();
		       long tot=c+d+e;
		       if(a-b>=tot)
		         System.out.println("YES");
		       else
		          System.out.println("NO");
		   }
		} catch(Exception e) {
		} finally {
		}
	}
}
