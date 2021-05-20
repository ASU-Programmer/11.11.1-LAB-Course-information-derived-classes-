public class Course{
   // TODO: Declare private fields - courseNumber, courseTitle
   private String courseNumber;
   private String courseTitle;

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
   public void setCourseNumber(String newCourseNumber) {
     courseNumber = newCourseNumber;
   }
   
   public void setCourseTitle(String newCourseTitle) {
      courseTitle = newCourseTitle;
   }


   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
   public String getCourseNumber() {
      return courseNumber;
   }
   
   public String getCourseTitle() {
      return courseTitle;
   }
   // TODO: Define printInfo()
   public void printInfo() {
      System.out.println("Course Information: ");
      System.out.println("   Course Number: " + courseNumber);
      System.out.println("   Course Title: " + courseTitle);
   }
}
