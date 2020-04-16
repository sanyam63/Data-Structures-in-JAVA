import com.sun.source.tree.Tree;
import java.util.ArrayList;
import java.util.Scanner;
public class testTreeBFS
{
    public static TreeNode<Integer> input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter root      data");
        int n=sc.nextInt();
        TreeNode<Integer> root=new TreeNode<Integer>(n);
        QueueLL<TreeNode<Integer>> q=new QueueLL<>();
        q.enqueue(root);
        while (!q.isEmpty())
        {
            TreeNode<Integer> nw=q.dequeue();
           System.out.println("Enter no. of children for "+nw.data);
            int m=sc.nextInt();
            System.out.println("Size "+q.size);
            for(int j=0;j<m;j++)
            {
               System.out.println("enter for node "+nw.data+" data number "+j+" : ");
                int k=sc.nextInt();
                TreeNode<Integer> np=new TreeNode<Integer>(k);
                nw.children.add(np);
                q.enqueue(np);
               System.out.println("Size "+q.size);
            }
        }
        return root;
    }
    public static void print(TreeNode<Integer> root)
    {
        QueueLL<TreeNode<Integer>> q=new QueueLL<>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            int x=q.size;
            while (x-->0) {
                TreeNode<Integer> top=q.dequeue();
                System.out.print(top.data);
                ArrayList<TreeNode<Integer>> list=top.children;
                for(TreeNode<Integer> node:list)
                {
                    q.enqueue(node);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        TreeNode<Integer> root=input();
        print(root);

    }
}
