package pl.kkiljan.lesson25;

import java.util.function.Supplier;

public class Test3 {

    public static void main(String[] args) {

        ConstructorParameters<Human> parameterSupplier = Human::new;
        Human human = parameterSupplier.get(15, "Edek");
        System.out.println(human.getAge() + " " + human.getName());


    }


}

interface ConstructorParameters<T> {

    T get(int age, String name);


}
