package lab1;


/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course{


    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
       super(courseName,courseNumber,credits);
    }

    @Override
    public void setPrerequisites(String prerequisites) {
      
    }

    @Override
    public String getPrerequisites() {
        return "none";
    }

  

}
