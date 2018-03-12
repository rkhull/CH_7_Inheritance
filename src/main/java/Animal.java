public class Animal {

    private String sound;
    private boolean isColdBlooded;
    private boolean canFly;
    private int legs;
    private int eyes;

    public Animal(String sound, boolean isColdBlooded, boolean canFly, int legs, int eyes){
        this.sound = sound;

        this.isColdBlooded = isColdBlooded;
        this.canFly = canFly;
        this.legs = legs;
        this.eyes = eyes;
    }

    public Animal(){

        this.sound = "No sound";
        this.isColdBlooded = false;
        this.canFly = false;
        this.legs = 0;
        this.eyes = 0;

    }

    public String getSound() {
        return sound;
    }

    public boolean isColdBlooded() {
        return isColdBlooded;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setColdBlooded(boolean coldBlooded) {
        this.isColdBlooded = coldBlooded;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "\n\nSound: " + sound +
                "\nIs it cold blooded: " + isColdBlooded +
                "\nCan it fly: " + this.canFly +
                "\nHow many legs: " + this.legs +
                "\nHow many eyes: " + this.eyes;
    }
}
