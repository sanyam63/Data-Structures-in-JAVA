public class queue
{
	node head;
	static class node
	{
		int data; node next;
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static queue insert(queue q,int data)
	{
		node new_node=new node(data);
		node tmp=q.head;
		if(q.head==null)
		{
			q.head=new_node;
			return q;
		}
		else
		{
			while(tmp.next!=null)
				tmp=tmp.next;
			tmp.next=new_node;
			return q;
		}
	}
	public static queue remove(queue q)
	{
		q.head=q.head.next;
		return q;
	}
	public static void display(queue q)
	{
		node tmp=q.head;
		while(tmp!=null)
		{
			System.out.print(tmp.data+"\t");
			tmp=tmp.next;
		}
	}
	public static void main(String args[])
	{
		queue q=new queue();
		q=insert(q,1);
		q=insert(q,2);
		q=insert(q,3);
		q=insert(q,4);
		q=insert(q,5);
		q=remove(q);
		q=remove(q);
		q=insert(q,6);
		display(q);
	}

}
