package practice2;


import java.util.Scanner;

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class LL {
    Node head;

    public Node insertFront(int key){
            Node  newNode=new Node(key);
            newNode.next=head;
            head=newNode;   
            return head;
    }
    public Node insertEnd(int key){
        Node newNode= new Node(key);
        Node temp=head;
        if(head==null){
            head=newNode;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;
        }
        return temp;
    }

    public Node deleteFront(){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;

    }

    public Node deleteEnd(){
        Node temp=head;
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head=null;
        }
        else{
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp=temp.next;
        }
        return temp;
    }

    public Node insertAtPosition(int data,int pos){
        Node newNode=new Node(data);
        Node temp=head;
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        for(int i=0;i<pos-1;i++){
            if(temp.next!=null){
                temp=temp.next;
            }
            else{
                return head;
            }
           
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return temp;

    }

    public Node deleteFromPosition(int pos){
        Node temp=head;
        if(pos==0){
            head=temp.next;
            return head;
        }
        else{
            
            for(int i=0;i<pos-1;i++){
                if(temp.next==null || temp==null){
                    return head;
                }
                temp=temp.next;
            }
            if(temp.next!=null){
                temp.next=temp.next.next;
            }
            else{
                return head;
            }
            return temp;
            
        }
    }

    public Node deleteElement(int x){
        Node temp=head;
        if(x==head.val){
            head=head.next;
            return head;
        }
        while(temp.next!=null){
            Node y=temp.next;
            if(x==y.val){
                temp.next=temp.next.next;
                break;//exit after deletion
            }
            temp=temp.next;
        }
        return head;
    }

    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

    public void displayReverse(Node node){
        if(node ==null){
            return;
        }
        displayReverse(node.next);
        System.out.print(node.val+" ");
    }

    public void peek(){
       if(head==null){
        System.out.println("Empty list");
       }
       else{
        Node temp=head;
        System.out.print(temp.val);
       }
    }

    public void peekReverse(){
        Node temp=head;
        if(temp==null){
            System.out.println("Empty list");
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.val+" ");
    }

    

    public static void main(String args[]) {
        LL list=new LL();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert front");
            System.out.println("2. Insert end");
            System.out.println("3. Delete front");
            System.out.println("4. Delete end");
            System.out.println("5. Insert at position");
            System.out.println("6. Delete from position");
            System.out.println("7. Delete element");
            System.out.println("8. Display");
            System.out.println("9. Display reverse");
            System.out.println("10. Peek");
            System.out.println("11. Peek reverse");
            System.out.println("12. Exit");
            int choice = scanner.nextInt();
            int data, position;
            switch (choice) {
                case 1:
                    System.out.println("Enter data:");
                    data = scanner.nextInt();
                    list.insertFront(data);
                    break;
                case 2:
                    System.out.println("Enter data:");
                    data = scanner.nextInt();
                    list.insertEnd(data);
                    break;
                case 3:
                    list.deleteFront();
                    break;
                case 4:
                    list.deleteEnd();
                    break;
                case 5:
                    System.out.println("Enter data and position:");
                    data = scanner.nextInt();
                    position = scanner.nextInt();
                    list.insertAtPosition(data, position);
                    break;
                case 6:
                    System.out.println("Enter position:");
                    position = scanner.nextInt();
                    list.deleteFromPosition(position);
                    break;
                case 7:
                    System.out.println("Enter data:");
                    data = scanner.nextInt();
                    list.deleteElement(data);
                    break;
                case 8:
                    list.display();
                    break;
                case 9:
                    list.displayReverse(list.head);
                    System.out.println();
                    break;
                case 10:
                    list.peek();
                    break;
                case 11:
                    list.peekReverse();
                    break;
                case 12:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

