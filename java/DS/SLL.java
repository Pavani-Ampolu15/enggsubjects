package DATASTRUCTERS;
import java.util.*;
public class SLL
{
    public static void main(String args[])
    {
        //System.out.println("enter array elements:");
        //Scanner sc=new Scanner(System.in);
        //int size=10;
      /* ArrayList<Integer> arr = new ArrayList<>();
       arr.add(20);
       arr.add(30);
       arr.add(40);
       for(int i=0;i<arr.size();i++)
       System.out.println(arr.get(i));*/
       int arr[]={10,20,30,40,3};
      /* for(int i=0;i<arr.length;i++){
       node n=new node(arr[i]);
       System.out.println(n.data);}*/
       System.out.println("ARRAY TO LL");
       node head=convertARR2LL(arr);
       

      System.out.println("no of elements in ll: "+ LengthofLL(head));
      head=Deletehead(head);
      System.out.println("deleting a node at beginning:"+head);

      head=deletetail(head);
      System.out.println("deleting at last : "+head);

      head=deletepos(head,2);
      System.out.println("delete at certain position:" + head);
      head=deleteval(head,40);
      System.out.println("delete a particular value: "+  head);

      
      //Insertion
      head=insertbeg(head,70);
      System.out.println("insert at beginning: "+head );
      printlist(head);

     //insertion at end
      head=insertend(head,90);
      printlist(head);

      //insert at certain postitions
      head=insertatpos(head,60,3);
      System.out.print("The postion inserted ");
      printlist(head);

      System.out.println("inseert at particualr value");
      head=insertatele(head,200,60);
      printlist(head);
    }

          //linked list traversal
    public static void printlist(node head)
     {
      node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
     }
//converting an array to linked list
       public static node convertARR2LL(int arr[])
       {
          node head=new node(arr[0]);
          node mover=head;
          for(int i=1;i<arr.length;i++)
          {
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
          }
         return head;
        }
//finding the number of elements in linked list
        public static int LengthofLL(node head)
        {
            node temp=head;
            int count=0;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
                count++;
            }
            return count;
        }

        //Deleting a node at beginning
        public static node Deletehead(node head)
        {
            if(head==null) return null;
            node temp=head;
            head=head.next;
            return head;
        }

        //deleting at the end of a linkedlist

        public static node deletetail(node head)
        {
            if(head==null || head.next==null) return null;
            node temp=head;
            while(temp.next.next != null)
            {
                temp=temp.next;
            }
            temp.next=null;
                return head;
        }

        //deleting at a particular position

        public static node deletepos(node head,int pos)
        {
            if(head == null) return null;
            if(pos==1)
            {
                node temp=head;
                head=head.next;
                return head;
            }
            int count=0;
            node temp=head;
            node prev=null;
            while(temp != null)
            {
                count++;
                if(count==pos)
                {
                    prev.next=prev.next.next;
                    break;
                }
                prev=temp;
                temp=temp.next;
            }
            return head;
        }

        //delete a particular value
        public static node deleteval(node head,int val)
        {
            if(head==null)return null;
            if(head.data==val)
            {
                node temp=head;
                head=head.next;
                return head;
            }
            node prev=null;
            node temp=head;
            while(temp!=null)
            {
                if(temp.data == val)
                {
                    prev.next=prev.next.next;
                    break;
                }
                prev=temp;
                temp=temp.next;
            }
            return head;
        }



        //INSERTION AT BEGINNING
        public static node insertbeg(node head,int val)
        {
            node temp =new node(val,head);
            return temp;
        }

        //Insertion at end
        public static node insertend(node head,int val)
        {
            if(head==null) return new node(val);
            node temp=head;
            while(temp.next != null)
            {
                 temp=temp.next;
            }
            node newnode=new node(val);
            temp.next=newnode;
            return head;
        }

        //insert at ceratin position before
        public static node insertatpos(node head,int ele,int pos)
        {
            //if LL is empty and the element to be inserted at 1st position create a node and return
            if(head==null)
              {
                if(pos ==1)
                {
                    return new node(ele);
                }
              }
              //if we want to insert a element at head
              if(pos==1)
              {
                node newnode=new node(ele);
                return newnode;
              }
              int count=0;
              node temp=head;
              while(temp != null)
              {
                count++;
                if(count == pos-1)
                {
                    node newnode=new node(ele);
                    newnode.next=temp.next;
                    temp.next=newnode;
                    break;
                }
                temp=temp.next;
                
              }
              return head;
        }


        //insert at before a particular value
        public static node insertatele(node head,int ele,int val)
        {
            if(head==null)
            return null;
            if(head.data==val)
            {
                node newnode=new node(ele);
                return newnode;
            }
            node temp=head;
            while(temp.next!= null)
            {
               if(temp.next.data==val)
               {
                node newnode=new node(ele,temp.next);
                temp.next=newnode;
                break;
               }
               temp=temp.next;
            }
            return head;
        }
}

//Creating a node
class node{
    int data;
    node next;
    public node(int data1,node next1)
    {
        data=data1;
        next=next1;
    }
    public node(int data2)
    {
        data=data2;
        next=null;
    }
}
