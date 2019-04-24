package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.sql.Timestamp;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class datarecords {

    @Id
    private Long file_id;

    private String file_data;

    private int dev_id;

    private String begintime;

    private String endtime;

    private int usable;

    public int getUsable() {
        return this.usable;
    }

    public void setUsable(int usable) {
        this.usable = usable;
    }

    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getBegintime() {
        return this.begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public int getDev_id() {
        return this.dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    public String getFile_data() {
        return this.file_data;
    }

    public void setFile_data(String file_data) {
        this.file_data = file_data;
    }

    public Long getFile_id() {
        return this.file_id;
    }

    public void setFile_id(Long file_id) {
        this.file_id = file_id;
    }

    @Generated(hash = 1365025622)
    public datarecords(Long file_id, String file_data, int dev_id,
            String begintime, String endtime, int usable) {
        this.file_id = file_id;
        this.file_data = file_data;
        this.dev_id = dev_id;
        this.begintime = begintime;
        this.endtime = endtime;
        this.usable = usable;
    }

    @Generated(hash = 1164603811)
    public datarecords() {
    }
}
