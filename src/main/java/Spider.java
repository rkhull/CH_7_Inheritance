public class Spider extends Animal{

    private String typeOfSpider;

    public Spider(String sound, boolean isColdBlooded, boolean canFly, int legs, int eyes, String typeOfSpider) {
        super(sound, isColdBlooded, canFly, legs, eyes);

        this.typeOfSpider = typeOfSpider;
    }

    public Spider(){
        super();

        this.typeOfSpider = "No type was specified";
    }

    public String getTypeOfSpider(){
        return typeOfSpider;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nType of Spider: " + typeOfSpider;
    }


}
