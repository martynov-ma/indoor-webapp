package example.org.indoor.entity;

public class Cabinet {
    private String nameCabinet;
    private Integer floor;
    private Integer X1;
    private Integer Y1;
    private Integer X2;
    private Integer Y2;

    public Cabinet(String nameCabinet, Integer floor, Integer X1, Integer Y1, Integer X2, Integer Y2){
        this.nameCabinet = nameCabinet;
        this.floor = floor;
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }

    public String getNameCabinet() {
        return nameCabinet;
    }

    public void setNameCabinet(String nameCabinet) {
        this.nameCabinet = nameCabinet;
    }
}
