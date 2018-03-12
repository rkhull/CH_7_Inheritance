public class Toucan extends Animal {

    private double lengthOfBeak;

    public Toucan(String sound, boolean isColdBlooded, boolean canFly, int legs, int eyes, double lengthOfBeak) {
        super(sound, isColdBlooded, canFly, legs, eyes);

        this.lengthOfBeak = lengthOfBeak;
    }

    public Toucan(){
        super();

        this.lengthOfBeak = 0.0;
    }

    public double getLengthOfBeak() {
        return lengthOfBeak;
    }

    public void setLengthOfBeak(double lengthOfBeak) {
        this.lengthOfBeak = lengthOfBeak;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nBeak length: " + lengthOfBeak + "cm";
    }
}
