public class Lion extends Animal{

    private int numberOfLionsInPride;

    public Lion(String sound, boolean isColdBlooded, boolean canFly, int legs, int eyes, int numberOfLionsInPride) {
        super(sound, isColdBlooded, canFly, legs, eyes);

        this.numberOfLionsInPride = numberOfLionsInPride;
    }

    public Lion(){
        super();

        this.numberOfLionsInPride = 0;
    }

    public int getNumberOfLionsInPride() {
        return numberOfLionsInPride;
    }

    public int setNumberOfLionsInPride(int numberOfLionsInPride){
        return numberOfLionsInPride;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nHow many lions are in the pride: " + numberOfLionsInPride;
    }
}
