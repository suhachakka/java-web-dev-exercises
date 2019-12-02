package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student stu1 = new Student("Jack",1,1,4.0);
        System.out.println(stu1.getNumberOfCredits());
        System.out.println(stu1.getGpa());
        System.out.println(stu1.addGrade(70,2.0));
        stu1.getGradeLevel();

    }
}
