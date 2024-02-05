import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //   task4();
        //task3();
        //  task2();
        //task1();
        // doFirstHomeWork();
    }

    public static void doFirstHomeWork() {
        byte numberByte = 15;
        short numberShort = 196;
        int numberInt = 789;
        long numberLong = 1872L;
        float numberFloat = 124.587f;
        double numberDouble = 9634.1258;
        char symbolChar = 'b';
        boolean active = true;
        System.out.println("Значение переменной numberByte с типом byte равно: " + numberByte);
        System.out.println("Значение переменной numberShort с типом short равно: " + numberShort);
        System.out.println("Значение переменной numberInt с типом int равно: " + numberInt);
        System.out.println("Значение переменной numberLong с типом Long равно: " + numberLong);
        System.out.println("Значение переменной numberFloat с типом float равно: " + numberFloat);
        System.out.println("Значение переменной numberDouble с типом double равно: " + numberDouble);
        System.out.println("Значение переменной symbolChar с типом char равно: " + symbolChar);
        System.out.println("Значение переменной active с типом boolean равно: " + active);
    }

    public static void task1() {
        //объявить пустой массив типа int[] с заданным размером,
        // в цикле заполнить его случайными значениями (с помощью Random),
        // далее вывести весь массив в консоль с помощью Arrays.toString()
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task2() {
        // объявить массив со значениями от 1 до 10, вывести нечетные значения (остаток от деления на 2 НЕ равен нулю) в консоль
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void task3() {
        //объявить массив double[] с дробными значениями, в цикле просуммировать все значения, и ВЕРНУТЬ из метода результат
        double[] array = new double[10];
        Random random = new Random();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма всех чисел массива: " + sum);

    }

    static void task4() {
        String[] str = {"Привет ", "мой ", "друг."};
        System.out.println(concat(str));
    }

    static String concat(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : stringArray) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
}
