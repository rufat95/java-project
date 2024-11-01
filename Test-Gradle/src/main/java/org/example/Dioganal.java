package org.example;

import java.util.Arrays;

public class Dioganal {
    public static void main(String[] args) {
        int[][] mat = {
              {1,2,3,7},
              {4,5,6,6},
              {7,8,9,4},
              {5,6,9,7}
       };

//        int[][] mat = {
//                {4,2,3,7,5},
//                {4,5,6,6,3},
//                {7,8,8,4,2},
//                {5,6,9,7,8},
//                {4,8,9,9,1}
//        };

//        int[][] mat = {
//                {4,2,3},
//                {4,5,6},
//                {7,8,8},
//        };

        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int a = 0;
        int b = 0;
        int x = mat.length;
        int c = mat.length/2;
        int matCenter = 0;
        for (int i = 0; i < mat.length; i++) {
            x--;
            for (int j = i; j < mat.length-x; j++) {
                a+=mat[i][j];
                System.out.print(mat[i][j] + ", ");
            }
            for (int j = x; j < mat.length-i; j++) {
                b+=mat[i][j];
                System.out.print(mat[i][j] + ", ");
            }
            System.out.println();
        }
        matCenter = mat[c][c];
        System.out.println();
        System.out.println(matCenter);
        if (mat.length % 2 == 1){
           return  (b + a)-matCenter;
        }
        else {
            return a+b;
        }
    }
}
