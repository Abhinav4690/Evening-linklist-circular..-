//  1)Creating linked list

import java.*;  
public class link 
{ 

  Node head;
  static class Node
   { 
        int data; 
        Node next; 

        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    public static List insert(List list, int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = null;  
        if (list.head == null) 
        { 
            list.head = new_node; 
        } 
        else 
        { 
            
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            last.next = new_node; 
        } 
        return list; 
    } 

    public static void display(List list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
        while (currNode != null) { 
           
            System.out.print(currNode.data + " "); 

            currNode = currNode.next; 
        } 
    } 
   
    public static void main(String[] args) 
    { 
        
        List list = new List(); 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
        display(list); 
    } 
} 

***********************************************************************

//2)

  
class Node 
{ 
    int data; 
    Node next; 
  
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 
  
class LinkedList 
{ 
    Node head; 
   
    LinkedList()   
    { 
        head = null; 
    } 
  
 
    void sortedInsert(Node new_node) 
    { 
        Node current = head; 
  
        // Case 1 of the above algo 
        if (current == null) 
        { 
            new_node.next = new_node; 
            head = new_node; 
  
        } 
  
        // Case 2 of the above algo 
        else if (current.data >= new_node.data) 
        { 
            while (current.next != head) 
                current = current.next; 
  
            current.next = new_node; 
            new_node.next = head; 
            head = new_node; 
        } 
  
        
        else
        { 

            while (current.next != head && 
                current.next.data < new_node.data) 
                current = current.next; 
  
            new_node.next = current.next; 
            current.next = new_node; 
        } 
    } 
  
  
    void printList() 
    { 
        if (head != null) 
        { 
            Node temp = head; 
            do
            { 
                System.out.print(temp.data + " "); 
                temp = temp.next; 
            }  while (temp != head); 
        } 
    } 
  
   
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
  
    
        int arr[] = new int[] {12, 56, 2, 11, 1, 90}; 
  
        Node temp = null; 
  
        for (int i = 0; i < 6; i++) 
        { 
            temp = new Node(arr[i]); 
            list.sortedInsert(temp); 
        } 
  
        list.printList(); 
    } 
} 
*************************************************************
