package com.company;


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if(reverse(S)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }

    public static boolean reverse(String string) {
        return string.equals(new StringBuffer(string).reverse().toString());
    }
}

