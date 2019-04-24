package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class configuration {


    @Id
    private  Long no;

    private int type;

    private String keym;

    private String valuem;

    public String getValuem() {
        return this.valuem;
    }

    public void setValuem(String valuem) {
        this.valuem = valuem;
    }

    public String getKeym() {
        return this.keym;
    }

    public void setKeym(String keym) {
        this.keym = keym;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Long getNo() {
        return this.no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    @Generated(hash = 767543391)
    public configuration(Long no, int type, String keym, String valuem) {
        this.no = no;
        this.type = type;
        this.keym = keym;
        this.valuem = valuem;
    }

    @Generated(hash = 1613972495)
    public configuration() {
    }


}
