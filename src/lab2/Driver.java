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
public class Driver {
    public static void main(String[] args) {
        
        
        AdvancedJavaCourse adv = new AdvancedJavaCourse("adv java", "2332", 4, "IntroJavaCourse");
        
        
        System.out.println("\ncourse name: " + adv.getCourseName());
        System.out.println("course number: " + adv.getCourseNumber());
        System.out.println("course credits: " + adv.getCredits());
        System.out.println("course prerequisites: " + adv.getPrerequisites());
        
        IntroJavaCourse intro = new IntroJavaCourse("Intro to Java", "3232", 3, "Intro programming");
        
        System.out.println("\ncourse name: " + intro.getCourseName());
        System.out.println("course number: " + intro.getCourseNumber());
        System.out.println("course credits: " +intro.getCredits());
        System.out.println("course prerequisites: " + intro.getPrerequisites());
        
        IntroToProgrammingCourse intPro = new IntroToProgrammingCourse("Intro programming", "3255", 2);
        
        System.out.println("\ncourse name: " + intPro.getCourseName());
        System.out.println("course number: " +intPro.getCourseNumber());
        System.out.println("course credits: " + intPro.getCredits());
        System.out.println("course prerequisites: " + intPro.getPrerequisites());
        
        
        
        
        
        
        
        
        
        // I think using an interface for this particular set of classes is unnecessary. 
        // The Course itself isn't DOING anything, and from what I understand, an 
        // interface is used for defining what class DO, not what they are. 
        
        // Using the Liskov Substitution principle really isn't possible with the way this package is
        // set up. There is no parent class to substitute from.
    }
}
