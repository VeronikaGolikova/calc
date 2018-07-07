import java.util.Scanner;

public class Action {

    /**
     * Метод для выбора выполняемого действия:
     * 1 - калькулятор
     * 2 - поиск максимального слова в массиве
     * 3 - вывести массив рандомных чисел
     */
    public static void chooseAction() {
        System.out.print("1 - калькулятор\n2 - поиск максимального слова в массиве\n3 - вывести массив рандомных чисел\nВведите номер программы с которой хотите работать: ");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        switch (action) {
            case 1: {
                Calculator.calculate();
            }
            break;
            case 2: {
                WordsArray.getMaxLengthWordFromArray();
            }
            break;
            case 3: {
                RandomNumber.printSortedArray();
            }
            break;
            default:
                System.out.println("Выбрано неизвестное действие");
        }
    }
}