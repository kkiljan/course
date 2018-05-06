package pl.kkiljan.lesson02;

/*
 W ramach ćwiczenia utwórz nowy projekt, w nim utwórz 2 różne pakiety. W pakietach utwórz klasy odpowiadające kilku rodzajom zwierząt wraz z kilkoma atrybutami.
 */

public class cheetah {

    private double speed;
    private double weight;

    public cheetah() {
    }

    public cheetah(double speed, double weight) {
        this.speed = speed;
        this.weight = weight;

    }

    double getSpeed() {
        return speed;

    }

    double getWeight() {
        return weight;
    }

}
