package Object.Management;

import Object.Roof.Person;

public class Teachers extends Person {
    private String subject, degree, teacherClass;
    private int salary;

    public Teachers(){
        super();
    }

    public Teachers(int id, String name, String hometown,
                    int age, String subject,
                    String degree, String teacherClass, int salary) {
        super(id, name, hometown, age);
        this.subject = subject;
        this.degree = degree;
        this.teacherClass = teacherClass;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(String teacherClass) {
        this.teacherClass = teacherClass;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

