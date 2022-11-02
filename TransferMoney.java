package Buoi1;

import java.util.Scanner;

public class TransferMoney {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap VND");
        int VND=scanner.nextInt();
        int USD=VND/25000;
        System.out.println(VND+" VND doi sang do la duoc "+USD +" USD");
    }
}
