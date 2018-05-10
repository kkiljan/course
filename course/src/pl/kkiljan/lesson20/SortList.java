package pl.kkiljan.lesson20;


import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List list = PopulationOfList.populationOfList();

        System.out.println(list + " lista przed sortowaniem");

        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return ((String) o1).length() - ((String) o2).length();
            }
        });


        System.out.println(list + " lista po sortowaniu");


    }


}
