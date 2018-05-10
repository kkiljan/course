package pl.kkiljan.lesson21.tdd;


import java.util.LinkedList;
import java.util.List;

public class Subject {


    private String name;
    private List<Double> grades = new LinkedList<>();

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrades(double grade) {
        grades.add(grade);

    }

    public Double countTheAverage() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / (grades.size());

    }

}
