import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Enter:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " +name);

//        2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

        String str = "123";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nTill reverse: " + str);
        System.out.println("After reverse: " + reverse);



//        3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
            int[] a = {1, 2, 3, 4, 5};
            for (int b=0; b<a.length; b++) {
            System.out.println(a[b]);}
            for (int b=0; b<a.length; b++){
            System.out.print(a[b]);}
            System.out.println();



//        4. Ввести пароль из командной строки и сравнить его со строкой-образцом

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Password: ");
        String password1 = scanner.next();
        String password2 = "qwerty";
        if (password1.equals(password2))
            System.out.println("Correct password");
        else System.out.println("Wrong password");

//        5. Ввести целые числа как аргументы командной строки,
//        подсчитать их суммы (произведения) и вывести результат на консоль.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < size; i++) {
            sum +=array[i];
            mul *=array[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + mul);

//        6.Ввести с консоли n целых чисел. На консоль вывести:
//
//        6.1. Четные и нечетные числа.
        System.out.println("Enter array length: ");
        int size1 = input.nextInt();
        int array1[] = new int[size1];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("Odd numbers: ");
            for (int i = 0; i < size1; i++) {
                if (array1[i] % 2 != 0)
                    System.out.print(array1[i] + " ");
            }
        System.out.println();
        System.out.print("Even numbers:  ");
            for (int i = 0; i < size1; i++){
                if (array1[i] % 2 == 0)
                    System.out.print(array1[i] + " " );
        }
        System.out.println();


            //6.2 Минимальное число
        {
        int min = array1[0];
        for (int i = 0; i < size1; i++) {
            if (min > array1[i])
                min = array1[i];
        }
        System.out.println("Min number:" + min);    }

        // 6.2 Максимальное число
        {
            int max = array1[0];
            for (int i = 0; i < size1; i++) {
                if (max < array1[i])
                    max = array1[i];
            }
            System.out.println("Max number:" + max);    }

        // 6.3. Числа, которые делятся на 3 или на 9

        System.out.print("Characters divided by 3 or by 9: ");
        for (int i = 0; i < size1; i++) {
            if ((array1[i] % 3 == 0) || (array1[i] % 9 == 0))
                System.out.print( array1[i] + " ");
        }
        System.out.println();

        //6.4. Числа, которые делятся на 5 и на 7

        System.out.print("Characters divided by 5 and by 7: ");
            for (int i = 0; i < size1; i++) {
            if ((array1[i] % 5 == 0) && (array1[i] % 7 == 0))
                System.out.print(array1[i] + " ");
            }
        System.out.println();

        //6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр
        int x = 0, y = 0, z = 0;
        System.out.print("3-digits character in decimal notation which has no repeat: ");
        for (int i = 0; i < size1; i++)
            if ((array1[i] > 99) && (array1[i] < 1000)) {
                x = array1[i] / 10 / 10;
                y = array1[i] / 10 % 10;
                z = array1[i] % 100 % 10;
                if (x != y && x != z && y != x && y != z && z != x && z != y)

                    System.out.print(array1[i] + " ");
            }
        System.out.println();

        // 6.6. «Счастливые» числа
        int a1 = 0, b1 = 0;
        System.out.print("Lucky numbers: ");
        for (int i = 0; i < size1; i++)
            if ((array1[i] > 99999) && (array1[i] < 1000000)) {

                a1 = array1[i] / 1000;
                b1 = array1[i] % 1000;

                int sum0 = 0;
                int sum1 = 0;
                while (a1 != 0) {
                    sum0 = sum0 + a1 % 10;
                    a1 = a1 / 10;
                }

                while (b1 != 0) {
                    sum1 = sum1 + b1 % 10;
                    b1 = b1 / 10;
                }

                if (sum0 == sum1)
                    System.out.print(array1[i] + " ");
            }
                System.out.println();

            //    6.7. Элементы, которые равны полусумме соседних элементов

        System.out.print("Boundary elements sum is equal to the middle element: ");
        for (int i = 0; i < size1 - 2; i++)
            if (((array1[i]) + (array1[i + 2])) / 2 == array1[i + 1])
                System.out.print(array1[i] + 1 + " ");

            }}
            



