package HomeWork2;

public class Task6 {
    /**
     * 6) Выведите в консоль все четные числа от 0 до 17 с помощью цикла.
     * (использовать в теле цикла вложенное условие if с проверкой, что остаток от деления на 2 равен нулю)
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
