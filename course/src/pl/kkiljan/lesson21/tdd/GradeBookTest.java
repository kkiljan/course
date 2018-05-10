package pl.kkiljan.lesson21.tdd;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {

    private static final String SUBJECT = "historia";
    private static final String OTHER_SUBJECT = "chemia";

    private GradeBook gradeBookWithSubject;

    @BeforeEach
    public void setUp() {
        gradeBookWithSubject = new GradeBook();
        gradeBookWithSubject.addSubject(SUBJECT);

    }

    @Test
    public void shouldBeAbleToCreateGradeBook() {
        GradeBook gradeBook = new GradeBook();
        Assertions.assertNotNull(gradeBook);

    }

    @Test
    public void shouldntAllowToAddSubjectAlreadyExists() {
        IllegalStateException exception = Assertions.assertThrows(IllegalStateException.class, () -> gradeBookWithSubject.addSubject(SUBJECT));

    }

    @Test
    public void shouldBeAbleToAddNote() {

        gradeBookWithSubject.addGrade(SUBJECT, 4.5);

    }

    @Test
    public void shouldComputeGlobalAverageNote() {
        gradeBookWithSubject.addSubject(OTHER_SUBJECT);
        gradeBookWithSubject.addGrade(SUBJECT, 3);
        gradeBookWithSubject.addGrade(SUBJECT, 5);
        gradeBookWithSubject.addGrade(OTHER_SUBJECT, 2);
        gradeBookWithSubject.addGrade(OTHER_SUBJECT, 4);

        Assertions.assertEquals(3.5, gradeBookWithSubject.getAverageGrade(), 0.001);

    }

}
