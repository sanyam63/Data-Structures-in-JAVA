//inplace algo, O(nlogn), unstable algo(swapping position all overthe place, so duplicate items are swapped ahead of each other sometimes)
import java.util.*;
public class quicksort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int  a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        quick(a,0,n);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"  ");
    }
    public static void quick(int a[],int start,int end)
    {
        if(end-start<2)
            return;
        else
        {
            int pvt=partition(a,start,end);
            quick(a,start,pvt);
            quick(a,pvt+1,end);
        }
    }
    public static int partition(int a[],int start,int end)
    {
        int pvt=a[start];
        int i=start;
        int j=end;
        while(i<j)
        {
            while(i<j && a[--j]>=pvt);
            if(i<j)
                a[i]=a[j];
            while(i<j && a[++i]<=pvt);
            if(i<j)
                a[j]=a[i];
        }
        a[j]=pvt;
        return(j);
    }
}
