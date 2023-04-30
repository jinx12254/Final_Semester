package Object.Management;

import Object.Roof.Person;

public class Workers extends Person {
    private String location, shift;
    private int salary;

    public Workers() {
        super();
    }

    public Workers(int id, String name, int age, String hometown,
                   String location,  int salary, String shift) {
        super(id, name, hometown, age);
        this.location = location;
        this.shift = shift;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
