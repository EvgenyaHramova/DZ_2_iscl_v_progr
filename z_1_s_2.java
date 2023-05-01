import java.util.Scanner;

public class z_1_s_2 {

    public static void main(String[] args) {
        typeFloat();
        // System.out.println(typeFloat());

    }

    public static void typeFloat() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите дробное число: ");
            float num = Float.parseFloat(scanner.nextLine());
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("Было введено не число!");
            typeFloat();
        }
        scanner.close();

    }

    // public static float typeFloat() {
    // Scanner scanner = new Scanner(System.in);
    // while (true) {
    // try {
    // System.out.println("Введите дробное число: ");
    // String num = scanner.nextLine();
    // return Float.parseFloat(num);
    // } catch (NumberFormatException e) {
    // System.out.println("Было введено не число!");
    // }
    // scanner.close();
    // }
    // }

}
