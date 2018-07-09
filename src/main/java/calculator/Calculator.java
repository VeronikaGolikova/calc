package calculator;

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
        String result;
        switch (operation) {
            case 1: {
                Operation operationSum = new Sum(arg1, arg2);
                result = operationSum.getResult();
            }
            break;
            case 2: {
                Operation operationSum = new Subtraction(arg1, arg2);
                result = operationSum.getResult();
            }
            break;
            case 3: {
                Operation operationSum = new Multiplication(arg1, arg2);
                result = operationSum.getResult();
            }
            break;
            case 4: {
                Operation operationSum = new Division(arg1, arg2);
                result = operationSum.getResult();
            }
            break;
            default:
                result = "Выбрана неизвестная операция";
        }
        scanner.close();
        System.out.print(result);
    }
}
