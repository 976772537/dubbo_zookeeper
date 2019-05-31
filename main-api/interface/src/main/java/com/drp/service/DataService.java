package com.drp.service;

import com.drp.entity.DataBean;

import java.util.Date;

public interface DataService {
    DataBean insertData(String name , String createTime , String content);

    void readData(DataBean data);
}
