package com.example.zzj.db;

import com.example.zzj.entity.alarminfo;
import com.example.zzj.geendao.DaoSession;


import java.util.List;

public class alarminfodb  {

    public void add(alarminfo an){
        MyApplication myApplication=new MyApplication();
        DaoSession daoSession=myApplication.getDaoSession();
        daoSession.insert(an);


    }
    public void delect(Long alarm_id){
        MyApplication myApplication=new MyApplication();
        DaoSession daoSession=myApplication.getDaoSession();
        alarminfodb an=new alarminfodb();
        daoSession.delete(an.selectone(alarm_id));
    }

    public List<alarminfo> getAll(){
        MyApplication myApplication=new MyApplication();
        DaoSession daoSession=myApplication.getDaoSession();
        List<alarminfo> an=daoSession.loadAll(alarminfo.class);
        return an;
    }

    public void update(alarminfo an){
        MyApplication myApplication=new MyApplication();
        DaoSession daoSession=myApplication.getDaoSession();
        daoSession.update(an);

    }
    public alarminfo selectone(Long alarm_id){
        MyApplication myApplication=new MyApplication();
        DaoSession daoSession=myApplication.getDaoSession();
        alarminfo an=new alarminfo();
        an=daoSession.load(alarminfo.class,alarm_id);
        return an;
    }



}
