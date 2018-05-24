package example.org.indoor.controller.response;

public class Response {
    private Boolean success;

    public Response(Boolean success) {
        this.success = success;
    }

    public Boolean isSuccess() {
        return success;
    }
}
