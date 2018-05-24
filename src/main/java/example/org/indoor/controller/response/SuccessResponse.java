package example.org.indoor.controller.response;

public class SuccessResponse extends Response {
    private Object result;

    public SuccessResponse(Object result) {
        super(true);
        this.result = result;
    }

    public Object getResult() {
        return result;
    }
}
