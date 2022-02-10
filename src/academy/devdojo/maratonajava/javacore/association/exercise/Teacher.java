package academy.devdojo.maratonajava.javacore.association.exercise;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("---------------");
        System.out.println("Teacher: " + this.name);
        if (this.seminars == null) {
            return;
        }
        System.out.println("\n*** Seminars ***".toUpperCase());
        for (Seminar seminar : this.seminars) {
            System.out.print(seminar.getTitle() + " - ");
            System.out.println(seminar.getLocale().getLocale());
            System.out.println("\n+++ Students enrolled +++".toUpperCase());
            if (seminar.getStudents() == null || seminar.getStudents().length == 0) {
                System.out.println("No students enrolled in the seminar... :(");
                continue;
            }
            for (Student student : seminar.getStudents()) {
                System.out.println("Student: " + student.getName() + " |Age: " + student.getAge());
            }
        }

    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
