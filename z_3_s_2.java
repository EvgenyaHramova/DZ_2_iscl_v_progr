public class z_3_s_2 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            // Класс Throwable является единым классом-предком для всех исключений,
            // поэтому нижеуказанные исключения не могут быть обработаны после родителя.
            // Для их обработки блок с Throwable перенесен после дочерних исключений.

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // throws FileNotFoundException - ошибка относится к обработке файлов

    public static void printSum(Integer a, Integer b) // throws FileNotFoundException//
    {
        System.out.println(a + b);
    }

}
