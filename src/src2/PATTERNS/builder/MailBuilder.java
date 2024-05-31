package PATTERNS.builder;

public class MailBuilder {
    private String recipient;
    private String title;
    private String body;

    private MailBuilder(){}

    public static MailBuilder builder(){
        return new MailBuilder();
    }


    public MailBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public MailBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MailBuilder setBody(String body) {
        this.body = body;
        return this;
    }


//    public Mail build(){
//        return new Mail(recipient, title, body);
//    }
}
