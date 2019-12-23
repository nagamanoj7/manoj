import java.io.*;
import java.util.*;
class Maxmin 
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,max=0,min;
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      min=a[0];
      for(i=0;i<n;i++)
      {
        if(max<a[i])
          max=a[i];
        if(min>a[i])
          min=a[i];
      }
      System.out.println("maximum= " +max);
      System.out.println("minimum= "+min);
    }
}