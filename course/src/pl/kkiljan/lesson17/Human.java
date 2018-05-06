package pl.kkiljan.lesson17;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public class Human implements Serializable {

    private String name;
    private transient int age;

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        age = (Calendar.getInstance().get(Calendar.YEAR) - stream.readInt());
        name = stream.readUTF();

    }

    private void writeObject(ObjectOutputStream stream) throws IOException {

        stream.writeInt(dateOfBorn(age));
        stream.writeUTF(name);


    }

    private int dateOfBorn(int age) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return (year - age);

    }

}




