package PATTERNS.builder;

public class Mail {
    private String recipient;
    private String title;
    private String body;

    private Mail(String recipient, String title, String body) {
        this.recipient = recipient;
        this.title = title;
        this.body = body;
    }

    public static Builder builder(){
        return new Builder();
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


    public static class Builder {
        private String recipient;
        private String title;
        private String body;


        private Builder(){
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }


        public Mail build(){
            return new Mail(recipient, title, body);
        }
    }
}
