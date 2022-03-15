package EqualitiesInequalities;

import static Libraries.Methods.*;

public class SolvingQuadraticFunctions {
    public static void main(String[] args) {
        System.out.println("ax² + bx + c = 0");
        System.out.print("a = ");
        double a = Integer.parseInt(readLine());
        System.out.print("b = ");
        double b = Integer.parseInt(readLine());
        System.out.print("c = ");
        double c = Integer.parseInt(readLine());

        double discriminant = b*b-4*a*c;
        if (discriminant >= 0) {
            double x1 = (-b-Math.sqrt(discriminant))/(2*a);
            if (x1 == 0)
                x1 = Math.abs(x1);
            double x2 = (-b+Math.sqrt(discriminant))/(2*a);
            if (x2 == 0)
                x2 = Math.abs(x2);
            if (x1 == x2) {
                System.out.println("x = " + x1);
            } else {
                System.out.println("x₁ = " + x1);
                System.out.println("x₂ = " + x2);
            }
        } else {
            System.out.println("No solutions");
        }
    }
}
