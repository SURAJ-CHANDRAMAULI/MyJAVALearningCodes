package try1;

import java.util.Scanner;

public class MenuDriven {

	public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
	
    public  Node head = null;  
    public  Node tail = null;  
    
    
    
    public void addNodeatLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        tail.next = head;
    }
    
    
    public void addAtStart(int data){  
        
        Node newNode = new Node(data);  
       
        if(head == null) {  
              
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
             
            Node temp = head;  
    
            newNode.next = temp;  
   
            head = newNode;  
         
            tail.next = head;  
        }  
    }  
    
    public void insertNth(int data, int position) {
    
        Node node = new Node(data);
        
        node.next = null;

        if (this.head == null) {
          
          if (position != 0) {
           return;
          } else { 
           this.head = node;
          }
        }

        if (head != null && position == 0) {
          node.next = this.head;
          this.head = node;
          return;
        }

        Node current = this.head;
        Node previous = null;

        int i = 0;

        while (i < position) {
          previous = current;
          current = current.next;

          if (current == null) {
            break;
          }

           i++;
          }

          node.next = current;
          previous.next = node;
    }
    
    
    
    
    public  int sizeof() 
    { 
        Node temp = head; 
        int result = 0; 
        if (head != null)
        { 
            do 
            { 
                temp = temp.next; 
                result++; 
            } while (temp != head); 
        } 
      
        return result; 
    } 
    
    
    
    
    public void deleteEnd() {  
         
        if(head == null) {  
            return;  
        }  
        else {  
            
            if(head != tail ) {  
                Node current = head;  
            
                while(current.next != tail) {  
                    current = current.next;  
                }  
          
                tail = current;  
       
                tail.next = head;  
            }  
   
            else {  
                head = tail = null;  
            }  
        }  
    }  
    
    
    
    
    public boolean containsNode(int searchValue) {
        Node currentNode = head;

        if (head == null) {
            return false;
        } else {
            do {
                if (currentNode.data == searchValue) {
                    return true;
                }
                currentNode = currentNode.next;
            } while (currentNode != head);
            return false;
        }
    }
    
    
    public void deleteNode(int valueToDelete) {
        Node currentNode = head;
        if (head == null) { 
            return;
        }
        do {
            Node nextNode = currentNode.next;
            if (nextNode.data == valueToDelete) {
                if (tail == head) { 
                    head = null;
                    tail = null;
                } else {
                    currentNode.next = nextNode.next;
                    if (head == nextNode) { 
                        head = head.next;
                    }
                    if (tail == nextNode) { 
                        tail = currentNode;
                    }
                }
                break;
            }
            currentNode = nextNode;
        } while (currentNode != head);
    }
    
    
    
    
    public void deleteStart() {  
     
        if(head == null) {  
            return;  
        }  
        else {  
            
            if(head != tail ) {  
                head = head.next;  
                tail.next = head;  
            }  
          
            else {  
                head = tail = null;  
            }  
        }  
    }  
    
    
    
    
    
  
    
    
    
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
    
    
    public static void displayOptions() {
    	System.out.println("Enter 1 to add a node at the end of the circuler linkedlist");
    	System.out.println("Enter 2 to add a node at the begining of the circuler linkedlist");
    	System.out.println("Enter 3 to add a node at any position of the circuler linkedlist");
		System.out.println("Enter 4 to check whether the node is present or not in the linkedlist");
		System.out.println("Enter 5 to delete particuler node from the linkedlist");
		System.out.println("Enter 6 to delete node from the end of the linkedlist");
		System.out.println("Enter 7 to delete node from the begeining  of the linkedlist");
		System.out.println("Enter 8 to get the size of the circular linkedlist");
		System.out.println("Enter 9 to display all the nodes of the linkedlist");
		System.out.println("Enter 0 to exist ");
	
		return;
    }
    
    
    public static void makespace() {
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	
    }
	public static void main(String[] args) {
		
		MenuDriven node = new MenuDriven();
		 
		System.out.println("Congrats! Your node is Created ");
		
		   
		while(true) {
			
		
		Scanner s = new Scanner(System.in);
		
		displayOptions();
		
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Enter the node Value : ");
		         int nodeEvalue = s.nextInt();
		         node.addNodeatLast(nodeEvalue);
		         node.display();
		         break;
		         
		         
		case 2 : System.out.println("Enter the node Value : ");
                  int nodeSvalue = s.nextInt();
                  node.addAtStart(nodeSvalue);
                  node.display();
                  break;
         
                  
		case 3 : System.out.println("Enter the node Value : ");
                int nodedatavalue = s.nextInt();
                System.out.println("Enter the position at which you want to insert : ");
                int pos = s.nextInt();
                node.insertNth(nodedatavalue,pos);
                node.display();
                break;          
        
        
		case 4 : System.out.println("Enter the node Value to check for the node : ");
                  int checkvalue = s.nextInt();
                  boolean ans = node.containsNode(checkvalue);
                  System.out.println("If true is printed then yes node is present else if false is printed then node is not present \n " + ans );
                  makespace();
                  break;
        
        
		case 5 : System.out.println("Enter the value of node to be deleted : ");
                   int deletevalue = s.nextInt();
                   node.deleteNode(deletevalue);
                   node.display();
                   makespace();
                   break;
                   
		case 6 : node.deleteEnd();
		         node.display();
                 makespace();
                 break;
                 
                 
		case 7 : node.deleteStart();
		         node.display();
                 makespace();
                 break;
        
        
		case 8 : System.out.println("The size of your Circular linked list is : "+  node.sizeof());
                 
                 
		case 9 : System.out.println("The values of the node are following : ");
                 
                 node.display();
                 makespace();
                 break;
                 
                 
		
		          
		
		case 0 : System.out.println("Thanks");
		         System.exit(0);
		         makespace();
		         break;
		          
        default :  System.out.println("No such operation exists, try again ! ");
                  makespace();
                   
		}
		
	  }
		
		
	}

}
