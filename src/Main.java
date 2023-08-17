import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        System.out.println("Двузначные числа, которые делятся на " + n + " или содержат цифру " + n + ":");

        int num = 10;
        while (num <= 99) {
            if (num % n == 0 || num % 10 == n || num / 10 == n) {
                System.out.println(num);
            }
            num++;
        }
    }
}
