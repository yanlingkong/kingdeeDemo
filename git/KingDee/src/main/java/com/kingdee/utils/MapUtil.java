package com.kingdee.utils;

import java.lang.reflect.Field;
import java.util.*;

/**
 * User: liuc
 * Date: 2017/6/14
 * Time: 10:41
 */
public class MapUtil {

    /**
     * 对象转map对象
     * @param obj
     * @return
     */
    public static Map<?,?> objectToMap(Object obj) throws  Exception{
        Map<String,Object> reMap = new HashMap<String,Object>();
        if (obj == null)
            return null;
        String objName = obj.getClass().getSimpleName().replaceFirst(obj.getClass().getSimpleName().substring(0,1),obj.getClass().getSimpleName().substring(0,1).toLowerCase());
        Field[] fields = obj.getClass().getDeclaredFields();
        try {
            for(int i=0;i<fields.length;i++){
                try {
                    Field f = obj.getClass().getDeclaredField(fields[i].getName());
                    f.setAccessible(true);
                    Object o = f.get(obj);
                    reMap.put(objName+"."+fields[i].getName(), o);
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        return reMap;
    }
}
