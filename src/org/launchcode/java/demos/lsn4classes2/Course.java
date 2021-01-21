package org.launchcode.java.demos.lsn4classes2;


//import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();
    private int worthNumberOfCredits;

    public Course(String name, int worthNumberOfCredits, Teacher teacher ){
        this.name = name;
        this.worthNumberOfCredits = worthNumberOfCredits;
        this.teacher =teacher;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public int getWorthNumberOfCredits() {
        return worthNumberOfCredits;
    }

    public void setWorthNumberOfCredits(int worthNumberOfCredits) {
        this.worthNumberOfCredits = worthNumberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    @Override
  public String toString()
    {
    return this.name +"is worth by " + this.worthNumberOfCredits + " number of credits and course teacher is " + this.teacher ;

}

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, worthNumberOfCredits);
    }
}
