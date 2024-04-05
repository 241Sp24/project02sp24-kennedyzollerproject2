
package studentdriver;


public class StudentFees {
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private int CREDITS_PER_COURSE = 3;
    private double PER_CREDIT_FEE = 543.50;
    
    public StudentFees(String studentName, int studentID, boolean isEnrolled){
        
        
    }
    public String getStudentName(){
        return studentName;
    }
    public int getStudentID(){
        return studentID;
    }
    public boolean isIsEnrolled(){
        return isEnrolled;
    }
    public int getCREDITS_PER_COURSE(){
        return CREDITS_PER_COURSE;
    }
    public double getPER_CREDIT_FEE(){
        return PER_CREDIT_FEE;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @param isEnrolled the isEnrolled to set
     */
    public void setIsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }
    
    
}
