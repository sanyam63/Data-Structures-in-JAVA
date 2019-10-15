public class stack 
{
	node head;
	public static class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static stack push(stack st,int data)
	{
		node new_node=new node(data);
		if(st.head==null)
		{
			st.head=new_node;
			return st;
		}
		else
		{
			node temp=st.head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
			return st;
		}
	}
	public static stack pop(stack st)
	{
		stack str= new stack();
		node temp=st.head;
		while(temp.next!=null)
		{
			if(temp.next!=null)
			str=push(str,temp.data);
			temp=temp.next;
		}
		return str;
	}
	public static void display(stack st)
	{
		node temp=st.head;
		while(temp!=null)
		{
			
			System.out.print(temp.data+"\t");
			temp=temp.next;
		}
	}
	public static void main(String args[])
	{
		stack st=new stack();
		st=push(st,1);
		st=push(st,2);
		st=push(st,3);
		st=push(st,4);
		st=pop(st);
		st=pop(st);
		st=pop(st);
		st=push(st,5);
		display(st);
	}
}
	

