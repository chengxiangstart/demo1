package com.example.zzj.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.sql.Date;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class userinfo {

    @Id
    private Long person_id;

    private String name;

    private String pass;

    private int type;

    private String timein;

    private String timeout;

    public String getTimeout() {
        return this.timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getTimein() {
        return this.timein;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPerson_id() {
        return this.person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }

    @Generated(hash = 1250728621)
    public userinfo(Long person_id, String name, String pass, int type,
            String timein, String timeout) {
        this.person_id = person_id;
        this.name = name;
        this.pass = pass;
        this.type = type;
        this.timein = timein;
        this.timeout = timeout;
    }

    @Generated(hash = 1030146423)
    public userinfo() {
    }

}
