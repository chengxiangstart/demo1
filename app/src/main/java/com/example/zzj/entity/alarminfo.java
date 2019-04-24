package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class alarminfo {

    @Id
    private Long alarm_id;

    private int level;

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

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Long getAlarm_id() {
        return this.alarm_id;
    }

    public void setAlarm_id(Long alarm_id) {
        this.alarm_id = alarm_id;
    }

    @Generated(hash = 1021512807)
    public alarminfo(Long alarm_id, int level, int type, String note) {
        this.alarm_id = alarm_id;
        this.level = level;
        this.type = type;
        this.note = note;
    }

    @Generated(hash = 148491280)
    public alarminfo() {
    }
}
