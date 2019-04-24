package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class dllalgfun {


    @Id(autoincrement = true)
    private Long  fun_id;

    private String name;

    private int lib_id;

    private  int func_no;

    private int dev_id;

    private int unit_id;

    private String note;

    private int period;

    private int usable;

    private String module;

    public String getModule() {
        return this.module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getUsable() {
        return this.usable;
    }

    public void setUsable(int usable) {
        this.usable = usable;
    }

    public int getPeriod() {
        return this.period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getUnit_id() {
        return this.unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public int getDev_id() {
        return this.dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    public int getFunc_no() {
        return this.func_no;
    }

    public void setFunc_no(int func_no) {
        this.func_no = func_no;
    }

    public int getLib_id() {
        return this.lib_id;
    }

    public void setLib_id(int lib_id) {
        this.lib_id = lib_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFun_id() {
        return this.fun_id;
    }

    public void setFun_id(Long fun_id) {
        this.fun_id = fun_id;
    }

    @Generated(hash = 388036027)
    public dllalgfun(Long fun_id, String name, int lib_id, int func_no, int dev_id,
            int unit_id, String note, int period, int usable, String module) {
        this.fun_id = fun_id;
        this.name = name;
        this.lib_id = lib_id;
        this.func_no = func_no;
        this.dev_id = dev_id;
        this.unit_id = unit_id;
        this.note = note;
        this.period = period;
        this.usable = usable;
        this.module = module;
    }

    @Generated(hash = 1392094022)
    public dllalgfun() {
    }

}
