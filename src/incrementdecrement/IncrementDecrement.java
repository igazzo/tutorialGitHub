/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementdecrement;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class IncrementDecrement {

    public static String leftPad(String originalString, int length) {
        String paddedString = originalString;

        while (paddedString.length() < length) {
            paddedString = "0" + paddedString;
        }
        return paddedString;

    }

    int length;
    int row = 0;

    public int hitungIncrement() {
        int temp = row;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan length: ");
        length = scan.nextInt();
        System.out.print("Masukkan row: ");
        row = scan.nextInt();
        int n = row;
        int lengthRow = (int) (Math.log10(n) + 1);
        if (lengthRow > length) {
            System.out.println("error, nilai row tidak boleh melebihi jumlah digit dari length");
        } else if (length > 2 && row > length) {
            for (int i = 1; i <= row; i++) {
                System.out.println((leftPad(i + "", length)));

            }
        } else {
            System.err.println("length hanya dapat ditampilkan dengan nilai minimal 3 dan maksimal 99");
        }
        return temp;
    }

    public int hitungDecrement() {
        int temp = row;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan length: ");
        length = scan.nextInt();
        System.out.print("Masukkan row: ");
        row = scan.nextInt();
        int m = row;
        int lengthRow = (int) (Math.log10(m) + 1);
        if (lengthRow > length) {
            System.out.println("error, nilai row tidak boleh melebihi jumlah digit dari length");
        } else if (length > 2 && row > length) {
            for (int i = row; i >= 1; i--) {
                System.out.println((leftPad(i + "", length)));

            }
        } else {
            System.err.println("length hanya dapat ditampilkan dengan nilai minimal 3 dan maksimal 99");
        }

        return temp;
    }

    public static void main(String[] args) {

        int length;

        int menu = 0;

        IncrementDecrement obj1 = new IncrementDecrement();

        while (menu != 3) {
            Scanner scan = new Scanner(System.in);
            System.out.println("=====Program auto increment dan decrement=====");
            System.out.println("1. Increment\n2. Decrement\n3. Exit");
            System.out.print("Masukkan inputan: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:

                    obj1.hitungIncrement();

                    break;
                case 2:

                    obj1.hitungDecrement();
                    
                    break;
                case 3:
                    break;

                default:
                    System.err.println("Masukkan hanya angka 1 untuk increment, 2 untuk decrement dan 3 untuk exit");
                    break;

            }
        }
    }
}
