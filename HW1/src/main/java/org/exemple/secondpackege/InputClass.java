package org.exemple.secondpackege;
/* 
@autor Stanchu Vladislav
*/

import java.util.Scanner;

public class InputClass {
    public static String hello() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Впишите свое имя: ");
        String name = scan.nextLine();
        scan.close();
        return name;

    }
}
