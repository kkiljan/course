package pl.kkiljan.lesson21.tdd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeBook {

    private Map<String, Subject> subjects = new HashMap<>();


    public void addSubject(String subject) {

        if (subjects.containsKey(subject)) {
            throw new IllegalStateException(String.format("Przedmiot %s juz istnieje", subject));
        }
        subjects.put(subject, new Subject(subject));

    }

    public Subject getSubject(String subject) {
        if (subjects.containsKey(subject)) {
            return subjects.get(subject);
        }
        throw new IllegalArgumentException(String.format("Przedmiot %s nie istnieje", subject));

    }

    public void addGrade(String subjectName, double grade) {
        Subject subject = getSubject(subjectName);
        subject.addGrades(grade);
    }

    public double getAverageGrade() {
        double gradeSum = 0;
        for (Subject subject : subjects.values()) {
            gradeSum += subject.countTheAverage();
        }
        return gradeSum / subjects.size();


    }


}
