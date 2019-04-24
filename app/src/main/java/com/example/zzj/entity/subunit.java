package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class subunit {

    @Id
    private Long unit_id;

    private String name;

    private int up_id;

    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getUp_id() {
        return this.up_id;
    }

    public void setUp_id(int up_id) {
        this.up_id = up_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUnit_id() {
        return this.unit_id;
    }

    public void setUnit_id(Long unit_id) {
        this.unit_id = unit_id;
    }

    @Generated(hash = 8242732)
    public subunit(Long unit_id, String name, int up_id, int state) {
        this.unit_id = unit_id;
        this.name = name;
        this.up_id = up_id;
        this.state = state;
    }

    @Generated(hash = 2125522859)
    public subunit() {
    }


}
