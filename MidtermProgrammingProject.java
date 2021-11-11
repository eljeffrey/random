import java.lang.Math;
import java.lang.Object;
public class MidtermProgrammingProject
{


    public static void generalQuadraticFormula(double a, double b, double c)
    {
        //ax^2 + bx +c can be rewritten as x = -b plus/minus squareroot of b^2-4ac over 2a
        double root1 = 0;
        double root2 = 0;

        double formula = Math.pow(b,2) - (4*a*c);
        double squareRoot = (Math.sqrt((-1 * formula))/(2*a));

        if(formula < 0)
        {
            String firstRoot = (-b/(2 * a)) + " + " + String.format("%.5f", squareRoot) + "i";
            String secondRoot = (-b/(2 * a)) + " - " + String.format("%.5f", squareRoot) + "i";
            System.out.println("First Root is: " + firstRoot);
            System.out.println("Second Root is: " + secondRoot);
        }
        else
        {
            root1 = ((-b + Math.sqrt(formula))/(2*a));
            root2 = ((-b - Math.sqrt(formula))/(2*a));
            String firstRoot = String.format("%.5f", root1);
            String secondRoot = String.format("%.5f", root2);
            System.out.println("First Root is: " + firstRoot);
            System.out.println("Second Root is: " + secondRoot);
        }
        System.out.println("");
    }

    public static void alteredQuadraticFormula(double a, double b, double c)
    {
        //we now alternate the program to have x equal 2c over the quadratic formula instead
        double root1 = 0;
        double root2 = 0;

        double formula = Math.pow(b,2) - (4*a*c);
        double squareRoot = (Math.sqrt((-1 * formula))/(2*a));

        if(formula < 0)
        {
            String firstRoot = ((2*c)/-b) + " + " + String.format("%.5f", squareRoot) + "i";
            String secondRoot = ((2*c)/-b) + " - " + String.format("%.5f", squareRoot) + "i";
            System.out.println("First Root is: " + firstRoot);
            System.out.println("Second Root is: " + secondRoot);
        }
        else
        {
            root1 = ((2*c)/-b) + Math.sqrt(formula);
            root2 = ((2*c)/-b) - Math.sqrt(formula);
            String firstRoot = String.format("%.5f", root1);
            String secondRoot = String.format("%.5f", root2);
            System.out.println("First Root is: " + firstRoot);
            System.out.println("Second Root is: " + secondRoot);
        }
        System.out.println("");
    }
    public static void thirdQuadraticFormula(double a, double b, double c)
    {
        //we now alternate the second root to use root1's calculations for the result.
        double root1 = 0;
        double root2 = 0;

        double formula = Math.pow(b,2) - (4*a*c);
        double squareRoot = (Math.sqrt((-1 * formula))/(2*a));

        if(formula < 0)
        {
            String firstRoot = ((2*c)/-b) + " + " + String.format("%.5f", squareRoot) + "i";
            String secondRoot = c/(a*root1) + " - " + String.format("%.5f", squareRoot) + "i";
            System.out.println("First Root is: " + firstRoot);
            System.out.println("Second Root is: " + secondRoot);
        }
        else
        {
            root1 = ((2*c)/-b) + Math.sqrt(formula);
            root2 = c/(a*root1) - Math.sqrt(formula);
            String firstRoot = String.format("%.5f", root1);
            String secondRoot = String.format("%.5f", root2);
            System.out.println("First Root is: " + firstRoot);
            System.out.println("Second Root is: " + secondRoot);
        }
        System.out.println("");
    }


    public static void main(String[] args)
    {
        System.out.println("First Method: \n");
        generalQuadraticFormula(0,0,0);
        generalQuadraticFormula(0,5,6);
        generalQuadraticFormula(1,6,9);
        generalQuadraticFormula(1,1,1);
        generalQuadraticFormula(600,60000000000L,0.0000000001);
        generalQuadraticFormula(1,1000.001,1);
        generalQuadraticFormula(0.00001,2,1);
        System.out.println("Second Method: \n");
        alteredQuadraticFormula(0,0,0);
        alteredQuadraticFormula(0,5,6);
        alteredQuadraticFormula(1,6,9);
        alteredQuadraticFormula(1,1,1);
        alteredQuadraticFormula(600,60000000000L,0.0000000001);
        alteredQuadraticFormula(1,1000.001,1);
        alteredQuadraticFormula(0.00001,2,1);
        System.out.println("Third Method: \n");
        thirdQuadraticFormula(0,0,0);
        thirdQuadraticFormula(0,5,6);
        thirdQuadraticFormula(1,6,9);
        thirdQuadraticFormula(1,1,1);
        thirdQuadraticFormula(600,60000000000L,0.0000000001);
        thirdQuadraticFormula(1,1000.001,1);
        thirdQuadraticFormula(0.00001,2,1);
    }
}
