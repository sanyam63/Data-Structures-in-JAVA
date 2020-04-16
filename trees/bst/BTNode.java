public class BTNode<T>
{
    T data;
    BTNode<T> left;
    BTNode<T> right;
    BTNode(T data)
    {
        this.data=data;
        left=right=null;
    }


}
