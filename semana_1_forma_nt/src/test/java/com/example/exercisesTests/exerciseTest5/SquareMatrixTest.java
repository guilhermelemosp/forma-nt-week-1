package com.example.exercisesTests.exerciseTest5;

import com.semana1.exercises.exercise5.SquareMatrix;

public class SquareMatrixTest {
    public static void main(String[] args) {
        SquareMatrix squareMatrix = new SquareMatrix();
        int[][] matrix = squareMatrix.getIdentityMatrix(10);
        squareMatrix.printMatrix(matrix);
    }
}