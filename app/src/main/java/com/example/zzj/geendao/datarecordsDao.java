package com.example.zzj.geendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.zzj.entity.datarecords;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DATARECORDS".
*/
public class datarecordsDao extends AbstractDao<datarecords, Long> {

    public static final String TABLENAME = "DATARECORDS";

    /**
     * Properties of entity datarecords.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property File_id = new Property(0, Long.class, "file_id", true, "_id");
        public final static Property File_data = new Property(1, String.class, "file_data", false, "FILE_DATA");
        public final static Property Dev_id = new Property(2, int.class, "dev_id", false, "DEV_ID");
        public final static Property Begintime = new Property(3, String.class, "begintime", false, "BEGINTIME");
        public final static Property Endtime = new Property(4, String.class, "endtime", false, "ENDTIME");
        public final static Property Usable = new Property(5, int.class, "usable", false, "USABLE");
    };


    public datarecordsDao(DaoConfig config) {
        super(config);
    }
    
    public datarecordsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DATARECORDS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: file_id
                "\"FILE_DATA\" TEXT," + // 1: file_data
                "\"DEV_ID\" INTEGER NOT NULL ," + // 2: dev_id
                "\"BEGINTIME\" TEXT," + // 3: begintime
                "\"ENDTIME\" TEXT," + // 4: endtime
                "\"USABLE\" INTEGER NOT NULL );"); // 5: usable
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DATARECORDS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, datarecords entity) {
        stmt.clearBindings();
 
        Long file_id = entity.getFile_id();
        if (file_id != null) {
            stmt.bindLong(1, file_id);
        }
 
        String file_data = entity.getFile_data();
        if (file_data != null) {
            stmt.bindString(2, file_data);
        }
        stmt.bindLong(3, entity.getDev_id());
 
        String begintime = entity.getBegintime();
        if (begintime != null) {
            stmt.bindString(4, begintime);
        }
 
        String endtime = entity.getEndtime();
        if (endtime != null) {
            stmt.bindString(5, endtime);
        }
        stmt.bindLong(6, entity.getUsable());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, datarecords entity) {
        stmt.clearBindings();
 
        Long file_id = entity.getFile_id();
        if (file_id != null) {
            stmt.bindLong(1, file_id);
        }
 
        String file_data = entity.getFile_data();
        if (file_data != null) {
            stmt.bindString(2, file_data);
        }
        stmt.bindLong(3, entity.getDev_id());
 
        String begintime = entity.getBegintime();
        if (begintime != null) {
            stmt.bindString(4, begintime);
        }
 
        String endtime = entity.getEndtime();
        if (endtime != null) {
            stmt.bindString(5, endtime);
        }
        stmt.bindLong(6, entity.getUsable());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public datarecords readEntity(Cursor cursor, int offset) {
        datarecords entity = new datarecords( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // file_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // file_data
            cursor.getInt(offset + 2), // dev_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // begintime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // endtime
            cursor.getInt(offset + 5) // usable
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, datarecords entity, int offset) {
        entity.setFile_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFile_data(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDev_id(cursor.getInt(offset + 2));
        entity.setBegintime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setEndtime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUsable(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(datarecords entity, long rowId) {
        entity.setFile_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(datarecords entity) {
        if(entity != null) {
            return entity.getFile_id();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
