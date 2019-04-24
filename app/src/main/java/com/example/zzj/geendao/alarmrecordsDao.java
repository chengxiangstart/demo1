package com.example.zzj.geendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.zzj.entity.alarmrecords;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ALARMRECORDS".
*/
public class alarmrecordsDao extends AbstractDao<alarmrecords, Long> {

    public static final String TABLENAME = "ALARMRECORDS";

    /**
     * Properties of entity alarmrecords.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Alarmrec_id = new Property(0, Long.class, "alarmrec_id", true, "_id");
        public final static Property Level = new Property(1, int.class, "level", false, "LEVEL");
        public final static Property Type = new Property(2, int.class, "type", false, "TYPE");
        public final static Property Product = new Property(3, String.class, "product", false, "PRODUCT");
        public final static Property Dev_id = new Property(4, int.class, "dev_id", false, "DEV_ID");
        public final static Property Fileurl = new Property(5, String.class, "fileurl", false, "FILEURL");
    };


    public alarmrecordsDao(DaoConfig config) {
        super(config);
    }
    
    public alarmrecordsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ALARMRECORDS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: alarmrec_id
                "\"LEVEL\" INTEGER NOT NULL ," + // 1: level
                "\"TYPE\" INTEGER NOT NULL ," + // 2: type
                "\"PRODUCT\" TEXT," + // 3: product
                "\"DEV_ID\" INTEGER NOT NULL ," + // 4: dev_id
                "\"FILEURL\" TEXT);"); // 5: fileurl
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ALARMRECORDS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, alarmrecords entity) {
        stmt.clearBindings();
 
        Long alarmrec_id = entity.getAlarmrec_id();
        if (alarmrec_id != null) {
            stmt.bindLong(1, alarmrec_id);
        }
        stmt.bindLong(2, entity.getLevel());
        stmt.bindLong(3, entity.getType());
 
        String product = entity.getProduct();
        if (product != null) {
            stmt.bindString(4, product);
        }
        stmt.bindLong(5, entity.getDev_id());
 
        String fileurl = entity.getFileurl();
        if (fileurl != null) {
            stmt.bindString(6, fileurl);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, alarmrecords entity) {
        stmt.clearBindings();
 
        Long alarmrec_id = entity.getAlarmrec_id();
        if (alarmrec_id != null) {
            stmt.bindLong(1, alarmrec_id);
        }
        stmt.bindLong(2, entity.getLevel());
        stmt.bindLong(3, entity.getType());
 
        String product = entity.getProduct();
        if (product != null) {
            stmt.bindString(4, product);
        }
        stmt.bindLong(5, entity.getDev_id());
 
        String fileurl = entity.getFileurl();
        if (fileurl != null) {
            stmt.bindString(6, fileurl);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public alarmrecords readEntity(Cursor cursor, int offset) {
        alarmrecords entity = new alarmrecords( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // alarmrec_id
            cursor.getInt(offset + 1), // level
            cursor.getInt(offset + 2), // type
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // product
            cursor.getInt(offset + 4), // dev_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // fileurl
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, alarmrecords entity, int offset) {
        entity.setAlarmrec_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLevel(cursor.getInt(offset + 1));
        entity.setType(cursor.getInt(offset + 2));
        entity.setProduct(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDev_id(cursor.getInt(offset + 4));
        entity.setFileurl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(alarmrecords entity, long rowId) {
        entity.setAlarmrec_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(alarmrecords entity) {
        if(entity != null) {
            return entity.getAlarmrec_id();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
