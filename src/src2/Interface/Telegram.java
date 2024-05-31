package Interface;

public class Telegram implements Messanger{
   // @Override
    public void sendMessage() {
        System.out.println("отправляем сообщение в телеграм");
    }

    //@Override
    public void getMessage() {
        System.out.println("читаем сообщение в телеграм");
    }

    public static void main(String[] args) {
        Telegram telega = new Telegram();
        telega.getMessage();
        telega.sendMessage();
    }
}
