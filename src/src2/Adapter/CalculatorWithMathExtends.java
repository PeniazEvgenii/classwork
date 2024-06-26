package Adapter;

/*
 * 4. Создать класс CalculatorWithMathExtends.
 *	4.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 *	4.2 Данный класс должен наследовать класс CalculatorWithOperator.
 *	4.3 Условия:
 *		4.3.1 4 базовых математических метода (деление, умножение, вычитание, сложение) НЕ ДОЛЖНЫ быть объявлены напрямую в классе,
 *		    а должны бытьунаследованы от родительского класса (4.2).
 *		4.3.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы должны
 *		     ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса (4.2) и должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 *	4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 *	    и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Метод возведение в целую степень дробного положительного числа, используя библиотеку Math
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    @Override
    public double getPowerOfNumber(double x, int y) {
        if(x <= 0) {
            return -1;
        }
        return Math.pow(x, y);
    }

    /**
     * Метод нахождения модуля числа, используя библиотеку Math
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    @Override
    public double getModuleOfNumber(double x) {
        return Math.abs(x);
    }

    /**
     * Метод нахождения квадратного корня, используя библиотеку Math
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    @Override
    public double getSquareRoot(double x) {
        return Math.sqrt(x);
    }
}
