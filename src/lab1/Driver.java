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
public class Driver {
    public static void main(String[] args) {
        Course course = new AdvancedJavaCourse("advanced","1231",3,"intro to java");
        
        System.out.println("course name: " + course.getCourseName());
        System.out.println("course number: " + course.getCourseNumber());
        System.out.println("course credits: " + course.getCredits());
        System.out.println("course prerequisites: " + course.getPrerequisites());
        
        
        Course course2 = new IntroJavaCourse("Intro to java", "1299", 2, "Intro to prgramming");
        System.out.println("\ncourse name: " + course2.getCourseName());
        System.out.println("course number: " + course2.getCourseNumber());
        System.out.println("course credits: " + course2.getCredits());
        System.out.println("course prerequisites: " + course2.getPrerequisites());
        
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", "1300", 2);
        
        System.out.println("\ncourse name: " + course3.getCourseName());
        System.out.println("course number: " + course3.getCourseNumber());
        System.out.println("course credits: " + course3.getCredits());
        System.out.println("course prerequisites: " + course3.getPrerequisites());
    }
}
