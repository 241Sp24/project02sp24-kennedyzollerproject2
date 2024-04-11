
package studentdriver;

import java.util.*;
import java.io.*;
public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException{
        //Scanner input = new Scanner();
        StudentFees[] students = new StudentFees[12];
        
        //students variables
        int nougs = 0;
        int nogs = 0;
        int nos = 0;
        
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of UG students: ");
        nougs = input.nextInt();
        
        System.out.println("Enter the no of Graduate studnets: ");
        nogs = input.nextInt();
        
        System.out.println("Enter the no online students: ");
        nos = input.nextInt();
        
        //Open file to read from
        File inputFile = new File("input.csv");
        Scanner input2 = new Scanner(inputFile);
        
        //while loop to go through inputFile
        int x = 0;
        while (input2.hasNextLine()) {
            String data = input2.nextLine();
            
            //split function to break up the data line at the first comma
            String[] dataArray = data.split(",");
            
            //if statement to parse the undergrad student lines
            if (x < nougs){
                //use parse to assign each part of data line
                int studentID = Integer.parseInt(dataArray[0]);
                String studentName = dataArray[1]; 
                boolean isEnrolled = Boolean.parseBoolean(dataArray[2]);
                int coursesEnrolled = Integer.parseInt(dataArray[3]);
                boolean hasScholarship = Boolean.parseBoolean(dataArray[4]);
                double scholarshipAmount = Double.parseDouble(dataArray[5]);
                students[x] = new UGstudent(studentName, studentID, isEnrolled, coursesEnrolled, hasScholarship, scholarshipAmount);
                x++;
            }
           
            //else if statement to start parsing the graduateStudent lines
            else if (x < nougs + nogs){
                
                //if statement to parse the grad students that are an assistant
                if (dataArray.length == 6){
                    int studentID = Integer.parseInt(dataArray[0]);
                    String studentName = dataArray[1];
                    boolean isEnrolled = Boolean.parseBoolean(dataArray[2]);
                    int coursesEnrolled = Integer.parseInt(dataArray[3]);
                    boolean isGraduateAssistant = Boolean.parseBoolean(dataArray[4]);
                    String graduateAssistantType = dataArray[5];
                    students[x] = new GraduateStudent(studentName, studentID, isEnrolled, coursesEnrolled, isGraduateAssistant, graduateAssistantType);
                    x++;
                }
                //else statement to parse the grad students that aren't an assistant
                else {
                    int studentID = Integer.parseInt(dataArray[0]);
                    String studentName = dataArray[1];
                    boolean isEnrolled = Boolean.parseBoolean(dataArray[2]);
                    int coursesEnrolled = Integer.parseInt(dataArray[3]);
                    boolean isGraduateAssistant = Boolean.parseBoolean(dataArray[4]);
                    students[x] = new GraduateStudent(studentName, studentID, isEnrolled, coursesEnrolled, isGraduateAssistant);
                    x++;
                }
            }
            else if (x < nougs + nogs + nos){
                int studentID = Integer.parseInt(dataArray[0]);
                String studentName = dataArray[1];
                boolean isEnrolled = Boolean.parseBoolean(dataArray[2]);
                int noOfMonths = Integer.parseInt(dataArray[3]);
                students[x] = new OnlineStudent(studentName, studentID, isEnrolled, noOfMonths);
                x++;
            }
        }
    
    int scholarship = 0;
    int UGcourses = 0;
    for (StudentFees f : students){
        if (f instanceof UGstudent){
            UGstudent y = (UGstudent)f;
            if(y.isHasScholarship()){
                scholarship += 1;
            }
            if(y.isIsEnrolled()){
                UGcourses += y.getCoursesEnrolled();
            }
        }
    }
    
    int gradCount = 0;
    int GCourses = 0;
    for (StudentFees f : students)
        if (f instanceof GraduateStudent){
            GraduateStudent g = (GraduateStudent)f;
            if(g.isIsGraduateAssistant()){
                gradCount += 1;
            }
            if(g.isIsEnrolled()){
                GCourses += g.getCoursesEnrolled();
            }
        }
    
    //Enhance for loop ot print
    int a = 0;
    int b = 0;
    int c = 0;
    for (StudentFees f : students){
        
        //if statement to find all accounts of UGstudent
        if (f instanceof UGstudent){
            if (a == 0) {
                System.out.println("\n**********Undergraduate Students**********");
            }
            System.out.println(f);
            a++;
        //else if to find all accounts of gradStudent
        } else if (f instanceof GraduateStudent){
            if (b == 0){
                System.out.println("**********Graduate Students**********");
            }
            System.out.println(f);
            b++;
        //else if to find all accounts of online student
        }else if (f instanceof OnlineStudent){
            if (c == 0){
               System.out.println("**********Online Students**********");
            }
            System.out.println(f);
            c++; 
        }
    }
    }
    
}
