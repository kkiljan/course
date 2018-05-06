package pl.kkiljan.lesson14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        Set <String> nameSet = new HashSet<>();
       nameSet = getNameSet();

        System.out.println(nameSet.size());

    }

    private static Set getNameSet() {
        String name;
        Set nameSet = new HashSet();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Podaj imię ");
            name =sc.next();
            if(!name.equals("-")){
                nameSet.add(name);
            }


        } while (!name.equals("-"));

        return nameSet;
    }

}



