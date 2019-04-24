package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.sql.Date;
import java.sql.Timestamp;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class alarmrecords {

    @Id
    private Long alarmrec_id;

    private  int level;

    private int type;

    private String product;

    private int dev_id;

    private String fileurl;

    public String getFileurl() {
        return this.fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public int getDev_id() {
        return this.dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public Long getAlarmrec_id() {
        return this.alarmrec_id;
    }

    public void setAlarmrec_id(Long alarmrec_id) {
        this.alarmrec_id = alarmrec_id;
    }

    @Generated(hash = 1718769664)
    public alarmrecords(Long alarmrec_id, int level, int type, String product,
            int dev_id, String fileurl) {
        this.alarmrec_id = alarmrec_id;
        this.level = level;
        this.type = type;
        this.product = product;
        this.dev_id = dev_id;
        this.fileurl = fileurl;
    }

    @Generated(hash = 1423440687)
    public alarmrecords() {
    }

}
