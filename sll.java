//S.L.L stands for singly linked list and this code works even when position entered> size,it removes last element
public class sll 
{
	node head;
	static class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static sll insert(sll list,int data,int pos) //inserting at a position pos
	{
		node new_node=new node(data);
		if(list.head==null)
		{
			list.head=new_node;
			return list;
		}
		
		
			node temp=list.head;int count=1;
			while(temp.next!=null && count!=pos)
			{
				count++;
				temp=temp.next;
			}
			if(temp.next==null)
				temp.next=new_node;
			else
			{
				new_node.next=temp.next;
				temp.next=new_node;
			}
			return list;
		
	}
	public static void display(sll list)
	{
		node temp=list.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
		}
	}
	public static sll remove(sll list,int pos)  
	{
		int count=0;node temp=list.head;
		while(count!=pos-1)
		{
			if(temp.next.next==null)
				break;
			else
			temp=temp.next;
		}
		if(temp.next.next!=null)
		temp.next=temp.next.next;
		else
			temp.next=null;
		return list;
	}
	public static void main(String args[])
	{
		sll list=new sll();
		list=insert(list,1,1);
		list=insert(list,2,1);
		list=insert(list,3,10);
		list=insert(list,4,1);
		list=remove(list,1);
		display(list);
	}
}
