import java.util.Scanner;

public class z_4_s_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        if (str==null|| str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Вы ввели пустую строку или пробелы!");
        } else {
            System.out.println("Вот что Вы ввели:\n" + str);
        }
        scanner.close();
    }
}
