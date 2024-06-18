package src2.PATTERNS.singleton;

public class Mail {
    private String recipient;
    private String title;
    private String body;

    public Mail(String recipient, String title, String body) {
        this.recipient = recipient;
        this.title = title;
        this.body = body;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
