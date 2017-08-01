package com.example.zhengxiaohu.coolweather.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by XiaoHu Zheng on 2017/8/1.
 * Email: 1050087728@qq.com
 */

@Entity
public class City {
    @Id(autoincrement = true)
    private Long id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    @Generated(hash = 1882008232)
    public City(Long id, String cityName, int cityCode, int provinceId) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
    }
    @Generated(hash = 750791287)
    public City() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCityName() {
        return this.cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return this.cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getProvinceId() {
        return this.provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }


}
