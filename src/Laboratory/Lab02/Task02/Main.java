package Laboratory.Lab02.Task02;

public class Main {
    public static void main(String[] args) {
        Car bmwBlack = new Car("BMW", "M3", Color.BLACK, 300000, 150, true);
        Car mercedesWhite = new Car("Mercedes", "S-Class", Color.WHITE, 600000, 170, true);

        System.out.println(bmwBlack.toString());
        System.out.println("\n");
        System.out.println(mercedesWhite.toString());
    }
}
