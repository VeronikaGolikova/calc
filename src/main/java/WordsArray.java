import java.util.Scanner;

public class WordsArray {

    /**
     * Метод определяет слово максимальной длины
     */
    public static void getMaxLengthWordFromArray() {
        System.out.print("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int maxLength = 0;
        String maxWord = "";
        String[] wordArray = new String[size];
        System.out.println("Введите слова массива:");
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = scanner.next();
            if (maxLength < wordArray[i].length()) {
                maxLength = wordArray[i].length();
                maxWord = wordArray[i];
            }
        }
        System.out.print("Слово максимальной длины: " + maxWord);
    }
}
