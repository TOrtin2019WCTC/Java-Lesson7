package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        setPrerequisites(prerequisites);
        this.prerequisites = getPrerequisites();
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
         if (prerequisites == null || prerequisites.length() == 0) {
            System.out.println("Error: prerequisites cannot be null of empty string");               
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final String getPrerequisites() {
        return prerequisites;
    }

   
   

  
}
