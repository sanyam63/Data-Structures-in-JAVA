import java.util.Scanner;

public class BSTuse
{
    public int count=0;
    public static BTNode<Integer>input()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BTNode<Integer> root=new BTNode<>(n);
        String c="yes", l="";
        System.out.println("is it a leaf node");
        l=sc.next();
        if(!l.equals(c))
        {
            System.out.println("enter "+n+ " 's left child");
            root.left = input();
            System.out.println("enter "+n+ " 's right child");
            root.right = input();
        }
        return (root);
    }
    public int countt(BTNode<Integer> s)
    {
        if(s.left==null && s.right==null)
            count++;
        else if(s.left!=null)
                countt(s.left);
        else if(s.right!=null)
            countt(s.right);
        return count;
        }
    public static void print(BTNode<Integer> s)
    {
        if(s.left!=null)
        {print(s.left);}
        System.out.println(s.data);
        if(s.right!=null)
            print(s.right);
    }
    public static void main(String args[])
    {
        System.out.println("Enter root node");
        BTNode<Integer> root=input();
        print(root);
        BSTuse aa=new BSTuse();
        int c=aa.countt(root);
        System.out.println(c);
    }
}
