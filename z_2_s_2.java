import java.util.Random;

public class z_2_s_2 {
    public static void main(String[] args) {
        // Массив, на значение которого ссылается код, изначально не был задан.
        Random rdm = new Random();
        int[] intArray = new int[rdm.nextInt(9, 15)];
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rdm.nextInt(0, 20);
        }
        
        //  Блок try не будет работать,  т. к. переменной d изначально задано значение = 0, всегда приводящее к ошибке.
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            System.out.println("Измените значение делителя, т.к. на ноль делиить НЕЛЬЗЯ!");
        }
    }

}
