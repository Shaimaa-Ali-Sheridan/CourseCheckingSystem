
package coursecheckingsystem;

import java.util.Scanner;

/**
 *
 * @author shaim
 */
public class CourseCheckingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CourseChecker cc =  CourseChecker.getInstance();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the Student name");
        String studentName = sc.nextLine();
        cc.setStudentName(studentName);

        System.out.println("Please enter the Student ID");
        String studentID = sc.nextLine();
        cc.setStudentName(studentID);
        
        System.out.println("Please enter the course name");
        String courseName = sc.nextLine();
        cc.setCourseName(courseName);

        System.out.println("Please enter the course code");
        String courseCode = sc.nextLine();
        cc.setCourseCode(courseCode);

        for (int i=0;i<CourseChecker.GRADE_CATEGORY.length;i++)
        {
            System.out.println("Enter the total grade for " + CourseChecker.GRADE_CATEGORY[i]);
            double grade = sc.nextDouble();
            if (i == 0)
                cc.setExamsTotalGrade(grade);
            else
            {
                if (i == 1)
                    cc.setAssignmentsTotalGrade(grade);
            }
        }
        
        // The student would pass if they get at least 50% is the assignments and 50% in the exams
        double examsPercentage = cc.getExamsTotalGrade() / CourseChecker.EXAMS_WIEGHT * 100;
        System.out.println("Percentage of the exams is:"+  examsPercentage);
        
        double assignmentsPercentage = cc.getAssignmentsTotalGrade() / CourseChecker.ASSIGNMENTS_WIEGHT * 100;
        System.out.println("Percentage of the assignments is:"+  assignmentsPercentage);
    
        //We'll assume that both percentages have the same wieght for the sake of simplicity
        double totalPercentage = examsPercentage + assignmentsPercentage;
        
        if (PassingGradeValidator.isPassingGrade(totalPercentage))
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
    
}
