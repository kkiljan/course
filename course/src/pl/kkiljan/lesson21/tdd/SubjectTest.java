package pl.kkiljan.lesson21.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubjectTest {
    @Test
    public void shouldBeAbleToCreateSubject() {
        Subject subject = new Subject("historia");
        Assertions.assertNotNull(subject);
    }

    @Test
    public void shouldBeAbleToComputeAverageNote() {
        Subject subject = new Subject("historia");
        subject.addGrades(5);
        subject.addGrades(2);
        Assertions.assertEquals(3.5, subject.countTheAverage(), 0.001);

    }


}
