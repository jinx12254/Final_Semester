package Object.Roof;

public class Person {
    protected String name, hometown;
    protected int id, age;

    public Person(){};

    public Person(int id, String name, String hometown,
                  int age) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}

