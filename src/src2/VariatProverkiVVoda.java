import java.util.Locale;
import java.util.Scanner;

public class VariatProverkiVVoda {
    private static final int MIN_INPUT_NUMBER = 1;

    class One {
        public void main(String[] args) {
// проверка наличия в аргументе значения
            long inputNumber;
            long maxInputNumber = Long.MAX_VALUE;
            if (args.length != 0) {                               // проверил на наличие ввода
                inputNumber = Long.parseLong(args[0]);
                System.out.println("Вы ввели " + inputNumber);
                if (!(inputNumber >= MIN_INPUT_NUMBER)) {
                    System.out.println("Вы ввели неверное значение. Введите от " + MIN_INPUT_NUMBER + " до " + maxInputNumber);
                    return;
                }
            } else {
                System.out.println("Вы не ввели значение в консоль");
                return;
            }
        }
    }


    class Two {  //проверка наличия ввода в аргументе и REG EXP число или строка. Do - while бесполезен в данном случае

        public void main(String[] args) {
            long inputNumber;
            long maxInputNumber = Long.MAX_VALUE;

            if (args.length != 0) {
                String firstArgument = args[0];

                if (firstArgument.matches("-?\\d+")) {
                    System.out.println("Вы ввели: " + firstArgument + ". Это целое число!");   // можно эту строчку опустить
                } else if (firstArgument.matches("\\d+\\.\\d+")) {
                    System.out.println("Вы ввели: " + firstArgument + ". Это вещественное число!");
                    return;
                } else {
                    System.out.println("Вы ввели: " + firstArgument + ". Это не число!");
                    return;
                }

                inputNumber = Long.parseLong(firstArgument);

                if (!(inputNumber >= MIN_INPUT_NUMBER)) {
                    System.out.println("Вы ввели неверное значение. Введите от " + MIN_INPUT_NUMBER + " до " + maxInputNumber);
                    return;
                }

            } else {
                System.out.println("Вы не ввели значение в консоль");
                return;
            }
        }
    }

    class CheckInt {       //проверка на ввод целого числа
        public void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int value;

            do {
                System.out.println("Введи целочисленное число");

                if (console.hasNextInt()) {
                    value = console.nextInt();
                    break;
                } else {
                    System.out.println("Вы ввели не целое число");
                    console.next();
                }
            } while (true);
        }
    }



    class Three {   // просто проверка через консоль. Дробные через точку
        public static final int MIN_INPUT_DEGREE = 1;

        public void main(String[] args) {
            Scanner console = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Введи число, которое нужно возвести в степень");
            double number = console.nextDouble();

            int inputDegree;
            boolean checkMinDegree;

            do {
                System.out.println("Введи степень, в которую нужно возвести в число");
                inputDegree = console.nextInt();
                checkMinDegree = inputDegree < MIN_INPUT_DEGREE;

                if (checkMinDegree) {
                    System.out.println("Ошибка! Введи значение степени от " + MIN_INPUT_DEGREE + " и выше");
                }

            } while (checkMinDegree);
        }
    }



}
