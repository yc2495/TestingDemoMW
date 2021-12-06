import java.awt.*;
import java.util.Scanner;

public class BasicGeom {
    public static double calcDistance(Point p1, Point p2){
        double distance = 0.0;
        var xchange = p1.x -p2.x;
        var ychange = p1.y -p2.y;
        var intermediate = xchange*xchange + ychange*ychange;
        distance = Math.sqrt(intermediate);
        return distance;
    }

    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        System.out.println("what is the x location of the first point");
        var p1 = new Point();
        p1.x = inputReader.nextInt();
        System.out.println("what is the y location of the second point");
        var p2 = new Point();
        p2.x = inputReader.nextInt();
        System.out.println("What is the y location of the second point");
        p2.y = inputReader.nextInt();
        System.out.println("p1 is: "+p1+ " and p2 is: "+p2);
        System.out.println("The distance between your points is "+calcDistance(p1, p2));


    }
}
