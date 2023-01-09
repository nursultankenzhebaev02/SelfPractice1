package day31_MethodOverriding;

public class Student extends Person {

    private String studentID, fieldOfStudy, schoolName;
    private double grade;


    public Student(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        if (fieldOfStudy == null || fieldOfStudy.isEmpty()){

            System.err.println("Field of study should not be set to null or empty");
            System.exit(1);
        }

        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        if (schoolName == null || schoolName.isEmpty()){

            System.err.println("School name should not be set to null or empty");
            System.exit(1);
        }

        this.schoolName = schoolName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {

        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){

            System.err.println("grade must be valid (A, B, C, D, F)");

        }

        this.grade = grade;
    }

    public void study(){
        System.out.println("Student is studying");
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
