import java.util.Random;

public class RandomNumber {

    public static void printSortedArray() {
        int n = 10;
        int maxMinusElement = -n;
        int minPositiveElement = n;
        int intArray[] = new int[n];
        Random random = new Random();
        System.out.println("Сгенерирован массив из случайных чисел:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(2 * n + 1) - n;
            System.out.print(intArray[i] + " ");
        }
        for (int i = 0; i < intArray.length; i++) {
            if (maxMinusElement < intArray[i] && intArray[i] < 0) {
                maxMinusElement = intArray[i];
            }
            if (minPositiveElement > intArray[i] && intArray[i] > 0) {
                minPositiveElement = intArray[i];
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == maxMinusElement) {
                intArray[i] = minPositiveElement;
            } else if (intArray[i] == minPositiveElement) {
                intArray[i] = maxMinusElement;
            }
        }
        System.out.println("\n Массив после перемещения элементов:");
        System.out.println();
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
