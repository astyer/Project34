package com.company;

public class Main {

    public static void main(String[] args) {

        int a [][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
        int b [][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};

        int prod[][] = MatrixMult.mult(a, b);
        for(int i = 0; i < prod.length; i++)
        {
            for(int x = 0; x < prod[0].length; x++)
            {
                System.out.println(prod[i][x]);
            }
        }

    }
}
