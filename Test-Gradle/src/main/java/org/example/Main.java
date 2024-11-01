package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
       boolean samePlace = judgeCircle("UU");
       System.out.println(samePlace);
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U') {
                y++;
            }else if(moves.charAt(i) == 'D'){
                y--;
            }else if(moves.charAt(i) == 'R'){
                x++;
            }else if(moves.charAt(i) == 'L'){
                x--;
            }

        }
        if (x == 0 && y == 0){
            return true;
        }
        return false;
    }
}