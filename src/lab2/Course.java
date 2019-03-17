/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author tim
 */
public interface Course {
    
    void setCourseName(String courseName);
    String getCourseName();
    void setCourseNumber(String courseNumber);
    String getCourseNumber();
    void setCredits(double credits);
    double getCredits();
    
}
