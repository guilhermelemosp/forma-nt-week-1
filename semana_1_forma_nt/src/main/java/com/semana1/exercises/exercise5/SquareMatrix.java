package com.semana1.exercises.exercise5;

public class SquareMatrix {
    private int[][] matrix;

    public int[][] getIdentityMatrix(int n) {
        // Cria a estrutura
        matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.print("["); //abre o colchete
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]); // printa o elemento
                if(j < matrix[i].length - 1) { // verifica se estamos no ultimo elemento
                    System.out.print(", "); // se não estiver no ultimo elemento, printa a virgula 
                }
            }
            System.out.println("]"); // se estiver no último elemento, fecha o colchete e pula a linha
        }
    }
}