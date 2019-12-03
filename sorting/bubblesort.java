//bubble sort, o(n) is n*n
import java.util.*;
public class bubblesort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        //sorting
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"  ");
    }
}
