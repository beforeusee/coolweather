package com.example.zhengxiaohu.coolweather.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.zhengxiaohu.coolweather.db.County;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COUNTY".
*/
public class CountyDao extends AbstractDao<County, Long> {

    public static final String TABLENAME = "COUNTY";

    /**
     * Properties of entity County.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CountyName = new Property(1, String.class, "countyName", false, "COUNTY_NAME");
        public final static Property WeatherId = new Property(2, String.class, "weatherId", false, "WEATHER_ID");
        public final static Property CityId = new Property(3, int.class, "cityId", false, "CITY_ID");
    }


    public CountyDao(DaoConfig config) {
        super(config);
    }
    
    public CountyDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COUNTY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"COUNTY_NAME\" TEXT," + // 1: countyName
                "\"WEATHER_ID\" TEXT," + // 2: weatherId
                "\"CITY_ID\" INTEGER NOT NULL );"); // 3: cityId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COUNTY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, County entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String countyName = entity.getCountyName();
        if (countyName != null) {
            stmt.bindString(2, countyName);
        }
 
        String weatherId = entity.getWeatherId();
        if (weatherId != null) {
            stmt.bindString(3, weatherId);
        }
        stmt.bindLong(4, entity.getCityId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, County entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String countyName = entity.getCountyName();
        if (countyName != null) {
            stmt.bindString(2, countyName);
        }
 
        String weatherId = entity.getWeatherId();
        if (weatherId != null) {
            stmt.bindString(3, weatherId);
        }
        stmt.bindLong(4, entity.getCityId());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public County readEntity(Cursor cursor, int offset) {
        County entity = new County( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // countyName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // weatherId
            cursor.getInt(offset + 3) // cityId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, County entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCountyName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWeatherId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCityId(cursor.getInt(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(County entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(County entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(County entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
