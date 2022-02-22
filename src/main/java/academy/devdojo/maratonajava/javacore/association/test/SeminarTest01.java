package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.exercise.Locale;
import academy.devdojo.maratonajava.javacore.association.exercise.Seminar;
import academy.devdojo.maratonajava.javacore.association.exercise.Student;
import academy.devdojo.maratonajava.javacore.association.exercise.Teacher;

public class SeminarTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("Estrada do Moinho 2355");

        Student student1 = new Student("Elvis Muniz", 30);
        Student student2 = new Student("Thais Katz", 28);
        Student student3 = new Student("Thays Muniz", 24);
        Student[] students = {student1, student2, student3};

        Teacher teacher1 = new Teacher("Bryan Duarte", "Java Specialist");

        Seminar seminar1 = new Seminar("Java Básico", students, locale);
        Seminar[] seminars = {seminar1};

        teacher1.setSeminars(seminars);

        teacher1.print();
    }
}
