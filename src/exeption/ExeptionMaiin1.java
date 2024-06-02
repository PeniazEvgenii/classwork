package exeption;

public class ExeptionMaiin1 {
    public static void main(String[] args) {
        try {
            calculate(15);
        } catch (IllegalArgumentException e) {
            System.out.println("произошла ошибка");
            System.out.println(e.getMessage());
        }
    }


    /**
     *
     * @param max
     * @return
     */
    public static int calculate(int max) {
        if(max < 1 || max > 12) {
           // throw new IllegalArgumentException("Переданное число обработать не можем");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Переданное число обработать не можем");
            throw illegalArgumentException;
        }
        return 100;
    }
}
