package pl.kkiljan.lesson19;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface MyDocumentation {
    String author();
    String comment();


}