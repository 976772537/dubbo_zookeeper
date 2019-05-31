package com.drp.serve.serviceImp;


import com.drp.entity.DataBean;
import com.drp.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@com.alibaba.dubbo.config.annotation.Service
@Service
@Slf4j
public class DateServiceImp implements DataService {
    @Override
    public DataBean insertData(String name, String createTime, String content) {
        return new DataBean (name,createTime,content);
    }

    @Override
    public void readData(DataBean data) {
      log.info ("name : {} , createTime : {} , content : {}",data.getName ()
              ,data.getCreateTime (),data.getContent ());
    }
}
