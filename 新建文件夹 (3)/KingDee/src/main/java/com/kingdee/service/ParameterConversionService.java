package com.kingdee.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by lucl on 2017/6/9.
 */
public interface ParameterConversionService {
    public Map<String, String> parameterToMap(HttpServletRequest request);
}
