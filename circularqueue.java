public class circularqueue
{
    node head;
    static class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public static circularqueue insert(circularqueue cq,int data)
    {
        node nw=new node(data);
        if(cq.head==null)
        {
            cq.head=nw;
            cq.head.next=cq.head;
        }
        else
        {
            node ns=cq.head;
            while(ns.next!=cq.head)
                ns=ns.next;
            ns.next=nw;
            nw.next=cq.head;
        }
        return cq;
    }
    public static void display(circularqueue cq)
    {
        node ns=cq.head;int flag=0;
        while(true)
        {
            if(ns==cq.head && flag>0)
                break;
            System.out.println(ns.data);flag++;
            ns=ns.next;
        }
    }
    public static circularqueue delete(circularqueue cq)
    {
        node nw=cq.head;
        while(nw.next.next!=cq.head)
            nw=nw.next;
        nw.next=cq.head;
        return cq;
    }
    public static void main(String args[])
    {
        circularqueue cqq=new circularqueue();
        cqq=cqq.insert(cqq,1);
        cqq=cqq.insert(cqq,2);
        cqq=cqq.insert(cqq,3);
        cqq=cqq.insert(cqq,4);
        cqq.display(cqq);
        cqq=cqq.delete(cqq);
        cqq=cqq.delete(cqq);
        cqq=cqq.insert(cqq,5);
        cqq=cqq.delete(cqq);
        display(cqq);
    }
}
