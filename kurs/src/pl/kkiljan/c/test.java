package pl.kkiljan.c;

public class test {
    public static void main(String[] args) {
        String message1 = "Dziś jest słoneczna pogoda.";
        String message2 = "Temperatura w okolicach 20 stopni.";
        String message3 = "Brak chmur na niebie.";

        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
        System.out.println("Długość wszystkich powyższych zdań to "+(message1.length() + message2.length()+ message3.length()) + " znaków.");
    }
}
