package com.example.zzj.geendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.zzj.entity.alarminfo;
import com.example.zzj.entity.alarmrecords;
import com.example.zzj.entity.configuration;
import com.example.zzj.entity.dataattr;
import com.example.zzj.entity.datarecords;
import com.example.zzj.entity.device;
import com.example.zzj.entity.dllalg;
import com.example.zzj.entity.dllalgfun;
import com.example.zzj.entity.dllalgin;
import com.example.zzj.entity.dllalgout;
import com.example.zzj.entity.infotype;
import com.example.zzj.entity.media;
import com.example.zzj.entity.subunit;
import com.example.zzj.entity.type;
import com.example.zzj.entity.userinfo;

import com.example.zzj.geendao.alarminfoDao;
import com.example.zzj.geendao.alarmrecordsDao;
import com.example.zzj.geendao.configurationDao;
import com.example.zzj.geendao.dataattrDao;
import com.example.zzj.geendao.datarecordsDao;
import com.example.zzj.geendao.deviceDao;
import com.example.zzj.geendao.dllalgDao;
import com.example.zzj.geendao.dllalgfunDao;
import com.example.zzj.geendao.dllalginDao;
import com.example.zzj.geendao.dllalgoutDao;
import com.example.zzj.geendao.infotypeDao;
import com.example.zzj.geendao.mediaDao;
import com.example.zzj.geendao.subunitDao;
import com.example.zzj.geendao.typeDao;
import com.example.zzj.geendao.userinfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig alarminfoDaoConfig;
    private final DaoConfig alarmrecordsDaoConfig;
    private final DaoConfig configurationDaoConfig;
    private final DaoConfig dataattrDaoConfig;
    private final DaoConfig datarecordsDaoConfig;
    private final DaoConfig deviceDaoConfig;
    private final DaoConfig dllalgDaoConfig;
    private final DaoConfig dllalgfunDaoConfig;
    private final DaoConfig dllalginDaoConfig;
    private final DaoConfig dllalgoutDaoConfig;
    private final DaoConfig infotypeDaoConfig;
    private final DaoConfig mediaDaoConfig;
    private final DaoConfig subunitDaoConfig;
    private final DaoConfig typeDaoConfig;
    private final DaoConfig userinfoDaoConfig;

    private final alarminfoDao alarminfoDao;
    private final alarmrecordsDao alarmrecordsDao;
    private final configurationDao configurationDao;
    private final dataattrDao dataattrDao;
    private final datarecordsDao datarecordsDao;
    private final deviceDao deviceDao;
    private final dllalgDao dllalgDao;
    private final dllalgfunDao dllalgfunDao;
    private final dllalginDao dllalginDao;
    private final dllalgoutDao dllalgoutDao;
    private final infotypeDao infotypeDao;
    private final mediaDao mediaDao;
    private final subunitDao subunitDao;
    private final typeDao typeDao;
    private final userinfoDao userinfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        alarminfoDaoConfig = daoConfigMap.get(alarminfoDao.class).clone();
        alarminfoDaoConfig.initIdentityScope(type);

        alarmrecordsDaoConfig = daoConfigMap.get(alarmrecordsDao.class).clone();
        alarmrecordsDaoConfig.initIdentityScope(type);

        configurationDaoConfig = daoConfigMap.get(configurationDao.class).clone();
        configurationDaoConfig.initIdentityScope(type);

        dataattrDaoConfig = daoConfigMap.get(dataattrDao.class).clone();
        dataattrDaoConfig.initIdentityScope(type);

        datarecordsDaoConfig = daoConfigMap.get(datarecordsDao.class).clone();
        datarecordsDaoConfig.initIdentityScope(type);

        deviceDaoConfig = daoConfigMap.get(deviceDao.class).clone();
        deviceDaoConfig.initIdentityScope(type);

        dllalgDaoConfig = daoConfigMap.get(dllalgDao.class).clone();
        dllalgDaoConfig.initIdentityScope(type);

        dllalgfunDaoConfig = daoConfigMap.get(dllalgfunDao.class).clone();
        dllalgfunDaoConfig.initIdentityScope(type);

        dllalginDaoConfig = daoConfigMap.get(dllalginDao.class).clone();
        dllalginDaoConfig.initIdentityScope(type);

        dllalgoutDaoConfig = daoConfigMap.get(dllalgoutDao.class).clone();
        dllalgoutDaoConfig.initIdentityScope(type);

        infotypeDaoConfig = daoConfigMap.get(infotypeDao.class).clone();
        infotypeDaoConfig.initIdentityScope(type);

        mediaDaoConfig = daoConfigMap.get(mediaDao.class).clone();
        mediaDaoConfig.initIdentityScope(type);

        subunitDaoConfig = daoConfigMap.get(subunitDao.class).clone();
        subunitDaoConfig.initIdentityScope(type);

        typeDaoConfig = daoConfigMap.get(typeDao.class).clone();
        typeDaoConfig.initIdentityScope(type);

        userinfoDaoConfig = daoConfigMap.get(userinfoDao.class).clone();
        userinfoDaoConfig.initIdentityScope(type);

        alarminfoDao = new alarminfoDao(alarminfoDaoConfig, this);
        alarmrecordsDao = new alarmrecordsDao(alarmrecordsDaoConfig, this);
        configurationDao = new configurationDao(configurationDaoConfig, this);
        dataattrDao = new dataattrDao(dataattrDaoConfig, this);
        datarecordsDao = new datarecordsDao(datarecordsDaoConfig, this);
        deviceDao = new deviceDao(deviceDaoConfig, this);
        dllalgDao = new dllalgDao(dllalgDaoConfig, this);
        dllalgfunDao = new dllalgfunDao(dllalgfunDaoConfig, this);
        dllalginDao = new dllalginDao(dllalginDaoConfig, this);
        dllalgoutDao = new dllalgoutDao(dllalgoutDaoConfig, this);
        infotypeDao = new infotypeDao(infotypeDaoConfig, this);
        mediaDao = new mediaDao(mediaDaoConfig, this);
        subunitDao = new subunitDao(subunitDaoConfig, this);
        typeDao = new typeDao(typeDaoConfig, this);
        userinfoDao = new userinfoDao(userinfoDaoConfig, this);

        registerDao(alarminfo.class, alarminfoDao);
        registerDao(alarmrecords.class, alarmrecordsDao);
        registerDao(configuration.class, configurationDao);
        registerDao(dataattr.class, dataattrDao);
        registerDao(datarecords.class, datarecordsDao);
        registerDao(device.class, deviceDao);
        registerDao(dllalg.class, dllalgDao);
        registerDao(dllalgfun.class, dllalgfunDao);
        registerDao(dllalgin.class, dllalginDao);
        registerDao(dllalgout.class, dllalgoutDao);
        registerDao(infotype.class, infotypeDao);
        registerDao(media.class, mediaDao);
        registerDao(subunit.class, subunitDao);
        registerDao(type.class, typeDao);
        registerDao(userinfo.class, userinfoDao);
    }
    
    public void clear() {
        alarminfoDaoConfig.getIdentityScope().clear();
        alarmrecordsDaoConfig.getIdentityScope().clear();
        configurationDaoConfig.getIdentityScope().clear();
        dataattrDaoConfig.getIdentityScope().clear();
        datarecordsDaoConfig.getIdentityScope().clear();
        deviceDaoConfig.getIdentityScope().clear();
        dllalgDaoConfig.getIdentityScope().clear();
        dllalgfunDaoConfig.getIdentityScope().clear();
        dllalginDaoConfig.getIdentityScope().clear();
        dllalgoutDaoConfig.getIdentityScope().clear();
        infotypeDaoConfig.getIdentityScope().clear();
        mediaDaoConfig.getIdentityScope().clear();
        subunitDaoConfig.getIdentityScope().clear();
        typeDaoConfig.getIdentityScope().clear();
        userinfoDaoConfig.getIdentityScope().clear();
    }

    public alarminfoDao getAlarminfoDao() {
        return alarminfoDao;
    }

    public alarmrecordsDao getAlarmrecordsDao() {
        return alarmrecordsDao;
    }

    public configurationDao getConfigurationDao() {
        return configurationDao;
    }

    public dataattrDao getDataattrDao() {
        return dataattrDao;
    }

    public datarecordsDao getDatarecordsDao() {
        return datarecordsDao;
    }

    public deviceDao getDeviceDao() {
        return deviceDao;
    }

    public dllalgDao getDllalgDao() {
        return dllalgDao;
    }

    public dllalgfunDao getDllalgfunDao() {
        return dllalgfunDao;
    }

    public dllalginDao getDllalginDao() {
        return dllalginDao;
    }

    public dllalgoutDao getDllalgoutDao() {
        return dllalgoutDao;
    }

    public infotypeDao getInfotypeDao() {
        return infotypeDao;
    }

    public mediaDao getMediaDao() {
        return mediaDao;
    }

    public subunitDao getSubunitDao() {
        return subunitDao;
    }

    public typeDao getTypeDao() {
        return typeDao;
    }

    public userinfoDao getUserinfoDao() {
        return userinfoDao;
    }

}
