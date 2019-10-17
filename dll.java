public class dll //dll stands for doubly linked list
{
	node head;
	node tail;
	public static class node
	{
		int data;
		node next;
		node prev;
		node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	public static dll insertAtFront(dll list,int data)
	{
		node new_node=new node(data);
		if(list.head==null)
		{
			list.head=new_node;
			list.tail=new_node;
			return list;
		}
		node temp=list.head;
		new_node.next=temp;
		temp.prev=new_node;
		list.head=new_node;
		return list;
	}
	public static dll insertAtPost(dll list,int data,int pos)
	{
		if(pos==1)
			return(insertAtFront(list,data));
		node temp=list.head;pos--;
		node new_node=new node(data);
		int count=0;
		while(pos!=count)
		{
			count++;
			if(temp.next==null)
				break;
			temp=temp.next;
		}
		if(temp.next==null)
			return(insert(list,data));
		else if(pos>count)
		{
			System.out.println("position too big bruh");
			return list;
		}
		new_node.next=temp.next;
		temp.next.prev=new_node;
		temp.next=new_node;
		new_node.prev=temp;
		return list;
		
	}
	public static dll insert(dll list,int data)
	{
		node temp=list.head;
		node new_node=new node(data);
		if(temp==null)
		{
			list.head=new_node;
			list.tail=new_node;
			return list;
		}
		else
		{
			list.tail.next=new_node;
			new_node.prev=list.tail;
			list.tail=new_node;
			return(list);
		}
	}
	public static void display(dll list)
	{
		node temp=list.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
		}
		node temp1=list.tail;System.out.println();
		while(temp1!=null)
		{
			System.out.print(temp1.data+"\t");
			temp1=temp1.prev;
			
		}
	}
	public static dll removeAtFirst(dll list)
	{
		list.head.next.prev=null;
		list.head=list.head.next;
		return list;
	}
	public static dll removeAtLast(dll list)
	{
		node temp=list.head;
		while(temp.next.next!=null)
			temp=temp.next;
		list.tail=list.tail.prev;
		temp.next=null;
		return list;
	}
	public static dll removeAtPost(dll list,int pos)
	{
		node temp=list.head;pos--;
		int count=1;
		if(pos==0)
			return(removeAtFirst(list));
		 while(temp.next!=null)
		 {
			 if(count==pos)
				 break;
			 count++;
			 temp=temp.next;
			 
		 }
		 if(count<pos)
			 {
			 System.out.println("Position greater than no. of elelemts");
			 return(list);
			 }
		 else if(temp.next.next==null)
			 return(removeAtLast(list));
		 else 
		{
			 node cpy=temp.next;
			 temp.next.next.prev=temp;
			 temp.next=temp.next.next;
			 cpy=null;
			 return list;
		}
	}
	public static void main(String args[])
	{
		dll list=new dll();
		list=insertAtFront(list,0);
		list=insert(list,1);
		list=insert(list,2);
		//list=removeAtFirst(list);
		list=insert(list,3);
		list=insert(list,4);
		list=removeAtLast(list);
		list=insert(list,5);
		list=insert(list,6);
		list=insertAtPost(list,7,2);
		//list=removeAtLast(list);
	//	list=removeAtPost(list,1);
		display(list);
		
	}

}
