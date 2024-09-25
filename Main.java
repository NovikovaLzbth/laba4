import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый множитель: ");
        int a = scanner.nextInt();

        System.out.print("Введите второй множитель: ");
        int x = scanner.nextInt();

        System.out.println("Выберите способ умножения \n(1 - сложение, 2 - побитовый сдвиг)");
        int n = scanner.nextInt();

        //выбор способа умножения
        switch (n) {
            case 1:
                System.out.println(multiply(a, x));
                break;
            case 2:
                System.out.println(multiply2(a, x));
                break;
            default:
                System.out.println("Введены неверные значения");
        }

    }

    //побитовый сдвиг
    public static int multiply(int a, int b) {
        int result = 0;

        while (b > 0) {
            // Если b нечетный, добавляем a к результату
            if ((b & 1) == 1) {
                result += a;
            }
            // Уменьшаем b вдвое (правый сдвиг)
            b >>= 1;
            // Увеличиваем a вдвое (левый сдвиг)
            a <<= 1;
        }

        return result;
    }

    //сложение
    public static int multiply2(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}