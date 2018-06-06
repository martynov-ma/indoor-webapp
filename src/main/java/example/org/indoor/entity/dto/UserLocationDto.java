package example.org.indoor.entity.dto;

public class UserLocationDto {

    private Integer floorNum;
    private Integer cordx;
    private Integer cordy;

    public UserLocationDto() {}

    public UserLocationDto(Integer floorNum, Integer cordx, Integer cordy) {
        this.floorNum = floorNum;
        this.cordx = cordx;
        this.cordy = cordy;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
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
