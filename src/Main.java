public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю! Теперь ты совершеннолетняя свинка! :)");
        } else {
            System.out.println("Придётся подождать, пока ты совсем маленькая свинка :(");
        }

        // Задание 2
        int yearsOld = 7;
        if ( yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек закончил школу и и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 3
        int occupiedSeats = 78;
        if (occupiedSeats < 60) {
            System.out.println("Есть сидячие места");
        } else if (occupiedSeats >= 60 && occupiedSeats < 102) {
            System.out.println("Остались только стоячие места");
        } else {
            System.out.println("Мест в вагоне не осталось");
        }
    }
}