//Original code for Linked List Structure Assignment - provided by professor

import java.util.NoSuchElementException;

public class Mylist < T > {

   public ListNode < T > firstNode;
   public ListNode < T > lastNode;

   public String name;		// string used in printing

   //constructor creates empty List with "my list" as the name
   public Mylist () {
      System.out.println ("list default constructor");
   }

   //constructor creates an empty List with a name
   public Mylist (String listName) {
      System.out.println ("list 2nd constructor");
      name = listName;
      firstNode = lastNode = null;
   }

   //insert item in front
   public void insertAtFront (T insertItem) {
      if (isEmpty ()) {
	   firstNode = lastNode = new ListNode < T > (insertItem);
      }
      else {
	   firstNode = new ListNode < T > (insertItem, firstNode);
      }
   }

   //insert item at the back
   public void insertAtBack (T insertItem) {
      if (isEmpty ()) {
	   firstNode = lastNode = new ListNode < T > (insertItem);
      }
      else {
	   ListNode < T > current = firstNode;
	   while (current.nextNode != null) {
	      current = current.nextNode;
	   }
	   current.nextNode = lastNode = new ListNode < T > (insertItem);
      }
   }
   
   //remove node from head - we want to change the pointer from the head to the 2nd node
   public void removeFromHead() {
      ListNode < T > current = firstNode;
      firstNode = current.nextNode;
   }
   
   //remove node from tail - tail is called lastNode
   public void removeFromTail() {
      //change pointer to point at 2nd to last node
      ListNode <T> current = firstNode;
      while (current.nextNode.nextNode != null) {
         current = current.nextNode;
      }
      lastNode = current; //change pointer to 2nd to last
      current.nextNode = null; //remove last value (done by orphaning the node) 
   }
   
   // 5) search for an item by index number (the number of its position in the list) and display the information for that library item.  
   //The code must validate that the index number is within bounds and throw an appropriate exception if not. 
   public void searchByIndex(int index) {
   /*
      ListNode <T> current = firstNode;
      try {
         for (int i = 1; i <= index; i += 1) {
            current = current.nextNode;
         }
         System.out.println("Index: " + index + " = " + current.data);
      }
      catch (NoSuchMethodError ex) {
         System.out.println("The index number is not within bounds.");
      }
   */
   }

   //determine whether list is empty
   public boolean isEmpty () {
      return firstNode == null;	// return true if list is empty
   }

   //output list contents
   public void print () {
      if (isEmpty ()) {
	   System.out.printf ("Empty %s\n", name);
	   return;
      }
      System.out.printf ("%s is: ", name);
      ListNode < T > current = firstNode;

      //while not at end of list, output current node's data
      while (current != null) {
	   System.out.printf ("%s ", current.data);
	   current = current.nextNode;
      }
      System.out.println ();
   }

   public int size () {		// returns the number of items in the list
      int count = 0;
      ListNode < T > current = firstNode;
      while (current != null) {
      count++;
      current = current.nextNode;
      }
      return count;
   }
}

class ListNode<T> {
	   T data;// data for this node
	   ListNode<T> nextNode;// reference to the next node in the list

	   //constructor creates a ListNode that refers to object
	   ListNode(T object) {
	      this(object, null);
	   }

	   //constructor creates ListNode that refers to the specified
	   //object and to the next ListNode
	   ListNode(T object, ListNode<T> node) {
	      data = object;
	      nextNode = node;
	   }

	   //return reference to data in node
	   T getData() {
	      return data;// return item in this node
	   }

	   //return reference to next node in list
	   ListNode<T> getNext() {
	      return nextNode;// get next node
	   }
   }
