package pl.kkiljan.lesson25;

import java.util.List;
import java.util.function.Consumer;

public class Test1 {

    public static void main(String[] args) {

        List <String> list = PopulationOfList.populationOfList();
        System.out.println(list);

        list.sort((a,b) -> b.length() - a.length());

        System.out.println(list);



    }


}
