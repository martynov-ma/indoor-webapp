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
    private Integer cordx1;

    @Column(name = "cordy1")
    private Integer cordy1;

    @Column(name = "cordx2")
    private Integer cordx2;

    @Column(name = "cordy2")
    private Integer cordy2;

    public Cabinet() {}

    public Cabinet(String name, Integer floorNum, Integer cordx1, Integer cordy1, Integer cordx2, Integer cordy2){
        this.name = name;
        this.floorNum = floorNum;
        this.cordx1 = cordx1;
        this.cordy1 = cordy1;
        this.cordx2 = cordx2;
        this.cordy2 = cordy2;
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

    public Integer getCordx1() {
        return cordx1;
    }

    public void setCordx1(Integer cordx1) {
        this.cordx1 = cordx1;
    }

    public Integer getCordy1() {
        return cordy1;
    }

    public void setCordy1(Integer cordy1) {
        this.cordy1 = cordy1;
    }

    public Integer getCordx2() {
        return cordx2;
    }

    public void setCordx2(Integer cordx2) {
        this.cordx2 = cordx2;
    }

    public Integer getCordy2() {
        return cordy2;
    }

    public void setCordy2(Integer cordy2) {
        this.cordy2 = cordy2;
    }
}
