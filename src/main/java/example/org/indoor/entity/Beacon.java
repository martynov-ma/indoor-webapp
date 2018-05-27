package example.org.indoor.entity;

import javax.persistence.*;

@Entity
@Table(name = "beacons")
public class Beacon extends BaseEntity<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "floorNum")
    private Integer floorNum;

    @Column(name = "cordx")
    private Integer cordX;

    @Column(name = "cordy")
    private Integer cordY;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public Integer getCordX() {
        return cordX;
    }

    public void setCordX(Integer cordX) {
        this.cordX = cordX;
    }

    public Integer getCordY() {
        return cordY;
    }

    public void setCordY(Integer cordY) {
        this.cordY = cordY;
    }

}
