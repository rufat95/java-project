package org.example;

public class Recursive {
    public static void main(String[] args) {
        recursive(0);
    }
    public static void recursive(int n){
        System.out.println("Rufat");

        if(n < 10){
            recursive(n+1);
        }
    }
}
