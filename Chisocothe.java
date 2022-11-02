package Buoi1;

import java.util.Scanner;

public class Chisocothe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao can nang");
        double weight = scanner.nextDouble();
        System.out.println("Nhap vao chieu cao");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("Suy dinh duong");
        } else if (BMI < 25) {
            System.out.println("Binh thuong");
        } else if (BMI < 30) {
            System.out.println("Thua can");
        } else {
            System.out.println("Beo phi");
        }
    }
}
