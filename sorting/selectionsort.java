import java.util.*;
public class selectionsort
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        //sorting
        for(int i=0;i<n;i++)
        {
            int k=a[i];
            for(int j=i+1;j<n;j++)
            {
                if(k>a[j])
                {
                    int t=k;
                    k=a[j];
                    a[j]=t;
                }
            }
            a[i]=k;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
