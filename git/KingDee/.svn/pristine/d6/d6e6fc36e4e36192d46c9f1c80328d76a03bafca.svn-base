package com.kingdee.utils;

import com.kingdee.model.BpCustProsperctive;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

public class UrlUtils {
	
	public static String generateUrl(Map<String, String> params,String SubmitURL,String charset) throws UnsupportedEncodingException{
		int flag=0;
		StringBuffer url=new StringBuffer(SubmitURL);
		url.append("?");
		Iterator iter = params.entrySet().iterator(); 
		while (iter.hasNext()) { 
		    Map.Entry entry = (Map.Entry) iter.next(); 
		    Object key = entry.getKey(); 
		    Object val = entry.getValue(); 
		    if(flag==0){
		    	url.append(key);
		    	url.append("=");
		    	if(charset!=null&&!charset.equals("")){
		    	url.append(URLEncoder.encode(val.toString(), "UTF-8"));
		    	}else{
		    		url.append(val.toString());
		    	}
		    	flag++;
		    }else{
		    	url.append("&");
		    	url.append(key);
		    	url.append("=");
		    	if(charset!=null&&!charset.equals("")){
			    	url.append(URLEncoder.encode(val.toString(), "UTF-8"));
			    	}else{
			    		url.append(val.toString());
			    	}
		    }
		} 
		return url.toString();
	}
	
	public static String generateParams(Map<String, String> params,String charset) throws UnsupportedEncodingException{
		int flag=0;
		StringBuffer ret=new StringBuffer();
		Iterator iter = params.entrySet().iterator(); 
		while (iter.hasNext()) { 
		    Map.Entry entry = (Map.Entry) iter.next(); 
		    Object key = entry.getKey(); 
		    Object val = entry.getValue(); 
		    if(val!=null){
		    if(flag==0){
		    	ret.append(key);
		    	ret.append("=");
		    	if(charset!=null&&!charset.equals("")){
		    	ret.append(URLEncoder.encode(val.toString(), charset));
		    	}else{
		    		ret.append(val.toString());
		    	}
		    	flag++;
		    }else{
		    	ret.append("&");
		    	ret.append(key);
		    	ret.append("=");
		    	if(charset!=null&&!charset.equals("")){
			    	ret.append(URLEncoder.encode(val.toString(), charset));
			    	}else{
			    		ret.append(val.toString());
			    	}
		    }
		    }
		} 
		return ret.toString();
	}
	public static String generateParams1(Map<String, Object> params, String charset) throws UnsupportedEncodingException{
		int flag=0;
		StringBuffer ret=new StringBuffer();
		Iterator iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			if(val!=null){
				if(flag==0){
					ret.append(key);
					ret.append("=");
					if(charset!=null&&!charset.equals("")){
						ret.append(URLEncoder.encode(val.toString(), charset));
					}else{
						ret.append(val.toString());
					}
					flag++;
				}else{
					ret.append("&");
					ret.append(key);
					ret.append("=");
					if(charset!=null&&!charset.equals("")){
						ret.append(URLEncoder.encode(val.toString(), charset));
					}else{
						ret.append(val.toString());
					}
				}
			}
		}
		return ret.toString();
	}
}
