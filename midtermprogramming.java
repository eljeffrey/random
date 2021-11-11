import java.io.*;
import java.lang.Math;

import javax.sound.sampled.SourceDataLine;


public class midtermprogramming{

    static void generalRoots(double a, double b, double c) {
        double root1,root2, discriminant, imaginary;
        
        
        discriminant = (b * b ) - (4 * a * c);
        
        if (discriminant > 0){
            root1 = (-b + Math.sqrt(discriminant) / (2 * a));
            root2 = (-b - Math.sqrt(discriminant) / (2 * a));
            System.out.println("Distinct real roots:\n root 1= "+root1+"\n root 2= "+root2);
        }else if (discriminant == 0){
            root1 = root2 = -b / (2 * a);
            System.out.println("Equal real roots:\n root 1 = "+root1+"\n root 2 = "+root2);
        }else{
            root1  = (double) -b / (2 * a);
            imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("complex root:\n root 1 = "+ root1 +" + "+ imaginary +"i");
        }

        
    }
    static void alternateQuadratic(double a, double b, double c){
        double root0,root1,root2, discriminant,imaginary;

        discriminant = (b * b ) - (4 * a * c);
        imaginary = Math.sqrt(-discriminant) / (2 * a);
        root0 = ((2*c)/-b);
        if (discriminant < 0){
            
            System.out.println("roots are: "+root0+" + "+ imaginary+"i");
            System.out.println("roots are: "+root0+" - "+ imaginary+"i");
        }else{
            root1 = root0 + Math.sqrt(discriminant);
            root2 = root0 - Math.sqrt(discriminant);
            System.out.println("first root: root 1 = "+root1);
            System.out.println("second root: root 2 = "+root2);

        }

    }
    public static void main(String[] args) {
        generalRoots(0,0,0);
        generalRoots(0,5,6);
        generalRoots(1,6,9);
        generalRoots((6*Math.pow(10, 2)),(6 * Math.pow(10, 10)),(Math.pow(10, -10)));
        generalRoots(1,1000.001,1);
        generalRoots((Math.pow(10, -5)),2,1);
        System.out.println("===================================");
        alternateQuadratic(0,0,0);
        alternateQuadratic(0,5,6);
        alternateQuadratic(1,6,9);
        alternateQuadratic((6*Math.pow(10, 2)),(6 * Math.pow(10, 10)),(Math.pow(10, -10)));
        alternateQuadratic(1,1000.001,1);
        alternateQuadratic((Math.pow(10, -5)),2,1);

    }
}