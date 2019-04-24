package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class infotype {
    @Id
    private Long id;

    private int type;

    private int size;

    private String name;

    private int devtype;

    public int getDevtype() {
        return this.devtype;
    }

    public void setDevtype(int devtype) {
        this.devtype = devtype;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
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

    @Generated(hash = 1603406981)
    public infotype(Long id, int type, int size, String name, int devtype) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.name = name;
        this.devtype = devtype;
    }

    @Generated(hash = 594515492)
    public infotype() {
    }
}
