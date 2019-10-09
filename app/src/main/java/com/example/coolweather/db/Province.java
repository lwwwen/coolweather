package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;

    private String provinceCode;

    private String provinceName;

    public int getId(){
        return id;
    }

    public String getProvinceCode(){
        return provinceCode;
    }

    public String getProvinceName(){
        return provinceName;
    }


    public void setId(int id){
        this.id=id;
    }

    public void setProvinceCode(String provinceCode){
        this.provinceCode=provinceCode;
    }

    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
}
