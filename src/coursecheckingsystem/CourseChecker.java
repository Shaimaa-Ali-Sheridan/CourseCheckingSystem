package coursecheckingsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class CourseChecker {
    private static CourseChecker onlyObject = null;
    private CourseChecker()
    {}
    public static CourseChecker getInstance()
    {
        if (onlyObject == null)
            onlyObject = new CourseChecker();
        return onlyObject;
    }
    
    public static String[] GRADE_CATEGORY = {"Exams", "Assignments"};
    public static int EXAMS_WIEGHT = 40;
    public static int ASSIGNMENTS_WIEGHT = 60;
    
    private String studentName;
    private int    studentID;
    
    private String courseName;
    private String courseCode;
    
    private double examsTotalGrade;
    private double assignmentsTotalGrade;

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the courseCode
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * @return the examsTotalGrade
     */
    public double getExamsTotalGrade() {
        return examsTotalGrade;
    }

    /**
     * @param examsTotalGrade the examsTotalGrade to set
     */
    public void setExamsTotalGrade(double examsTotalGrade) {
        this.examsTotalGrade = examsTotalGrade;
    }

    /**
     * @return the assignmentsTotalGrade
     */
    public double getAssignmentsTotalGrade() {
        return assignmentsTotalGrade;
    }

    /**
     * @param assignmentsTotalGrade the assignmentsTotalGrade to set
     */
    public void setAssignmentsTotalGrade(double assignmentsTotalGrade) {
        this.assignmentsTotalGrade = assignmentsTotalGrade;
    }
    
}
