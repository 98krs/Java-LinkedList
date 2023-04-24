//Kailan Stewart - Linked List Programming Assignment 
//Main file that's executed 

public class JavaLinkedListTest {
   public static void main(String[] args) {
   
      Mylist<Object> hwlist = new Mylist<>("Homework List"); 
      System.out.println("The size of the homework list before adding items is " + hwlist.size()); //Printing out the size of list, and list is an object. Here we are using the size method 
      
      Mylist<Object> quizlist = new Mylist<>("Quiz List"); 
      System.out.println("The size of the quiz list before adding items is " + quizlist.size()); //Printing out the size of list, and list is an object. Here we are using the size method 
      
      //Insert item at front and back of homework list
      hwlist.insertAtFront(new Homework(5, "1-10"));
      hwlist.insertAtFront(new Homework(20, "2-8"));
      hwlist.insertAtFront(new Homework(35, "1-15"));
      hwlist.insertAtBack(new Homework(50, "2-20"));
      hwlist.insertAtBack(new Homework(62, "4-16"));
      hwlist.insertAtBack(new Homework(78, "1-12"));
      
      //Insert item at front and back of quiz list
      quizlist.insertAtFront(new Quiz(11, "1900s"));
      quizlist.insertAtFront(new Quiz(12, "1910s"));
      quizlist.insertAtFront(new Quiz(13, "1920s"));
      quizlist.insertAtBack(new Quiz(14, "1930s"));
      quizlist.insertAtBack(new Quiz(15, "1940s"));
      quizlist.insertAtBack(new Quiz(16, "1950s"));
      
      System.out.println("The number of items in the homework list is " + hwlist.size());
      System.out.println("The entire homework list contains: ");
      hwlist.print();
      System.out.println("The number of items in the quiz list is " + quizlist.size());
      System.out.println("The entire quiz list contains: ");
      quizlist.print();
            
      //CALL THE METHOD TO REMOVE THE TAIL NODE ON THE HOMEWORK LIST
      System.out.println("Before removing the item from the end, the homework list looks like: " );
      hwlist.print();
      System.out.println("and there are " + hwlist.size() + " items.");
      hwlist.removeFromTail();
      System.out.println("After removing the item from the end, the homework list looks like: ");
      hwlist.print(); //print the homework list
      System.out.println("and there are " + hwlist.size() + " items.");
      
      //CALL THE METHOD TO REMOVE THE HEAD NODE ON THE HOMEWORK LIST
      System.out.println("Before removing the item from the front, the homework list looks like: ");
      hwlist.print();
      System.out.println("and there are " + hwlist.size() + " items.");
      hwlist.removeFromHead();
      System.out.println("After removing the item from the front, the homework list looks like: ");
      hwlist.print(); //print the homework list
      System.out.println("and there are " + hwlist.size() + " items.");
      
      System.out.println("At index 1 of the homework list, the page number is " + ((Homework)hwlist.searchByIndex(1)).getPage() + " and the questions are " + ((Homework)hwlist.searchByIndex(1)).getQuestions());    
      System.out.println("At index 1 of the quiz list, the chapter is " + ((Quiz)quizlist.searchByIndex(1)).getChapter() + " and the subject is " + ((Quiz)quizlist.searchByIndex(1)).getSubject());                   
                
      //CALL THE METHOD TO REMOVE THE TAIL NODE ON THE QUIZ LIST
      System.out.println("Before removing the item from the end, the quiz list looks like: ");
      quizlist.print();
      System.out.println("and there are " + quizlist.size() + " items.");
      quizlist.removeFromTail();
      System.out.println("After removing the item from the end, the quiz list looks like: ");
      quizlist.print(); //print the quiz list
      System.out.println("and there are " + quizlist.size() + " items.");
      
      //CALL THE METHOD TO REMOVE THE HEAD NODE ON THE QUIZ LIST
      System.out.println("Before removing the item from the front, the quiz list looks like: ");
      quizlist.print();
      System.out.println("and there are " + quizlist.size() + " items.");
      quizlist.removeFromHead();
      System.out.println("After removing the item from the front, the quiz list looks like: ");
      quizlist.print();
      System.out.println("and there are " + quizlist.size() + " items.");
                
      }
}      
      