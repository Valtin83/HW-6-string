public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        // создать четыре строки, хронящие Ф. И. О. сотрудника
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача №2");
        // использую метод toUpperCase()
        // этот метод преобразует все знаки в строке в верхний регистр
        String upperCaseName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " +
                upperCaseName);

        System.out.println("Задача №3");
        // нужно заменить символ «ё» на символ «е»
        String fullName2 = "Иванов Семён Семёнович";
        String replacementFullName2 = fullName2.replace("ё", "e");
        System.out.println("Данные Ф. И. О. сотрудника — " + replacementFullName2);
    }
}