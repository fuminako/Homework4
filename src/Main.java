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
        int yearsOld = 24;
        if ( yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек закончил школу и и может отправляться в университет");
        } else if (yearsOld >= 24){
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

        // Задание 4

        int humanAge = 1;
        if (humanAge >=2 && humanAge < 6 ) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 18) {
            System.out.println("Eсли возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge > 18 && humanAge <= 24 ) {
            System.out.println("Eсли возраст человека равен " + humanAge + ", то ему нужно ходить в университет");
        } else if (humanAge > 24){
            System.out.println("Eсли возраст человека равен " + humanAge + ", то ему нужно ходить на работу");
        }

        // Задание 5

        int theAgeOfTheChild = 3;
        if ( theAgeOfTheChild < 5 ) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        } else if ( theAgeOfTheChild >= 5 && theAgeOfTheChild < 14 ) {
            System.out.println("Ребёнок может кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребёнок может кататься на аттракционе без сопровождения взрослого");
        }

        // Задание 6
        int one = 7;
        int two = 1;
        int free = 3;
        if ( one > two && one > free) {
            System.out.println(one);
        } else if ( two > free) {
            System.out.println(two);
        } else {
            System.out.println(free);
        }
    }
}