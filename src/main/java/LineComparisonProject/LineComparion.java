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
        //UC2_calculate lenght of line2 and check line1 and line2 are equal or not.
        System.out.println("Enter the point x3 :");
            int x3 = sc.nextInt();
        System.out.println("Enter the point x4 :");
            int x4 = sc.nextInt();
        System.out.println("Enter the point y3 :");
            int y3 = sc.nextInt();
        System.out.println("Enter the point y4 :");
            int y4 = sc.nextInt();
        //calculate lenght of line2.
        double line2 = ((x4-x3)^2+(y4-y3)^2);
        System.out.println("lenght of line2 is :" +Math.sqrt(line2));
        //check lenght of two line are equal or not.
        if ( line1 == line2 )
            System.out.println("lenght of line1 and line2 are equal");
        else
            System.out.println("lenght of line1 and line2 are not equal");
        //UC3_Compare lenght of two line.
        if ( line1 == line2 )
            System.out.println("lenght of two line are equal");
        else if ( line1 < line2)
            System.out.println("lenght of line1 is less than line2");
        else
            System.out.println("lenght of line1 is greater than line2");
    }
}