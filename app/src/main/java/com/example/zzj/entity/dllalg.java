package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.sql.Date;
import java.sql.Timestamp;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class dllalg {
    @Id
    private Long lib_id;

    private String name;

    private String version;

    private String url;

    private String uptime;

    private String note;

    private int usable;

    public int getUsable() {
        return this.usable;
    }

    public void setUsable(int usable) {
        this.usable = usable;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUptime() {
        return this.uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLib_id() {
        return this.lib_id;
    }

    public void setLib_id(Long lib_id) {
        this.lib_id = lib_id;
    }

    @Generated(hash = 2071226696)
    public dllalg(Long lib_id, String name, String version, String url,
            String uptime, String note, int usable) {
        this.lib_id = lib_id;
        this.name = name;
        this.version = version;
        this.url = url;
        this.uptime = uptime;
        this.note = note;
        this.usable = usable;
    }

    @Generated(hash = 683389205)
    public dllalg() {
    }


}
