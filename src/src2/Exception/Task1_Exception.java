package Exception;
/**
 * 1 обявить переменную с null. вызвать метод и отловить
 * 2 код который отловит ArrayIndexOutIfBounds
 * 3 создать собственный класс-исключеник - наследник Exception.
 *         создать метод выбрасыв исключение
 *         вызватть метод и отловить исключение. вывести stack trace
 */
public class Task1_Exception {
    public static void main(String[] args) {
        String str = null;
        try{
            str.length();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
//NullPointerException - это RunTimeException и его не недо отлавливать. Ошибка программиста
    }
}
