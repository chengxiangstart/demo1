package com.example.zzj.geendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.zzj.entity.dllalgfun;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DLLALGFUN".
*/
public class dllalgfunDao extends AbstractDao<dllalgfun, Long> {

    public static final String TABLENAME = "DLLALGFUN";

    /**
     * Properties of entity dllalgfun.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Fun_id = new Property(0, Long.class, "fun_id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Lib_id = new Property(2, int.class, "lib_id", false, "LIB_ID");
        public final static Property Func_no = new Property(3, int.class, "func_no", false, "FUNC_NO");
        public final static Property Dev_id = new Property(4, int.class, "dev_id", false, "DEV_ID");
        public final static Property Unit_id = new Property(5, int.class, "unit_id", false, "UNIT_ID");
        public final static Property Note = new Property(6, String.class, "note", false, "NOTE");
        public final static Property Period = new Property(7, int.class, "period", false, "PERIOD");
        public final static Property Usable = new Property(8, int.class, "usable", false, "USABLE");
        public final static Property Module = new Property(9, String.class, "module", false, "MODULE");
    };


    public dllalgfunDao(DaoConfig config) {
        super(config);
    }
    
    public dllalgfunDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DLLALGFUN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: fun_id
                "\"NAME\" TEXT," + // 1: name
                "\"LIB_ID\" INTEGER NOT NULL ," + // 2: lib_id
                "\"FUNC_NO\" INTEGER NOT NULL ," + // 3: func_no
                "\"DEV_ID\" INTEGER NOT NULL ," + // 4: dev_id
                "\"UNIT_ID\" INTEGER NOT NULL ," + // 5: unit_id
                "\"NOTE\" TEXT," + // 6: note
                "\"PERIOD\" INTEGER NOT NULL ," + // 7: period
                "\"USABLE\" INTEGER NOT NULL ," + // 8: usable
                "\"MODULE\" TEXT);"); // 9: module
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DLLALGFUN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, dllalgfun entity) {
        stmt.clearBindings();
 
        Long fun_id = entity.getFun_id();
        if (fun_id != null) {
            stmt.bindLong(1, fun_id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getLib_id());
        stmt.bindLong(4, entity.getFunc_no());
        stmt.bindLong(5, entity.getDev_id());
        stmt.bindLong(6, entity.getUnit_id());
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(7, note);
        }
        stmt.bindLong(8, entity.getPeriod());
        stmt.bindLong(9, entity.getUsable());
 
        String module = entity.getModule();
        if (module != null) {
            stmt.bindString(10, module);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, dllalgfun entity) {
        stmt.clearBindings();
 
        Long fun_id = entity.getFun_id();
        if (fun_id != null) {
            stmt.bindLong(1, fun_id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getLib_id());
        stmt.bindLong(4, entity.getFunc_no());
        stmt.bindLong(5, entity.getDev_id());
        stmt.bindLong(6, entity.getUnit_id());
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(7, note);
        }
        stmt.bindLong(8, entity.getPeriod());
        stmt.bindLong(9, entity.getUsable());
 
        String module = entity.getModule();
        if (module != null) {
            stmt.bindString(10, module);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public dllalgfun readEntity(Cursor cursor, int offset) {
        dllalgfun entity = new dllalgfun( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // fun_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getInt(offset + 2), // lib_id
            cursor.getInt(offset + 3), // func_no
            cursor.getInt(offset + 4), // dev_id
            cursor.getInt(offset + 5), // unit_id
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // note
            cursor.getInt(offset + 7), // period
            cursor.getInt(offset + 8), // usable
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // module
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, dllalgfun entity, int offset) {
        entity.setFun_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLib_id(cursor.getInt(offset + 2));
        entity.setFunc_no(cursor.getInt(offset + 3));
        entity.setDev_id(cursor.getInt(offset + 4));
        entity.setUnit_id(cursor.getInt(offset + 5));
        entity.setNote(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPeriod(cursor.getInt(offset + 7));
        entity.setUsable(cursor.getInt(offset + 8));
        entity.setModule(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(dllalgfun entity, long rowId) {
        entity.setFun_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(dllalgfun entity) {
        if(entity != null) {
            return entity.getFun_id();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
