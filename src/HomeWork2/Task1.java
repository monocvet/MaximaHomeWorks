package HomeWork2;

public class Task1 {
    /**
     * Объявите переменные типа int, byte, short, long, float, double, char, boolean.
     * Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
     * Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
     */
    public static void main(String[] args) {
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
}
