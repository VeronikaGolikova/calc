import java.util.Scanner;

public class Calculator {

    /**
     * Метод позволяет выполнить оперции сложения, вычитания, умножения и деления с десятичными числами
     * Работа ввода и вывода значений реализована через консоль
     */
    public static void calculate() {
        System.out.print("Введите первое число с плавающей точкой: ");
        Scanner scanner = new Scanner(System.in);
        double arg1 = scanner.nextDouble();
        System.out.print("Введите второе число с плавающей точкой: ");
        double arg2 = scanner.nextDouble();
        System.out.println("Выберите операцию: \n1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1: {
                double rezalt = arg1 + arg2;
                System.out.print(arg1 + " + " + arg2 + " = ");
                System.out.printf("%+.4f", rezalt);
            }
            break;
            case 2: {
                double rezalt = arg1 - arg2;
                System.out.print(arg1 + " - " + arg2 + " = ");
                System.out.printf("%+.4f", rezalt);
            }
            break;
            case 3: {
                double rezalt = arg1 * arg2;
                System.out.print(arg1 + " * " + arg2 + " = ");
                System.out.printf("%+.4f", rezalt);
            }
            break;
            case 4: {
                double rezalt = arg1 / arg2;
                System.out.print(arg1 + " / " + arg2 + " = ");
                System.out.printf("%+.4f", rezalt);
            }
            break;
            default:
                System.out.println("Выбрано неизвестное действие");
        }
        scanner.close();
    }
}
