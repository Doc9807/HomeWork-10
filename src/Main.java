public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        System.out.println("«Ф. И. О. сотрудника — " + fullName + "».");

        System.out.println("\nTask 2");
        System.out.printf("«Данные Ф. И. О. сотрудника для заполнения отчета — %s».%n",fullName.toUpperCase());

        System.out.println("\nTask 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("«Данные Ф. И. О. сотрудника — " +
                fullName.replace("ё", "е").replace("Ё", "Е") + "».");
    }
}