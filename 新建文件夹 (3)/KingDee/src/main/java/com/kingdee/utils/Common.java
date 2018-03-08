package com.kingdee.utils;

import org.nutz.dao.entity.annotation.Comment;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by lucl on 2017/6/7.
 */
@Comment
public class Common {
    public static String post_Url = "";   //请求erp项目路径
    @Value("${common.charset}")
    public static String charset;
}
