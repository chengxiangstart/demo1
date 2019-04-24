package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class dllalgin {

    @Id
    private  Long in_id;

    private int fun_id;

    private int data_id;

    private int repeatm;

    public int getRepeatm() {
        return this.repeatm;
    }

    public void setRepeatm(int repeatm) {
        this.repeatm = repeatm;
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

    public Long getIn_id() {
        return this.in_id;
    }

    public void setIn_id(Long in_id) {
        this.in_id = in_id;
    }

    @Generated(hash = 723835344)
    public dllalgin(Long in_id, int fun_id, int data_id, int repeatm) {
        this.in_id = in_id;
        this.fun_id = fun_id;
        this.data_id = data_id;
        this.repeatm = repeatm;
    }

    @Generated(hash = 345261095)
    public dllalgin() {
    }



}
