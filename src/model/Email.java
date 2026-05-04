package model;

public class Email {
    private String from;
    private String to;
    private String message;

    public Email(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
