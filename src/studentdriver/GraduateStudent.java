/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S559619
 */
public class GraduateStudent extends StudentFees{
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    

    

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, int coursesEnrolled, boolean isGraduateAssistant, String graduateAssistantType) {
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }
    

    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, 
        boolean isGraduateAssistant, int coursesEnrolled){
        this(studentName,studentID,isEnrolled, coursesEnrolled, isGraduateAssistant);
        
    }

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, int coursesEnrolled, boolean isGraduateAssistant) {
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
        graduateAssistantType = "";
    }

    
    public boolean isIsGraduateAssistant(){
        return isGraduateAssistant; 
    }
    
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    
    public double getPayableAmount(){
        if (graduateAssistantType.equals("full")){
               return ADDITIONAL_FEES;
        }
        else if(graduateAssistantType.equals("half")){
            return (super.getPayableAmount() / 2)+ ADDITIONAL_FEES;
        }
        else{    
        return super.getPayableAmount()+ ADDITIONAL_FEES;
        }
    }
    
    public String toString(){
        return "Graduate Assistant: " + this.isGraduateAssistant + "\nGraduate assistant type: " + this.graduateAssistantType + 
                "\ncourses enrolled: " + this.coursesEnrolled + "\nPayable amount: " + getPayableAmount();
    }
                   
}
