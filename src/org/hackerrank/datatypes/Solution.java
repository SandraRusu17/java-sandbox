package org.hackerrank.datatypes;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                processNumber(x);
            } catch (Exception e) {
                System.out.println(sc.next() + "can’t be fitted anywhere.");
            }
        }
    }

    private static void processNumber(long x) {
        if (fitsInByte(x)) System.out.println("* byte");
        if (fitsInShort(x)) System.out.println("* short");
        if (fitsInInteger(x)) System.out.println("* int");
        if (fitsInLong(x)) System.out.println("* long");
    }

    private static boolean fitsInLong(long x) {
        return x >= Long.MIN_VALUE && x <= Long.MAX_VALUE;
    }

    private static boolean fitsInInteger(long x) {
        return x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE;
    }

    private static boolean fitsInShort(long x) {
        return x >= Short.MIN_VALUE && x <= Short.MAX_VALUE;
    }

    private static boolean fitsInByte(long x) {
        return x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE;
    }
}