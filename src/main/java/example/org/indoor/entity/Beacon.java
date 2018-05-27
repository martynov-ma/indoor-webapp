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
    private Integer cordx;

    @Column(name = "cordy")
    private Integer cordy;

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
