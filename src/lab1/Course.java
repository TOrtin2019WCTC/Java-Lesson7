/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author tim
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    public final double MIN_CREDITS = 0.5;
    public final double MAX_CREDITS = 4.0;

    public Course(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    
  

    public final void setCourseName(String courseName){
        this.courseName = courseName;
    };
    public final String getCourseName(){
        return courseName;
    };
    public final void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    };
    public final String getCourseNumber(){
        return courseNumber;
    };
    public final void setCredits(double credits){
        if (credits < MIN_CREDITS || credits > MAX_CREDITS){
            System.out.println("not a valid number of credits");
            System.exit(0);
        }
        
        this.credits = credits;
    };
    public final double getCredits(){
        return credits;
    };
    
   public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();
    

}
