import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task_1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();

        System.out.println("Task_2");
        String dataReport = fullName.toUpperCase();   // строка для заполнения отчёта
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + dataReport);
        System.out.println();

        System.out.println("Task_3");
        fullName = "Иванов Семён Семёнович";
        String fullName3 = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName3);
    }
}