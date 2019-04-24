package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class dllalgout {

    private Long out_id;
    private int fun_id;

    private int data_id;

    private int alarm_id;

    public int getAlarm_id() {
        return this.alarm_id;
    }

    public void setAlarm_id(int alarm_id) {
        this.alarm_id = alarm_id;
    }

    public int getData_id() {
        return this.data_id;
    }

    public void setData_id(int data_id) {
        this.data_id = data_id;
    }

    public int getFun_id() {
        return this.fun_id;
    }

    public void setFun_id(int fun_id) {
        this.fun_id = fun_id;
    }

    public Long getOut_id() {
        return this.out_id;
    }

    public void setOut_id(Long out_id) {
        this.out_id = out_id;
    }

    @Generated(hash = 1729701117)
    public dllalgout(Long out_id, int fun_id, int data_id, int alarm_id) {
        this.out_id = out_id;
        this.fun_id = fun_id;
        this.data_id = data_id;
        this.alarm_id = alarm_id;
    }

    @Generated(hash = 169134795)
    public dllalgout() {
    }
}
