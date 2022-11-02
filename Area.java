package Buoi1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);//Khai bao doi tuong Scanner
        System.out.println("Nhap chieu rong:");
        width = scanner.nextFloat();
        System.out.println("Nhap chieu cao:");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Dien tich la: " + area);


    }
}
