public class OfferedCourse extends Course {
   // TODO: Declare private fields - instructorName, term, classTime
   private String instructorName;
   private String term;
   private String classTime;

   // TODO: Define mutator methods -
   //      setInstructorName(), setTerm(), setClassTime()
   public void setInstructorName(String newInstructorName) {
      instructorName = newInstructorName;
   }
   
   public void setTerm(String newTerm) {
      term = newTerm;
   }
   
   public void setClassTime(String newClassTime) {
      classTime = newClassTime; 
   }


   // TODO: Define accessor methods -
   //      getInstructorName(), getTerm(), getClassTime()
   public String getInstructorName() {
      return instructorName;
   }
   
   public String getTerm() {
      return term;  
   }
   
   public String getClassTime() {
      return classTime;  
   }
   
}
