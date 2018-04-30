package pl.kkiljan.m;

import java.util.List;

public class Human {

    private String firstName;
    private String lastName;
    private int ID;

    public Human(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return ID;
    }


    @Override
    public boolean equals (Object obj){
        if (obj == null){
            return false;
        }
        if (obj instanceof Human){
            Human otherHuman = (Human) obj;
            return firstName.equals(otherHuman.firstName) &&
                    lastName.equals(otherHuman.lastName) &&
                    ID == otherHuman.ID;

        }
        return false;
    }

    @Override
    public int hashCode(){
        return 19 * firstName.hashCode() + 29 * lastName.hashCode() + 59 * ID;
    }


    public static void main(String[] args) {


        Human human1 = new Human("Jarek", "Kowalski", 15948);
        Human human2 = new Human("Jarek", "Kowalski", 97431);
        Human human3 = new Human("Jarek", "Kowalski", 15948);

        System.out.println("human1.equals(human2)" + (human1.equals(human2)));
        System.out.println("human1.equals(human3)" + (human1.equals(human3)));
        System.out.println("human1.equals(human1)" + (human1.equals(human1)));
        System.out.println("human2.equals(human3)" + (human2.equals(human3)));

        System.out.println("human1.hashCode()" + human1.hashCode());
        System.out.println("human2.hashCode()" + human2.hashCode());
        System.out.println("human3.hashCode()" + human3.hashCode());

        

    }


}
