public class Iguana extends Animal{

    private String typeOfIguana;

    public Iguana(String sound, boolean isColdBlooded, boolean canFly, int legs, int eyes, String typeOfIguana) {
        super(sound, isColdBlooded, canFly, legs, eyes);

        this.typeOfIguana = typeOfIguana;
    }

    public Iguana(){
        super();

        this.typeOfIguana = "No type specified";

    }

    public String getTypeOfIguana() {
        return typeOfIguana;
    }

    public void setTypeOfIguana(String typeOfIguana) {
        this.typeOfIguana = typeOfIguana;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nType of iguana: " + typeOfIguana;
    }
}
