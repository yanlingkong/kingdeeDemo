package com.kingdee.utils;

import com.kingdee.configuration.properties.config.BaseProperties;
import com.kingdee.model.BpCustProsperctive;
import com.kingdee.model.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.HashMap;
import java.util.Map;

/**
 * User: liuc
 * Date: 2017/6/13
 * Time: 20:01
 */
public class WebClient2 {
    public  static String CHAR_UTF="UTF-8";

    public static String CODE_SUCCESS="0000";

    public static String CODE_FAILED="9999";

    @Autowired
    private BaseProperties baseProperties;
    /**
     * 页面提交
     * @param params
     * @param postURL
     * @param rep
     * @param charset
     */
    public static void urlResponse(Map<String, String> params, String postURL, HttpServletResponse rep, String charset){
        String url = null;
        try {
            url = UrlUtils.generateUrl(params,postURL,CHAR_UTF);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        WebClient.SendByUrl(rep, url,CHAR_UTF);
    }
    /**
     * 模拟post 提交 并返回 字符串
     * @param params
     * @return
     */
    public static String doPost(Map<String, Object> params,String postURL,String charset){
        String retdata="";

        if (!"".equals(charset) && charset != null){

        }else{
            charset= "UTF-8";
        }
        try {
            String param=UrlUtils.generateParams1(params,charset);
            if(param.contains("&")){
                param = param+"&API_VALUE=api";
            }else{
                param = "API_VALUE=api";
            }
            System.out.println("提交参数"+param);
            retdata= getWebContentByPost(postURL,param,charset,36000000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retdata;
    }
    /**
     * 模拟post 提交 并返回 字符串
     * @param params
     * @return
     */
    public static String doPost(Map<String, Object> params){
        //JsonResult jsonResult = new JsonResult();
        String postURL = Common.post_Url;   // 路径地址
        String charset = "UTF-8";	//编码格式
        String retdata="";
        if (!"".equals(charset) && charset != null){

        }else{
            charset= "UTF-8";
        }
        try {
            String param=UrlUtils.generateParams1(params,charset);
            if(param.contains("=")){
                param = param+"&API_VALUE=api";
            }else{
                param = "API_VALUE=api";
            }
            Map<String, Object> map = new HashMap<String, Object>();

            System.out.println("提交参数"+param);
            retdata= getWebContentByPost(postURL,param,charset,36000000);
            /*jsonResult.setCode(Constants.SUCCESS);
            jsonResult.setSuccess(true);
            jsonResult.setMsg("成功");
            jsonResult.setData(retdata);*/
        } catch (IOException e) {
            /*jsonResult.setCode(Constants.FAILD);
            jsonResult.setSuccess(false);
            jsonResult.setMsg(e.getMessage());*/
            e.getMessage();

        }
        return retdata;
    }

    /**
     * post 方式
     */
    public static String getWebContentByPost(String urlString, String data,
                                             final String charset, int timeout) throws IOException {
        if (urlString == null || urlString.length() == 0) {
            return null;
        }
        urlString = (urlString.startsWith("http://") || urlString
                .startsWith("https://")) ? urlString : ("http://" + urlString)
                .intern();
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // 设置是否向connection输出，因为这个是post请求，参数要放在 http正文内，因此需要设为true
        //设置所有的http连接自动处理重定向
        connection.setFollowRedirects(true);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        // Post 请求不能使用缓存
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        // connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Type",
                "application/x-www-form-urlencoded;charset="+charset);
        // 增加报头，模拟浏览器，防止屏蔽
        connection.setRequestProperty("User-Agent",
                "Mozilla/4.0 (compatible; MSIE 8.0; Windows vista)");
        // 只接受text/html类型，当然也可以接受图片,pdf,*/*任意
        connection.setRequestProperty("Accept", "*/*");// text/html
        connection.setConnectTimeout(timeout);
        connection.connect();
        DataOutputStream out = new DataOutputStream(connection
                .getOutputStream());
        // String content = data;//+URLEncoder.encode("中文 ", "utf-8");
        // out.writeBytes(content);
        byte[] content = data.getBytes(charset);// +URLEncoder.encode("中文 ",
        // "utf-8");
        out.write(content);
        out.flush();
        out.close();
        try {
            // 必须写在发送数据的后面
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                connection.getInputStream(), charset));
        String line;
        StringBuffer sb = new StringBuffer();
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\r\n");
        }
        if (reader != null) {
            reader.close();
        }
        if (connection != null) {
            connection.disconnect();
        }
        return sb.toString();
    }


}
