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

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "cordx")
    private Float cordX;

    @Column(name = "cordy")
    private Float cordY;

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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Float getCordX() {
        return cordX;
    }

    public void setCordX(Float cordX) {
        this.cordX = cordX;
    }

    public Float getCordY() {
        return cordY;
    }

    public void setCordY(Float cordY) {
        this.cordY = cordY;
    }

}
