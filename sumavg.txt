import java.io.*;
import java.util.*;
class Sum 
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,sum=0;
      float avg;
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        sum=sum+a[i]; 
      }
      avg=sum/n;
      System.out.println("sum=" +sum);
      System.out.println("Average="+avg);
    }
}