package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class device {

    @Id
    private Long dev_id;


    private int unit_id;

    private String name;

    private String serial;

    private double longitude;

    private  double latitude;

    private int time;

    private String note;

    private String feature;

    private int type;

    private int media;

    private String plugm;

    public String getPlugm() {
        return this.plugm;
    }

    public void setPlugm(String plugm) {
        this.plugm = plugm;
    }

    public int getMedia() {
        return this.media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit_id() {
        return this.unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public Long getDev_id() {
        return this.dev_id;
    }

    public void setDev_id(Long dev_id) {
        this.dev_id = dev_id;
    }

    @Generated(hash = 1184279356)
    public device(Long dev_id, int unit_id, String name, String serial,
            double longitude, double latitude, int time, String note,
            String feature, int type, int media, String plugm) {
        this.dev_id = dev_id;
        this.unit_id = unit_id;
        this.name = name;
        this.serial = serial;
        this.longitude = longitude;
        this.latitude = latitude;
        this.time = time;
        this.note = note;
        this.feature = feature;
        this.type = type;
        this.media = media;
        this.plugm = plugm;
    }

    @Generated(hash = 1888472379)
    public device() {
    }



}
