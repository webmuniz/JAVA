package academy.devdojo.maratonajava.javacore.serialization.test;

import academy.devdojo.maratonajava.javacore.serialization.domain.Student;
import academy.devdojo.maratonajava.javacore.serialization.domain.Team;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student1 = new Student(10, "Elvis", "abc123");
        Team team = new Team("Maratona Java!");
        student1.setTeam(team);
        serialize(student1);
        unserialize();
    }

    private static void serialize(Student student){
        Path path = Paths.get("folder/student.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(student);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void unserialize(){
        Path path = Paths.get("folder/student.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Student student1 = (Student) ois.readObject();
            System.out.println(student1);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
