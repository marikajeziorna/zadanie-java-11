public class TestPointLocation {

    public void printPointLocation(int x, int y){
        if(x > 0 && y > 0){
            System.out.println("Zone I");
        }
        else if (x < 0 && y > 0){
            System.out.println("Zone II");
        }
        else if (x < 0 && y < 0){
            System.out.println("Zone III");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Zone IV");
        }
        else {
            System.out.println("Out of zone");
        }
    }
}
