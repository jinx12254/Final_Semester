package Object.Management;

import Object.Roof.Person;

public class Students extends Person {
    private String major, studentClass;
    private double grades;

    public Students() {
    }

    public Students(int id, String name, String hometown,
                    int age, String major, String studentClass, double grades) {
        super(id, name, hometown, age);
        this.major = major;
        this.studentClass = studentClass;
        this.grades = grades;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
}
