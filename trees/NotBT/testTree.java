import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.Scanner;

public class testTree
{
    public static TreeNode<Integer> input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter data") ;
        int n=sc.nextInt();
        System.out.println("enter number of nodes");
        TreeNode<Integer> root=new TreeNode<Integer>(n);
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            TreeNode<Integer> children= input();
            root.children.add(children);
        }
        return root;
    }
    public static void print(TreeNode<Integer> root)
    {
        String s= root.data+" : ";
        for(int i=0;i<root.children.size();i++)
        {
            s=s+root.children.get(i).data+ ",";

        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++)
            print(root.children.get(i));
    }
    public static void main(String args[])
    {
//        TreeNode<Integer> root=new TreeNode<Integer>(5);
//        TreeNode<Integer> node1=new TreeNode<Integer>(1);
//        TreeNode<Integer> node2=new TreeNode<Integer>(2);
//        TreeNode<Integer> node3=new TreeNode<Integer>(3);
//        TreeNode<Integer> node4=new TreeNode<Integer>(4);
//        TreeNode<Integer> node5=new TreeNode<Integer>(6);
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        root.children.add(node5);
//        node2.children.add(node4);
        TreeNode<Integer> root=input();
        print(root);
    }
}
