import java.util.*;
class Node{
    public Node next;
    public int data;
    public Node(int data){
        this.data=data;
    }
}

public class deletek{
    public Node head;
    public Node tail;

    public void addNode(int d){
       Node newNode=new Node(d);
       if(head==null){
           head=newNode;
       }else{
           tail.next=newNode;
       }
       tail=newNode;
    }

    public void display(){
        Node temp=head;
        System.out.print("The current elemets are: ");
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
    }

    public void delete(int k){
        int count=0,num=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int key=count-k;
        while(temp!=null){
           if(key==num){
               if(temp==tail){
                   temp=tail;
                   tail.next=null;
               }else{
              temp.next=temp.next.next;
               }
           }else{
           num++;
           temp=temp.next;
           }
        }
    }

    public static void main(String args[]){
        deletek obj=new deletek();
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=4){
            System.out.print("\nEnter 1 for adding node\nEnter 2 for displaying node\nEnter 3 for deleting from kth position\nEnter 4 for EXIT:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the data to be added: ");
                    int a=sc.nextInt();
                    obj.addNode(a);
                    break;
                case 2:
                    obj.display();
                    break;
               case 3:
                    System.out.print("Enter the data to be deleted: ");
                    int b=sc.nextInt();
                    obj.delete(b);
                    break;
               
        }
    } sc.close();
  }
}
