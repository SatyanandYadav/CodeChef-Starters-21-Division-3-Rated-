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
		      int n=sc.nextInt();
		      int arr[]=new int[n];
		      for(int i=0;i<n;i++) {
		          arr[i]=sc.nextInt();
		      }
		      //int brr[]=new int[32];
		      int res=0;
		      for(int i=0;i<32;i++)
		      {
		          int k=0;
		          for(int j=0;j<n;j++)
		          {
		              if((arr[j]&(1<<i))!=0)
		               k++;
		          }
		          //System.out.println(k);
		          if(k>1)
		            res+=(1<<i); 
		      }
		      System.out.println(res);
		      //for(int i=0;i<10;i++)
		      //{
		      //    for(int j=0;j<10;j++)
		      //    {
		      //        System.out.println(i+"|"+j+"="+(i|j));
		      //    }
		      //}
		  }
		} catch(Exception e) {
		} finally {
		}
	}
}
