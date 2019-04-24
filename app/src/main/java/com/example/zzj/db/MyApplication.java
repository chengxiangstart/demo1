package com.example.zzj.db;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.example.zzj.geendao.DaoMaster;
import com.example.zzj.geendao.DaoSession;

public class MyApplication extends Application {


    /**
     * 初始化GreenDao,直接在Application中进行初始化操作
     */
    private void initGreenDao() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "equipment.db");
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    private DaoSession daoSession;
    public DaoSession getDaoSession() {
        return daoSession;
    }
}
