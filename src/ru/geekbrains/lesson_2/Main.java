package ru.geekbrains.lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("������� ��������");
        System.out.println("1. ��������");
        System.out.println("2. ���������");
        System.out.println("3. ���������");
        System.out.println("4. �������");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("������� ������ �����");
        int a = scanner.nextInt();
        System.out.println("������� ������ �����");
        int b = scanner.nextInt();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("��������� - " + result);
    }
}