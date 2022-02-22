package academy.devdojo.maratonajava.javacore.association.domain;

public class School {

    private String name;
    private Teacher[] teachers;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public void print() {
        System.out.println("======== SCHOOL ========");
        System.out.println(this.name.toUpperCase());
        System.out.println("========================");
        if (teachers == null) {return;}
        for (Teacher teacher: teachers) {
            System.out.println("Teacher: "+teacher.getName());
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
