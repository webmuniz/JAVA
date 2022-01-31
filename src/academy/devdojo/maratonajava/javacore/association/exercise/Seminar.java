package academy.devdojo.maratonajava.javacore.association.exercise;

public class Seminar {
    private String title;
    private Student[] students;
    private Locale locale;

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }

    public Seminar(String title, Student[] students, Locale locale) {
        this.title = title;
        this.students = students;
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
