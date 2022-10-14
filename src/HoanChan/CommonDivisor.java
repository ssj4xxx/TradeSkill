package HoanChan;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println("Nhap 2 so nguyen");
        Scanner input = new Scanner(System.in);
        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Uoc nguyen to lon nhat cua 2 so la: " + greatestPrimeCommonDivisor(num1, num2));
    }

    // Tim uoc chung nguyen to lon nhat
    static int greatestPrimeCommonDivisor(int number1, int number2) {
        int div = 1;
        for (int i = 2; i < min(number1, number2) + 1; i++) {
            if ((number1 % i ==0) && (number2 % i ==0) && (isPrime(i))) {
                div = i;
            }
        }
        return div;
    }

    // Check xem co phai so nguyen to hay khong
    static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i < number + 1; i++) {
            if (number % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    static int min(int number1, int number2) {
        if (number1 >= number2) {
            return number2;
        } else {
            return number1;
        }
    }
}
