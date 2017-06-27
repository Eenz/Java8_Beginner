package by.blinov.chapter_3.examples;

import by.blinov.chapter_3.examples.Matrix;
import by.blinov.chapter_3.examples.MatrixException;
import by.blinov.chapter_3.examples.MatrixCreator;
import by.blinov.chapter_3.examples.Multiplicator;

public class RunnerMatrix {
    public static void main(String[] args) {
        try{
            Matrix p = new Matrix(2,3);
            MatrixCreator.fillRandomized(p,2,8);
            System.out.println("Matrix first is: "+p);
            Matrix q = new Matrix(3,4);
            MatrixCreator.fillRandomized(q,2,7);
            System.out.println("Matrix second is :" + q);
            Multiplicator mult = new Multiplicator();
            System.out.println("Matrices product is " +mult.multiply(p,q));
        }catch (MatrixException ex){
            System.err.println("ERROR of creating matrix " + ex);
        }
    }
}
