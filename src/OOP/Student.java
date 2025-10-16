package OOP;

public class Student {
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", addres: " + this.address + ", GPA: " + this.gpa;
    }
}
