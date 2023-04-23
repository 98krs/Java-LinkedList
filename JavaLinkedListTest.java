//Main file that's executed 

public class JavaLinkedListTest {
   public static void main(String[] args) {
   
      Mylist<Object> hwlist = new Mylist<>("Homework List"); //Instantiate an instance of Mylist. Mylist = class, list = object aka instance of the class
      System.out.println(hwlist.size()); //Printing out the size of list, and list is an object. Here we are using the size method 
      
      Mylist<Object> quizlist = new Mylist<>("Quiz List"); //Instantiate an instance of Mylist. Mylist = class, list = object aka instance of the class
      System.out.println(quizlist.size()); //Printing out the size of list, and list is an object. Here we are using the size method 
      
      //NEED TO USE THE METHOD TO ADD A NODE TO THE HEAD - insertAtFront METHOD. Requirements 1 and 2
      hwlist.insertAtFront(new Homework(5, "1-10"));
      hwlist.insertAtFront(new Homework(20, "2-8"));
      hwlist.insertAtFront(new Homework(35, "1-15"));
      hwlist.insertAtBack(new Homework(50, "2-20"));
      hwlist.insertAtBack(new Homework(62, "4-16"));
      hwlist.insertAtBack(new Homework(78, "1-12"));
      
      //Add a node to the head - requirements 1,2
      quizlist.insertAtFront(new Quiz(11, "1900s"));
      quizlist.insertAtFront(new Quiz(12, "1910s"));
      quizlist.insertAtFront(new Quiz(13, "1920s"));
      quizlist.insertAtBack(new Quiz(14, "1930s"));
      quizlist.insertAtBack(new Quiz(15, "1940s"));
      quizlist.insertAtBack(new Quiz(16, "1950s"));
      
      //CALL THE METHOD TO REMOVE THE TAIL NODE - Requirement 3
      System.out.print("Before removing the item from the end, the homework list looks like: ");
      hwlist.print();
      hwlist.removeFromTail();
      System.out.print("After removing the item from the end, the homework list looks like: ");
      hwlist.print(); //print the homework list
      
      //CALL THE METHOD TO REMOVE THE HEAD NODE - Requirement 4
      System.out.print("Before removing the item from the front, the homework list looks like: ");
      hwlist.print();
      hwlist.removeFromHead();
      System.out.print("After removing the item from the front, the homework list looks like: ");
      hwlist.print(); //print the homework list
      
      //Requirement 5 
      System.out.println(((Homework)hwlist.searchByIndex(1)).getPage()); //prints out page number but not questions
      System.out.println(((Homework)hwlist.searchByIndex(2)).getPage()); //prints out page number but not questions
      System.out.println(((Homework)hwlist.searchByIndex(3)).getPage()); //prints out page number but not questions
      //hwlist.searchByIndex(3); pretty sure this code is now wrong
      //hwlist.searchByIndex(10); pretty sure this code is now wrong 
      
      //start of quiz--------------------------------------------------------------------------------- 
           
      //CALL THE METHOD TO REMOVE THE TAIL NODE - Requirement 3
      System.out.print("Before removing the item from the end, the quiz list looks like: ");
      quizlist.print();
      quizlist.removeFromTail();
      System.out.print("After removing the item from the end, the quiz list looks like: ");
      quizlist.print(); //print the quiz list
      
      //CALL THE METHOD TO REMOVE THE HEAD NODE - Requirement 4
      System.out.print("Before removing the item from the front, the quiz list looks like: ");
      quizlist.print();
      quizlist.removeFromHead();
      System.out.print("After removing the item from the front, the quiz list looks like: ");
      quizlist.print();
      
      //Requirement 5       
      System.out.println(((Quiz)quizlist.searchByIndex(1)).getChapter()); 
      System.out.println(((Quiz)quizlist.searchByIndex(2)).getChapter()); 
      System.out.println(((Quiz)quizlist.searchByIndex(3)).getChapter()); 
      //quizlist.searchByIndex(1); pretty sure this code is now wrong 
      //quizlist.searchByIndex(3); //pretty sture this code is now wrong
      //quizlist.searchByIndex(10);  pretty sure this code is now wrong

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
      //quizlist.print();
            
      }
}      
      