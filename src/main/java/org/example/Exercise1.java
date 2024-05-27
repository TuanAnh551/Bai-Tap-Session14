package org.example;

import org.example.QuadraticEquationSolver;

public class Exercise1 {
    public static void main(String[] args) {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        solver.inputCoefficients();
        solver.solve();
    }
}
