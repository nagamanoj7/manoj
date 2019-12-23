import java.io.*;
import java.util.*;
class Search
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,key,flag=0;
      int pos=-1;
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      key=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(key==a[i])
        {
            flag=1;
            pos=i+1;
            break;
        }
      }
      if(flag==1)
        System.out.println(pos);
      else
        System.out.println("-1");
      
    }
}