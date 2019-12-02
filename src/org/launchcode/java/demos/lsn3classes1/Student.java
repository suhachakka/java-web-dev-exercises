package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(){}

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public double addGrade(int totalNumberOfCredits,double numericalGrade){
           double totalQualityScore =numericalGrade * totalNumberOfCredits;
           gpa = totalQualityScore/totalNumberOfCredits;
           return gpa;
    }
    public void getGradeLevel(){
         if(numberOfCredits <= 29 ){
               System.out.println("Freshman");
         }else if(numberOfCredits <=59 ){
             System.out.println("Sophomore");
         }else if(numberOfCredits <=89){
             System.out.println("Junior");

         }else{
             System.out.println("Senior");

         }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() &&
                getNumberOfCredits() == student.getNumberOfCredits() &&
                Double.compare(student.getGpa(), getGpa()) == 0 &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentId(), getNumberOfCredits(), getGpa());
    }
}