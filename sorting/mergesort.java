//not an inplace algo,stable algo, O(nlogn)
import java.util.*;
public class mergesort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        merge(a,0,a.length);
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
    public static void merge(int a[],int start,int end)
    {
        if(end-start<2)
            return;
        else
        {
            int mid=(end+start)/2;
            merge(a,start,mid);
            merge(a,mid,end);
            mergear(a,start,mid,end);
        }
    }
    public static void mergear(int a[],int start,int mid,int end)
    {
        if(a[mid-1]<=a[mid])
            return;
        else
        {
            int i=start;
            int j=mid;
            int k=0;
            int temp[]=new int[end-start];
            while(i<mid && j<end)
                temp[k++]=a[i]<=a[j] ? a[i++] : a[j++];
            while(i<mid)
                temp[k++]=a[i++];
            k=0;
            for(i=start;i<j;i++)
                a[i]=temp[k++];
        }

    }
}
