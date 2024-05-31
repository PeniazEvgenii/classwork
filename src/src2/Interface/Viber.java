package Interface;

public class Viber implements Messanger{
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber!");
    }

    @Override
    public void getMessage() {
        System.out.println("Получаем сообщение в Viber!");
    }

    public static void main(String[] args) {
        Viber viber = new Viber();
        viber.sendMessage();
        viber.getMessage();
    }
}
