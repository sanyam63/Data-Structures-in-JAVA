import java.util.*;
public class insertionsort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        //sorting(insertion sort is a stable technique)
        for(int i=1;i<n;i++)//i be the point where lis is divided into the sorted and unsorted part, 1 because 1st element is considered sorted
        {
            int d=a[i];
            int j;
            for(j=i;j>0 && a[j-1]>d;j--)//move till you reach end of sorted part of list or you find the correct position of the element
                a[j]=a[j-1];//swap till you find correct position
            a[j]=d;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
