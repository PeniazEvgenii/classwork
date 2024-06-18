package src2.PATTERNS.builder;

import java.util.Locale;

public class MainBuilder {
    public static void main(String[] args) {


        //MailBuilder builder = MailBuilder.builder();
//        Mail mail7 = MailBuilder.builder()
//                .setRecipient("kent@mail.ru")
//                .setBody("body")
//                .setTitle("title")
//                .build();

        PATTERNS.builder.Mail mail = PATTERNS.builder.Mail.builder()
                .setRecipient("")
                .setBody("")
                .setTitle("")
                .build();
    }
}
