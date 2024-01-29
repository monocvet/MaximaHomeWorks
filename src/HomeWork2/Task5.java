package HomeWork2;

public class Task5 {
    /**
     * 5) (Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
     * Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
     * Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
     */
    public static void main(String[] args) {
        int monthNumber = 11;
        String season;
        switch (monthNumber) {
            case 12, 1, 2 -> season = "Сезон: Зима";
            case 3, 4, 5 -> season = "Сезон: Весна";
            case 6, 7, 8 -> season = "Сезон: Лето";
            case 9, 10, 11 -> season = "Сезон: Осень";
            default -> season = "Такого месяца не существует!";
        }
        System.out.println(season);
    }
}
