import java.io.*;
import java.util.*;
class Duplicate
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j,temp,flag=0;
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
          flag=0;
          for(j=0;j<i;j++)
          {
              if(a[i]==a[j])
              {
                  flag=1;
                  break;
              }
          }
          if(flag==0)
            System.out.print(a[i]+" ");
      }
    }
}