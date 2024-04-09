/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S559619
 */

public class UGstudent {
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;
    
    
    public UGstudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, 
        double scholarshipAmount, int coursesEnrolled){
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public boolean isHasScholarship(){
        return hasScholarship;
    }
    
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    
    public double getPayableAmount(){
        return payableAmount;
    }
    
    public String toString(){
        return 
    }
}
