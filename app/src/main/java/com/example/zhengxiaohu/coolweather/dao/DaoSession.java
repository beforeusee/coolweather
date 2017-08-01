package com.example.zhengxiaohu.coolweather.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.zhengxiaohu.coolweather.db.Province;
import com.example.zhengxiaohu.coolweather.db.County;
import com.example.zhengxiaohu.coolweather.db.City;

import com.example.zhengxiaohu.coolweather.dao.ProvinceDao;
import com.example.zhengxiaohu.coolweather.dao.CountyDao;
import com.example.zhengxiaohu.coolweather.dao.CityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig provinceDaoConfig;
    private final DaoConfig countyDaoConfig;
    private final DaoConfig cityDaoConfig;

    private final ProvinceDao provinceDao;
    private final CountyDao countyDao;
    private final CityDao cityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        provinceDaoConfig = daoConfigMap.get(ProvinceDao.class).clone();
        provinceDaoConfig.initIdentityScope(type);

        countyDaoConfig = daoConfigMap.get(CountyDao.class).clone();
        countyDaoConfig.initIdentityScope(type);

        cityDaoConfig = daoConfigMap.get(CityDao.class).clone();
        cityDaoConfig.initIdentityScope(type);

        provinceDao = new ProvinceDao(provinceDaoConfig, this);
        countyDao = new CountyDao(countyDaoConfig, this);
        cityDao = new CityDao(cityDaoConfig, this);

        registerDao(Province.class, provinceDao);
        registerDao(County.class, countyDao);
        registerDao(City.class, cityDao);
    }
    
    public void clear() {
        provinceDaoConfig.clearIdentityScope();
        countyDaoConfig.clearIdentityScope();
        cityDaoConfig.clearIdentityScope();
    }

    public ProvinceDao getProvinceDao() {
        return provinceDao;
    }

    public CountyDao getCountyDao() {
        return countyDao;
    }

    public CityDao getCityDao() {
        return cityDao;
    }

}
