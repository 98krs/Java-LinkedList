//Main file that's executed 

public class JavaLinkedListTest {
   public static void main(String[] args) {
   
      //TESTING THINGS 
      Mylist<String> hwlist = new Mylist<>("Homework List"); //Instantiate an instance of Mylist. Mylist = class, list = object aka instance of the class
      System.out.println(hwlist.size()); //Printing out the size of list, and list is an object. Here we are using the size method 

      //NEED TO USE THE METHOD TO ADD A NODE TO THE HEAD - insertAtFront METHOD. Requirements 1 and 2
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      //pretty sure I need to add this to the Homework subclass somehow
      hwlist.insertAtFront("Java Review");
      hwlist.insertAtFront("Writing Classes");
      hwlist.insertAtFront("Selections");
      hwlist.insertAtBack("Overriding Methods");
      hwlist.insertAtBack("Inheritance");
      hwlist.insertAtBack("Polymorphism");

      //CALL THE METHOD TO PRINT THE LIST
      hwlist.print();
      
      //CALL THE METHOD TO REMOVE THE TAIL NODE - Requirement 3
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      hwlist.removeFromTail();
      //PRINT OUT THE LIST
      hwlist.print();
      
      //CALL THE METHOD TO REMOVE THE HEAD NODE - Requirement 4
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      hwlist.removeFromHead();
      //PRINT OUT THE LIST
      hwlist.print();
      
      //Requirement 5 
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      hwlist.searchByIndex(0);
      hwlist.searchByIndex(3);
      hwlist.searchByIndex(10);
      
      Mylist<String> quizlist = new Mylist<>("Quiz List"); //Instantiate an instance of Mylist. Mylist = class, list = object aka instance of the class
      System.out.println(quizlist.size()); //Printing out the size of list, and list is an object. Here we are using the size method 
    
      //NEED TO USE THE METHOD TO ADD A NODE TO THE HEAD - insertAtFront METHOD. Requirements 1 and 2
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      //pretty sure I need to add this to the Homework subclass somehow
      quizlist.insertAtFront("Chapters 1-10 Quiz");
      quizlist.insertAtFront("Chapter 11 Quiz");
      quizlist.insertAtFront("Chapter 12 Quiz");
      quizlist.insertAtBack("Chapter 13 Quiz");
      quizlist.insertAtBack("Chapter 18 Quiz");
      quizlist.insertAtBack("Chapter 19 Quiz");

      //CALL THE METHOD TO PRINT THE LIST
      quizlist.print();
      
      //CALL THE METHOD TO REMOVE THE TAIL NODE - Requirement 3
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      quizlist.removeFromTail();
      //PRINT OUT THE LIST
      quizlist.print();
      
      //CALL THE METHOD TO REMOVE THE HEAD NODE - Requirement 4
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      quizlist.removeFromHead();
      //PRINT OUT THE LIST
      quizlist.print();
      
      //Requirement 5 
      //(remember that you must override the ToString in each subclass in order for this print method to display the contents as a string)
      quizlist.searchByIndex(0);
      quizlist.searchByIndex(3);
      quizlist.searchByIndex(10);

      
      /*Requirement 6 - print all items in the library 
      (you may use the print method provided if you 
      appropriately override the toString to ensure 
      nice formatting and labels) including attribute 
      labels (print out both lists) and the total 
      number of items (either for each list or combined
      is acceptable). Note: you must override the ToString 
      in each subclass in order for this print method to 
      display the contents as a string
      */
      //Work on this 
      quizlist.print();
      
      //-----------------------------------------------------------
      //Starting Kailan's disaster of a program
      //Create 3 items for the Homework subclass and demonstrate all the required program functions
      //Create 3 items for the Quiz subclass and demonstate all the required program functions
      //Note: Homework and Quiz subclass, Coursework superclass 
      
      }
}      
      