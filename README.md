Project Description
Students will create a linked list structure that will use their class structures from the inheritance assignment. 
Instead of using arrays or ArrayList for storing data, the new program will use a linked list.  
Note that you will NOT be using the existing Java class LinkedList, you will be using the provided linked list code and modifying it.  
Demonstrating your code for two subclasses is required.  The program will use the linked list structure to do the following functions; 
1) add to the front (already included)
2) add to the end (already included)
3) remove from end.  The program must throw an exception if the program attempts to remove an item from an empty list.  
4) remove from the front 
5) search for an item by index number (the number of its position in the list) and display the information for that library item.  The code must validate that the index number is within bounds and throw an appropriate exception if not. 
6) print all items in the library (you may use the print method provided if you appropriately override the toString to ensure nice formatting and labels) including attribute labels (print out both lists) and the total number of items (either for each list or combined is acceptable)
You are provided with a generic program called "MyList" which provides some of the required capabilities and prints the list contents (remember that you must override the ToString in each subclass in order for this print method to display the contents as a string).  Note that the provided code uses a loop to traverse the list in order to print.  A similar traversal loop can be used to search for a specific index. Once a specific index is found it can be used to display the contents of the node.  A “size” method is also included as an enabler for your additional methods.
You will add the additional functions to the MyList program.  In addition, you will create your own driver/test program that creates 3 items for each subclass and demonstrates all of the required program functions. Make sure to include all your program files (including your super and subclass files for the grader/TA reference) and execution screenshots demonstrating all requirements. To demonstrate the add and remove operations, you should display the list before the operation and just after to show the operation was successfully completed. The display of the list should include the total number of items.  To display item 5) "search for an item" you can add a label to the item display, for example "item at index 1 is “. Don’t forget to include demonstrating the exceptions and related messages.

