public class BottlesOfBeer {
    public static void main(String[] args) {
        int x = 99;
        String beer_bottles = " bottles of beer";
        String beer_bottles_wall = beer_bottles + " on the wall";

        while (x > 0) {
            System.out.println(x + beer_bottles_wall);
            System.out.println(x + beer_bottles);
            System.out.println("If one of the bottles just happened to fall");
            x--;
        }

        System.out.println("No more" + beer_bottles_wall);
        System.out.println("No more" + beer_bottles);
    }
}
