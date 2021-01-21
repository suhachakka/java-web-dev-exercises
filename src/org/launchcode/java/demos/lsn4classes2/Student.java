package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        /*
        * This method returns the student’s level based on the number of credits they have earned: Freshman (0-29
        * credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits).
*/
         if(this.numberOfCredits >=0 && this.numberOfCredits <= 29 ){
             return "Freshman";
         }else if(this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
             return "Sophomore";
         }else if(this.numberOfCredits >= 60 && this.numberOfCredits <=89 ) {
             return "Junior";
         }else if(this.numberOfCredits >= 90) {
             return "Senior";
         }else{
             return null;
         }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        //  if a student received an “A” (worth 4 points) in a 3-credit course and a “B”
        //  (worth 3 points) in a 4-credit course, their total quality score would be: 4.0 * 3 + 3.0 * 4 = 24. Their GPA would then be 24 / 7 = 3.43.

        //Calculate their current total quality score by using the formula gpa * numberOfCredits.
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        //Use the new course grade and course credits to update their total quality score.
        double newQualityScore = grade * courseCredits;

        // update the totalqualityscore
         double totalQualityScore = currentTotalQualityScore+newQualityScore;
        //Update the student’s total numberOfCredits.
        int newTotalNumberOfCredits =this.numberOfCredits +courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;
        /*Compute their new GPA.
        GPA is computed via the formula:
        gpa = (total quality score) / (total number of credits)*/

        double newGpa = totalQualityScore/newTotalNumberOfCredits;
        this.gpa =newGpa;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", studentId=" + studentId +
//                ", numberOfCredits=" + numberOfCredits +
//                ", gpa=" + gpa +
//                '}';
        return this.name + ":" + this.gpa;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,30,4.0);
        Student student= new Student("Sally",2,34,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        //System.out.println(sally.getGradeLevel());
        Teacher theTeacher = new Teacher("Suha", "Chakka", "Java", 2);
        ArrayList<Student> enrollstudents = new ArrayList<>();
        enrollstudents.add(student);
        enrollstudents.add(sally);

        Course first_course = new Course("My first course", 2,theTeacher);

        Course second_course = new Course("My second course", 3, theTeacher);
        sally.addGrade(3,3.0);
        System.out.println(sally.getGpa());
        sally.addGrade(3,3.0);
        System.out.println(sally.toString());
        System.out.println(sally.equals(student));
        System.out.println(sally.equals(sally));
        //System.out.println(sally.equals(theTeacher));
        System.out.println(first_course.toString());
        System.out.println(first_course.equals(second_course));

        System.out.println(first_course);
        first_course.setEnrolledStudents(enrollstudents);
        System.out.println(first_course.getEnrolledStudents());


    }
}
