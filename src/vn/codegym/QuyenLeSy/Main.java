package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size list: ");
        int size = scanner.nextInt();

        int[] list = new int[size];

        System.out.println("Enter value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print("List before sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("\nBegin sort processing...");
        insertSort(list);

        System.out.print("List after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k] > current; k--) {
                System.out.println("Swap " + list[k + 1] + " with " + list[k]);
                list[k + 1] = list[k];
            }
            list[k + 1] = current;

            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println("\n");
        }
    }
}