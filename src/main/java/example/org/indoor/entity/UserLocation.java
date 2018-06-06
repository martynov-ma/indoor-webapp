package example.org.indoor.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_location")
public class UserLocation extends BaseEntity<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "floorNum")
    private Integer floorNum;

    @Column(name = "cordx")
    private Integer cordx;

    @Column(name = "cordy")
    private Integer cordy;

    @Column(name = "date")
    private String date;

    public UserLocation() {}

    public UserLocation(Integer floorNum, Integer cordx, Integer cordy, String date){
        this.floorNum = floorNum;
        this.cordx = cordx;
        this.cordy = cordy;
        this.date = date;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
