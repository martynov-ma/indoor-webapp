package example.org.indoor.entity;

import javax.persistence.*;

@Entity
@Table(name = "cabinets")
public class Cabinet extends BaseEntity<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "floorNum")
    private Integer floorNum;

    @Column(name = "cordx1")
    private Integer cordX1;

    @Column(name = "cordy1")
    private Integer cordY1;

    @Column(name = "cordx2")
    private Integer cordX2;

    @Column(name = "cordy2")
    private Integer cordY2;

    public Cabinet() {}

    public Cabinet(String name, Integer floorNum, Integer cordX1, Integer cordY1, Integer cordX2, Integer cordY2){
        this.name = name;
        this.floorNum = floorNum;
        this.cordX1 = cordX1;
        this.cordY1 = cordY1;
        this.cordX2 = cordX2;
        this.cordY2 = cordY2;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
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

    public Integer getCordX1() {
        return cordX1;
    }

    public void setCordX1(Integer cordX1) {
        this.cordX1 = cordX1;
    }

    public Integer getCordY1() {
        return cordY1;
    }

    public void setCordY1(Integer cordY1) {
        this.cordY1 = cordY1;
    }

    public Integer getCordX2() {
        return cordX2;
    }

    public void setCordX2(Integer cordX2) {
        this.cordX2 = cordX2;
    }

    public Integer getCordY2() {
        return cordY2;
    }

    public void setCordY2(Integer cordY2) {
        this.cordY2 = cordY2;
    }
}
