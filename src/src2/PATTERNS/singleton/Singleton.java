package PATTERNS.singleton;

public class Singleton {
    private static MailSenderService mailSenderService = new MailSenderService(
            "smtp.mail.ru",
                    "genia-genius-91@mail.ru",
                    "6Pp2xaceETZ57gM9hkx8"
    );

    public static MailSenderService getMailSenderService() {
        return mailSenderService;
    }
}
