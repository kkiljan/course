package pl.kkiljan.lesson02;

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
