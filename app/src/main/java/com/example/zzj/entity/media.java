package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class media {
    @Id
    private  Long med_id;

    private String name;

    private int type;

    private String note;

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMed_id() {
        return this.med_id;
    }

    public void setMed_id(Long med_id) {
        this.med_id = med_id;
    }

    @Generated(hash = 1981048469)
    public media(Long med_id, String name, int type, String note) {
        this.med_id = med_id;
        this.name = name;
        this.type = type;
        this.note = note;
    }

    @Generated(hash = 681980366)
    public media() {
    }


}
