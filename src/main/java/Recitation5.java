import java.util.Scanner;

public class Recitation5 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        Point a = new Point(x,y);
        Point b = new Point(14,12);
        Circle circle16 = new Circle(a, 16.0);
        Circle circle40 = new Circle(b,40.0);
        circle16.intersects(circle40);
        if (circle16.intersects(circle40)){
            System.out.println("Circles intersect!");


        }else {
            System.out.println("Circles do not intersect!");
        }
        /*

        Create an instance of a Circle at (x,y) with radius=16.0 called circle16;
        Create another instance of a Circle at (14,12) with radius=40.0 called circle40;
        If the two circles intersect, print Circles intersect!; otherwise print Circles do not intersect!.
         */


    }
}
