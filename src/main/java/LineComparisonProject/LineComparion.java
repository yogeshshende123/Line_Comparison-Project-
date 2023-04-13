package LineComparisonProject;

import java.util.Scanner;

public class LineComparion {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program On Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point x1 :");
         int x1 = sc.nextInt();
        System.out.println("Enter the point x2 :");
            int x2 = sc.nextInt();
        System.out.println("Enter the point y1 :");
            int y1 = sc.nextInt();
        System.out.println("Enter the point y2 :");
            int y2 = sc.nextInt();
        // UC1_calculate the lenght of line (x,y) in coordinate cartesian system.
        double line1 = ((x2-x1)^2+(y2-y1)^2);
        System.out.println("Lenght of line1 is :" +Math.sqrt(line1));

    }
}