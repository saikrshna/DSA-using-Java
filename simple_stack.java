import java.util.*;
class Stack{
    private int[] arr;
    private int max;
    private int top=-1;

    public Stack(int max){
        this.max=max;
        arr=new int[max];
    }

    public void push(int a){
        top++;
        arr[top]=a;
    }

    public void pop(){
        arr[top]=0;
        top--;
    }

    public boolean isempty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isfull(){
        if(top==max-1){
            return true;
        }else{
            return false;
        }
    }

    public int peek(){
        return arr[top];
    }
}

public class Heystack {
    public static void main(String args[]){
       int max;
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter the maximum size: ");
       max=sc.nextInt();
       Stack ob=new Stack(max);

       int choice=0;
       do {
       System.out.print("\nEnter 1 for push\nEnter 2 for pop\nEnter 3 for peek\nEnter 4 for exit: ");
       choice = sc.nextInt();
       switch(choice){
           case 1:

           if(ob.isfull()==false){
           int a;
           System.out.print("\nEnter the number to push: ");
           a=sc.nextInt();
           ob.push(a);
           }else{
               System.out.print("Array us full");
           }
           break;

           case 2:
           if(ob.isempty()==false){
           ob.pop();
           }else{
               System.out.print("Array us Empty");
           }
           break;

           case 3:
           System.out.print("The peek element is:"+ob.peek());
           ob.peek();
       }
       
    }while(choice!=4);
    sc.close();
    }
}
