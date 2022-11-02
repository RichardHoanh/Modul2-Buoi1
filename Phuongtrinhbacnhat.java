package Buoi1;

import java.util.Scanner;

public class Phuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Cho phuong trinh 'a*x + b = c', Nhap cac he so: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Nghiem x =" + answer);
        } else {
            if (b == c) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        }
    }
}
