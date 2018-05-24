package example.org.indoor.controller.response;

public class ErrorResponse extends Response {
    private String message;

    public ErrorResponse(String message) {
        super(false);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
