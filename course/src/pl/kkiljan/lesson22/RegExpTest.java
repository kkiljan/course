package pl.kkiljan.lesson22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class RegExpTest {

    @Test
    public void shouldValidateFloatingpointNumber() {
        Pattern pattern = Pattern.compile("-?\\d+(,\\d+)?");
        Assertions.assertTrue(pattern.matcher("123,2341515132135").matches());
        Assertions.assertTrue(pattern.matcher("-10").matches());
        Assertions.assertFalse(pattern.matcher("18-12").matches());
        Assertions.assertFalse(pattern.matcher("123,").matches());

    }


    @Test
    public void shouldValidateHouseNumber() {
        Pattern pattern = Pattern.compile("\\d+[A-Z]?\\\\\\d+[A-Z]?");
        Assertions.assertTrue(pattern.matcher("123\\2A").matches());
        Assertions.assertTrue(pattern.matcher("24B\\3").matches());
        Assertions.assertTrue(pattern.matcher("12\\5").matches());
        Assertions.assertFalse(pattern.matcher("abc\\cba").matches());


    }

    @Test
    public void shouldValidateCityName() {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+([ -][A-Z][a-z]+)?");
        Assertions.assertTrue(pattern.matcher("Wroclaw").matches());
        Assertions.assertTrue(pattern.matcher("Zielona Gora").matches());
        Assertions.assertTrue(pattern.matcher("Bielsko-Biala").matches());
        Assertions.assertFalse(pattern.matcher("Ptysiow123").matches());


    }

}
