package pl.kkiljan.lesson18;
/*
Napisz klasę Human, która będzie reprezentowała człowieka. Niech klasa ta posiada atrybuty takie jak imię, wiek, kolor oczu, kolor włosów. Niech te dwa ostatnie atrybuty będą typami wyliczeniowymi. Stwórz instancję takiej klasy.
 */

public class Human {
    private String name;
    private int age;
    private EyeColor eyeColor;
    private HairColor hairColor;

    public Human(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", age=" + age + ", eyeColor=" + eyeColor + ", hairColor=" + hairColor + '}';
    }

    public static void main(String[] args) {
        Human human = new Human("Konrad", 26, EyeColor.GREEN, HairColor.BROWN);
        System.out.println(human);


    }

}
