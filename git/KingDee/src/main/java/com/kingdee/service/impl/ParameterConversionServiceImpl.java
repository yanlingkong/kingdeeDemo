package com.kingdee.service.impl;

import com.kingdee.service.ParameterConversionService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lucl on 2017/6/9.
 */
@Service("parameterConversionService")
public class ParameterConversionServiceImpl implements ParameterConversionService {

    @Override
    public Map<String, String> parameterToMap(HttpServletRequest request){
        Map<String, String> map = new HashMap<String,String>();
        Enumeration enume = request.getParameterNames();
        while(enume.hasMoreElements()){
            String   paramName=(String)enume.nextElement();
            String[]   values=request.getParameterValues(paramName);
            if(values!=null&&values.length>0){
                for(String value:values){
                    map.put(paramName,value);
                }
            }
        }
        return map;
    }
}
