package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.School;
import academy.devdojo.maratonajava.javacore.association.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Jiraia");
        Teacher teacher2 = new Teacher("Kakashi");
        Teacher teacher3 = new Teacher("Orochimaru");
        Teacher[] teachers = {teacher1, teacher2, teacher3};
        School school1 = new School("Konoha", teachers);

        school1.print();

    }
}
