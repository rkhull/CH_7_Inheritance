public class AnimalApp {

    public static void main (String[] args){

        Animal spider = new Spider("Silence", false, false, 8, 8, "Black Widow");
        Animal lion = new Lion("Roar", false, false, 4, 2, 7);
        Animal toucan = new Toucan("Squawk", false, true, 2, 2, 63.5);
        Animal iguana = new Iguana("Silence", true, false, 4, 2, "Blue Iguana");

        System.out.print(spider.toString());
        System.out.print((lion.toString()));
        System.out.print(toucan.toString());
        System.out.print(iguana.toString());

    }

}
