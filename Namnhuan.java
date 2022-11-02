package Buoi1;

import java.util.Scanner;

public class Namnhuan {
    public static void main(String[] args) {
        System.out.println("Nhap vao nam");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " la nam nhuan");
                } else {
                    System.out.println(year + " khong la nam nhuan");
                }
            } else {
                System.out.println(year + " la nam nhuan");
            }
        } else {
            System.out.println(year + " khong la nam nhuan");
        }
    }
}
