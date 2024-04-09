/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S559619
 */
public class GraduateStudent {
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, 
            String graduateAssistantType, int coursesEnrolled){
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, 
            boolean isGraduateAssistant, int coursesEnrolled){
        
    }
    
    public boolean isIsGraduateAssistant(){
        return isGraduateAssistant; 
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
