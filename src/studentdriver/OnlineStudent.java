/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S559619
 */
public class OnlineStudent extends StudentFees{
    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;
    
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths){
        super(studentName,studentID,isEnrolled);
        this.noOfMonths = noOfMonths;
    }
    
    public double getPayableAmount(){
        return noOfMonths * MONTHLY_FEE;
    }
    
    public String toString(){
        return "No of months: " + this.noOfMonths + "\nPayableAmount: " + getPayableAmount();
    }
}