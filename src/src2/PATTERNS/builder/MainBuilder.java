package PATTERNS.builder;

import java.util.Locale;

public class MainBuilder {
    public static void main(String[] args) {


        //MailBuilder builder = MailBuilder.builder();
//        Mail mail7 = MailBuilder.builder()
//                .setRecipient("kent@mail.ru")
//                .setBody("body")
//                .setTitle("title")
//                .build();

        Mail mail = Mail.builder()
                .setRecipient("")
                .setBody("")
                .setTitle("")
                .build();
    }
}
