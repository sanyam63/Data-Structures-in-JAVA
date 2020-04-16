//import java.util.*;
public class BstFULL
{
    static int i=0,j=0;
    public static BTNode<Integer> insert(int n,BTNode<Integer> root)
    {
        BTNode<Integer> nw=new BTNode<>(n);
        if(root.data>n)
        {
            if(root.left==null)
                root .left=nw;
            else
            insert(n, root.left);
        }
        else if(root.data<n)
        {
            if(root.right==null)
                root.right=nw;
            else
            insert(n, root.right);
        }
        return  root;
    }
    public static void print(BTNode<Integer> root)
    {
      //        System.out.println(root. data); //prefix(+AB)
        if(root.left!=null)
        {i++;print(root.left);}
        System.out.println(root. data);//infix(A+B)
        if(root.right!=null)
        {j++;print(root.right);}
//        System.out.println(root. data); postfix(AB+)
    }
    public static void main(String args[])
    {
        BTNode<Integer> root=new BTNode<>(6);
        root=insert(4,root);
        root=insert(9,root);
        root=insert(2,root);
        root=insert(7,root);
        root=insert(3,root);
        root=insert(111,root);
        root=insert(0,root);
        print(root);
        System.out.println(i+"       "+j);
    }
}
