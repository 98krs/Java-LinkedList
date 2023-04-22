//Project  
//Superclass file 

public class Coursework {
   
   //create the variables that will apply to all subclasses 
   private String format = "Short answer and multiple choice"; //format = short answer, multiple choice
   private double timeAllotted = 1; //create timeAllotted variable to hold how much time is allowed to complete the assignment 
   private java.util.Date dateCourseworkLastAccessed; //creates a timestamp for the last time the coursework was accessed 
   
   //Create default constructor 
   public Coursework() {
      dateCourseworkLastAccessed = new java.util.Date();
   }
   
   //Make another constructor which takes in parameters 
   public Coursework(String format, double timeAllotted) {
      dateCourseworkLastAccessed = new java.util.Date(); //initializes the date object 
      this.format = format;
      this.timeAllotted = timeAllotted; 
   }
   
   //GETTERS AND SETTERS FOR THE CHAPTER AND TIME ALLOTTED
   
   //format getter 
   public String getFormat() {
      return format; 
   }
   
   //format setter
   public void setFormat(String format) {
      this.format = format; 
   }
   
   //time allotted getter
   public double getTimeAllotted() {
      return timeAllotted;
   }
   
   //time allotted setter 
   public void setTimeAllotted(double timeAllotted) {
      this.timeAllotted = timeAllotted; 
   }
   
   //to string method 

   public String toString() {
      return "Date coursework last accessed: " + dateCourseworkLastAccessed + ", Format: " + format + ", Time allotted: " + timeAllotted + " hours";
   }
   
}



