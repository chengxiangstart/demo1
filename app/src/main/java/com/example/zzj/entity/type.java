package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class type {
    @Id
    private Long id;

    private int type;

    private int class1;

    private String name;

    private String note;

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass1() {
        return this.class1;
    }

    public void setClass1(int class1) {
        this.class1 = class1;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 900504212)
    public type(Long id, int type, int class1, String name, String note) {
        this.id = id;
        this.type = type;
        this.class1 = class1;
        this.name = name;
        this.note = note;
    }

    @Generated(hash = 1761568405)
    public type() {
    }
}
