package com.example.zhengxiaohu.coolweather.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by XiaoHu Zheng on 2017/8/1.
 * Email: 1050087728@qq.com
 */

@Entity
public class County {
    @Id(autoincrement = true)
    private Long id;

    private String countyName;
    private String weatherId;
    private int cityId;

    @Generated(hash = 1088402961)
    public County(Long id, String countyName, String weatherId, int cityId) {
        this.id = id;
        this.countyName = countyName;
        this.weatherId = weatherId;
        this.cityId = cityId;
    }
    @Generated(hash = 1991272252)
    public County() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCountyName() {
        return this.countyName;
    }
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getWeatherId() {
        return this.weatherId;
    }
    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
    public int getCityId() {
        return this.cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    
}
