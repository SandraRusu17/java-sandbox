package org.hackerrank.string;


import java.util.Scanner;

public class JavaString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        System.out.println(string1.length() + string2.length());

        int result = string1.compareTo(string2);
        if (result < 0) {
            System.out.println("No");
        } else if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("They are equal");
        }

        String cap1 = string1.substring(0, 1).toUpperCase() + string1.substring(1);
        String cap2 = string2.substring(0, 1).toUpperCase() + string2.substring(1);
        System.out.println(cap1 + " " + cap2);

    }
}
