//Quiz subclass 

public class Quiz extends Coursework {

   //create the variables 
   private int chapter; //what chapter the quiz is on. Each quiz is on a single chapter. 
   private String subject; 
   
   //default constructor 
   public Quiz() {
   }
   
   //Call superclass's default constructor to initialize variables for us 
   public Quiz(int chapter, String subject) {
      super(); //the superclass's constructor will be called 
      this.chapter = chapter; //set the chapter 
      this.subject = subject; 
   }
   
   //create another constructor 
   public Quiz(int chapter, String subject, String format, double timeAllotted) {
      super(format, timeAllotted); //this will call Coursework(format, timeAllotted) 
      this.chapter = chapter; 
      this.subject = subject; 
   }
   
   //GETTERS AND SETTERS FOR THE CHAPTER AND SUBJECT 
   
   //chapter getter 
   public int getChapter() {
      return chapter;
   }
   
   //chapter setter 
   public void setChapter(int chapter) {
      this.chapter = chapter;
   }
   
   //subject getter
   public String getSubject() {
      return subject;
   } 
   
   //subject setter
   public void setSubject(String subject) {
      this.subject = subject;
   }
   
   public void printQuiz() {
      System.out.println("The quiz was last accessed " + toString()); 
   }
   
   //create a new toString method 
   public String toString() { 
      return "Quiz " + ", Format: " + getFormat() + ", Subject: " + getSubject() + ", Chapter: " + getChapter() + super.toString();
   }

   
}
