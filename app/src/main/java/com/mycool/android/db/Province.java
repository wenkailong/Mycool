package com.mycool.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 狼性人生有点狂 on 2018/6/12.
 */

public class Province extends DataSupport {
    private  int id;
    private  String provinceName;

    private  int provinceCode;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getProvinceName () {
        return provinceName;
    }

    public void setProvinceName (String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode () {
        return provinceCode;
    }

    public void setProvinceCode (int provinceCode) {
        this.provinceCode = provinceCode;
    }



}
