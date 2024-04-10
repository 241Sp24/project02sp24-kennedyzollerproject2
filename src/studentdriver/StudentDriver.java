
package studentdriver;

import java.util.*;
import java.io.*;
public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException{
        //Scanner input = new Scanner();
        StudentFees [] students = new StudentFees[12];
        
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
            
            if (x < nougs){
                //use parse to assign each part of 
                int studentID = Integer.parseInt(dataArray[0]);
                String studentName = dataArray[1]; 
                boolean isEnrolled = Boolean.parseBoolean(dataArray[2]);
                int coursesEnrolled = Integer.parseInt(dataArray[3]);
                boolean hasScholarship = Boolean.parseBoolean(dataArray[4]);
                double scholarshipAmount = Double.parseDouble(dataArray[5]);
                x++;
            }
            else if (x < nougs + nogs){
                int studentID = Integer.parseInt(dataArray[0]);
                String studentName = dataArray[1];
                boolean isEnrolled = Boolean.parseBoolean(dataArray[2]);
                int coursesEnrolled = Integer.parseInt(dataArray[2]);
                boolean 
            }
        }
        
        
    }
    
}
