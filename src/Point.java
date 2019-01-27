import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the x: ");
        int x = scanner.nextInt();
        System.out.println("Give the y: ");
        int y = scanner.nextInt();

        TestPointLocation testPointLocation = new TestPointLocation();
        testPointLocation.printPointLocation(x, y);
    }
}
