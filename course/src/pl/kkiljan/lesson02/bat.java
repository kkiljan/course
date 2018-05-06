package pl.kkiljan.lesson02;

/*
 W ramach ćwiczenia utwórz nowy projekt, w nim utwórz 2 różne pakiety. W pakietach utwórz klasy odpowiadające kilku rodzajom zwierząt wraz z kilkoma atrybutami.
 */

public class bat {
    private float soundFrequency;
    private float weight;

    public bat() {
    }

    public bat(float soundFrequency, float weight) {
        this.soundFrequency = soundFrequency;
        this.weight = weight;

    }

    public float getSoundFrequency(){
        return soundFrequency;

    }

    public float getWeight() {
        return weight;
    }
}
