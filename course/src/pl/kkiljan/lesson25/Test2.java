package pl.kkiljan.lesson25;

import java.util.function.Supplier;

public class Test2 {

    public static void main(String[] args) {

        Supplier <Object> objectSupplier = Object::new;

        Object objectInstance = objectSupplier.get();
        System.out.println(objectInstance);


    }
}
