/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S559619
 */

public class UGstudent extends StudentFees{
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;
    
    
    public UGstudent(String studentName, int studentID, boolean isEnrolled, 
        boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        this(studentName,studentID,isEnrolled, coursesEnrolled, hasScholarship, scholarshipAmount);
    }

    public UGstudent(String studentName, int studentID, boolean isEnrolled, int coursesEnrolled, boolean hasScholarship, double scholarshipAmount) {
        this(studentID, studentName, isEnrolled, coursesEnrolled, hasScholarship, scholarshipAmount);
    }

    public UGstudent(int studentID, String studentName, boolean isEnrolled, int coursesEnrolled, boolean hasScholarship, double scholarshipAmount) {
        super(studentName, studentID, isEnrolled);
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
        return ((super.getPayableAmount() * coursesEnrolled) + ADDITIONAL_FEE) - scholarshipAmount;
    }
    
    public String toString(){
        
        return "Scholarship: "  + this.hasScholarship + "\nScholarship Amount: " + this.scholarshipAmount + 
                "\nCourses Enrolled: " + this.coursesEnrolled + "\nPayable Amount: " + getPayableAmount();
    }
}
