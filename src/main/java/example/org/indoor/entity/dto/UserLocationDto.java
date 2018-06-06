package example.org.indoor.entity.dto;

public class UserLocationDto {

    private Integer cordx;
    private Integer cordy;

    public UserLocationDto() {}

    public UserLocationDto(Integer cordx, Integer cordy) {
        this.cordx = cordx;
        this.cordy = cordy;
    }

    public Integer getCordx() {
        return cordx;
    }

    public void setCordx(Integer cordx) {
        this.cordx = cordx;
    }

    public Integer getCordy() {
        return cordy;
    }

    public void setCordy(Integer cordy) {
        this.cordy = cordy;
    }
}
