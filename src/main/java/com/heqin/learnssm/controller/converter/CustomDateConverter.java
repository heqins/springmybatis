package com.heqin.learnssm.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;
// Converter<String, Date> Date是要转换的类型
public class CustomDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        // 实现将日期串转为日期类型 格式: yyyy-MM-dd HH:mm:ss
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(source);
        }catch(Exception e) {
            e.printStackTrace();
        }
        // 如果参数绑定失败，返回Null
        return null;
    }
}
