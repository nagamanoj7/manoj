import java.io.*;
import java.util.*;
class Max2
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,max1=0,max2=0,min1,min2;
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      min1=99999;
      min2=99999;
      for(i=0;i<n;i++)
      {
        if(max1<a[i])
          max1=a[i];
        if(min1>a[i])
          min1=a[i];
      }
      for(i=0;i<n;i++)
      {
        if(max2<a[i] && a[i]!=max1)
          max2=a[i];
        if(min2>a[i] && a[i]!=min1)
          min2=a[i];
      }
      System.out.println(max1+" "+max2);
      System.out.println(min1+" "+min2);
      
    }
}