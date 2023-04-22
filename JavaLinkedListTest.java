//Main file that's executed 

public class JavaLinkedListTest {
   public static void main(String[] args) {
   
      //TESTING THINGS OUT HERE
      Mylist<String> list = new Mylist<>("List"); //Instantiate an instance of Mylist. Mylist = class, list = object aka instance of the class
      System.out.println(list.size()); //Printing out the size of list, and list is an object. Here we are using the size method 
    
      //NEED TO USE THE METHOD TO ADD A NODE TO THE HEAD - insertAtFront METHOD. Requirements 1 and 2
      list.insertAtFront("Test");
      list.insertAtFront("Potato");
      list.insertAtFront("Duke");
      list.insertAtBack("Scout");
      list.insertAtBack("Pickle");
      list.insertAtBack("Worm");

      //CALL THE METHOD TO PRINT THE LIST
      list.print();
      
      //CALL THE METHOD TO REMOVE THE TAIL NODE - Requirement 3
      list.removeFromTail();
      //PRINT OUT THE LIST
      list.print();
      
      //CALL THE METHOD TO REMOVE THE HEAD NODE - Requirement 4
      list.removeFromHead();
      //PRINT OUT THE LIST
      list.print();
      
   }
}