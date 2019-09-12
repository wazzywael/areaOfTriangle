import java.util.*;

public class areaOfTriangle {
    public static void main (String args[]) {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double area = 0.0;
        double perimeter = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        a = s.nextDouble();
        System.out.println("");

        System.out.print("Enter a value for b: ");
        b = s.nextDouble();
        System.out.println("");


        System.out.print("Enter a value for c: ");
        c = s.nextDouble();
        System.out.println("");

        perimeter = (a + b + c) / 2;

        area = Math.sqrt((perimeter * (perimeter-a) * (perimeter-b) * (perimeter-c)));

        System.out.printf("The area of the triangle is: %.2fm²", area);
        System.out.println("");
        
    }
}