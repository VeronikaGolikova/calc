import java.util.Scanner;

public class Action {

    /**
     * Метод для выбора выполняемого действия:
     * 1 - калькулятор
     * 2 - поиск максимального слова в массиве
     */
    public static void chooseAction() {
        System.out.print("1 - калькулятор\n2 - поиск максимального слова в массиве\nВведите номер программы с которой хотите работать: ");
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
            default:
                System.out.println("Выбрано неизвестное действие");
        }
    }
}