package com.company;

public class MatrixMult {

    public static int [][] mult(int x [][], int y [][])
    {
        int c [][] = new int[x.length][y[0].length];
        int sum = 0;
        for(int i = 0; i < x.length; i++)
        {
            for(int d = 0; d < x[0].length; i++)
            {
                for(int f = 0; f < y.length; f++)
                {
                    sum = sum + (x[i][d] * y[0][f]);
                }
            }
        }
        return c;
    }


}

