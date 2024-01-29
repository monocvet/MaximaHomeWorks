package HomeWork2;

public class Task2 {
    /**
     * На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
     * На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
     * Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
     */
    public static void main(String[] args) {
        int paintWhiteForOneClass = 2;
        int paintBrownForOneClass = 4;
        double countClasses = (double) 120 / (paintWhiteForOneClass + paintBrownForOneClass);
        double paintWhiteFull = paintWhiteForOneClass * countClasses;
        double paintBrownFull = paintBrownForOneClass * countClasses;
        System.out.println("В школе, где " + countClasses + " классов, нужно " + paintWhiteFull +
                " банок белой краски и " + paintBrownFull + " банок коричневой краски.");
    }
}
