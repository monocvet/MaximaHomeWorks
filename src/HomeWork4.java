public class HomeWork4 {
    public static void main(String[] args) {

//        int n = 10;           // task1
//        int sum = task1(n);
//        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);

//        int number = 8;        // task2
//        int factorialOfNumber = task2(number);
//        System.out.println("Факториал числа " + number + " равен: " + factorialOfNumber);

//        int n = 10;              // task3
//        int result = task3(n);
//        System.out.println("Число Фибоначчи с порядковым номером " + n + " равно: " + result);

//        int a = 879;                       // task4  // task5
//        Integer a2 = 7845;
//        System.out.println(boxing(a));
//        System.out.println(unBoxing(a2));
//        System.out.println(a + a2);
//
//        double d = 10.477;
//        Double d2 = 18.749;
//        System.out.println(boxing(d));
//        System.out.println(unBoxing(d2));
//        System.out.println(d + d2);
//
//        boolean bool = true;
//        Boolean bool2 = false;
//        System.out.println(boxing(bool));
//        System.out.println(unBoxing(bool2));
//        System.out.println(bool == bool2);

//        Integer boxedNUm = -255;                   // task6
//        Integer boxedNUm2 = -255;
//        System.out.println(boxedNUm == boxedNUm2);
//        System.out.println(boxedNUm.equals(boxedNUm2));

//        long startTime = System.currentTimeMillis();   // task7
//        checkTimeWithPrimitive(100_000_000);
//        long endTime = System.currentTimeMillis();
//        long duration = endTime - startTime;
//        System.out.println("Время выполнения операции с примитивами: " + duration + " миллисекунд");
//
//        long startTime2 = System.currentTimeMillis();
//        checkTimeWithWrapper(100_000_000);
//        long endTime2 = System.currentTimeMillis();
//        long duration2 = endTime2 - startTime2;
//        System.out.println("Время выполнения операции с ссылочными методами: " + duration2 + " миллисекунд");

//        Integer maxInteger = Integer.MAX_VALUE;              //task8
//        System.out.println(maxInteger + 1); // -2147483648

//        Long maxLong = Long.MAX_VALUE;
//        System.out.println(maxLong + 1); // -9223372036854775808
//
//        Integer minInteger = Integer.MIN_VALUE;
//        System.out.println(minInteger - 1); // 2147483646

//        Long minLong = Long.MIN_VALUE;
//        System.out.println(minLong - 1);  // 9223372036854775807


    }

    public static int task1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + task1(n - 1);
        }
    }

    public static int task2(int number) {
        // Напишите рукурсивный расчет факториала числа
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * task2(number - 1);
        }
    }

    public static int task3(int n) {
        //Напишите рукурсивный расчет числа Фибоначчи по его порядковому номеру
        if (n <= 1) {
            return n;
        } else {
            return task3(n - 1) + task3(n - 2);
        }
    }

    public static Integer boxing(int number) {
        Integer boxedNumber = Integer.valueOf(number);
        return boxedNumber;
    }      // Integer

    public static int unBoxing(Integer number) {
        int unBoxedNumber = number.intValue();
        return unBoxedNumber;
    }   // int

    public static Double boxing(double number) {
        Double boxedNumber = Double.valueOf(number);
        return boxedNumber;
    }    // Double

    public static double unBoxing(Double number) {
        double unBoxedNumber = number.doubleValue();
        return unBoxedNumber;
    }   // double

    public static Boolean boxing(boolean number) {
        Boolean boxedNumber = Boolean.valueOf(number);
        return boxedNumber;
    }    // Boolean

    public static boolean unBoxing(Boolean number) {
        boolean unBoxedNumber = number.booleanValue();
        return unBoxedNumber;
    }    // boolean

    public static int checkTimeWithPrimitive(int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }
        return sum;
    }

    public static Integer checkTimeWithWrapper(Integer count) {
        Integer sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }
        return sum;
    }
}


