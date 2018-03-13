package com.kingdee.utils;


import com.kingdee.configuration.properties.config.BaseProperties;
import com.kingdee.model.JsonResult;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * 模拟web提交
 */
public class WebClient {

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
	public static void urlResponse(Map<String, String> params,String postURL,HttpServletResponse rep,String charset){
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
	public static String doPost(Map<String, String> params,String postURL,String charset){
		String retdata="";

		if (!"".equals(charset) && charset != null){

		}else{
			charset= "UTF-8";
		}
		try {
			String param=UrlUtils.generateParams(params,charset);
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
	public static String doPost(Map<String, String> params){
		//JsonResult jsonResult = new JsonResult();
		String postURL = Common.post_Url;   // 路径地址
		String charset = "UTF-8";	//编码格式
		String retdata="";
		if (!"".equals(charset) && charset != null){

		}else{
			charset= "UTF-8";
		}
		try {
			String param=UrlUtils.generateParams(params,charset);
			if(param.contains("=")){
				param = param+"&API_VALUE=api";
			}else{
				param = "API_VALUE=api";
			}
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

	public static void SendByUrl(HttpServletResponse response,String url,String charSet) {
		if(response!=null){
			try {
				response.setContentType("text/html;charset="+charSet+"");
				response.setCharacterEncoding(charSet);
				response.sendRedirect(url);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 
	/**
	 * get方式
	 */
	public static String getWebContentByGet(String urlString, final String charset,  
            int timeout) throws IOException {  
        if (urlString == null || urlString.length() == 0) {  
            return null;  
        }  
        urlString = (urlString.startsWith("http://") || urlString  
                .startsWith("https://")) ? urlString : ("http://" + urlString)  
                .intern();  
        URL url = new URL(urlString);  
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();  
        conn.setRequestMethod("GET");  
        // 增加报头，模拟浏览器，防止屏蔽  
        conn.setRequestProperty(  
                        "User-Agent",  
                        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");  
        // 只接受text/html类型，当然也可以接受图片,pdf,*/*任意，就是tomcat/conf/web里面定义那些  
        conn.setRequestProperty("Accept", "*/*");  
        conn.setConnectTimeout(timeout);  
        try {  
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {  
                return null;  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
            return null;  
        }  
        InputStream input = conn.getInputStream();  
        BufferedReader reader = new BufferedReader(new InputStreamReader(input,charset));  
        String line = null;  
        StringBuffer sb = new StringBuffer();  
        while ((line = reader.readLine()) != null) {  
            sb.append(line);  
        }  
        if (reader != null) {  
            reader.close();  
        }  
        if (conn != null) {  
            conn.disconnect();  
        }  
        return sb.toString();  
  
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
	
	public static void tetsPost(String URL ,String port) throws HttpException, IOException{
		 HttpClient httpClient = new HttpClient();

	PostMethod postMethod = new PostMethod(URL);
	// 填入各个表单域的值
	NameValuePair[] data = { new NameValuePair("id", "youUserName"),
	new NameValuePair("passwd", "yourPwd") };
	// 将表单的值放入postMethod中
	postMethod.setRequestBody(data);
	// 执行postMethod
	int statusCode = httpClient.executeMethod(postMethod);
	// HttpClient对于要求接受后继服务的请求，象POST和PUT等不能自动处理转发
	// 301或者302
	if (statusCode == HttpStatus.SC_MOVED_PERMANENTLY || 
	statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {
	    // 从头中取出转向的地址
	    Header locationHeader = postMethod.getResponseHeader("location");
	    String location = null;
	    if (locationHeader != null) {
	     location = locationHeader.getValue();
	     System.out.println("The page was redirected to:" + location);
	     PostMethod postMethod2 = new PostMethod(location);
	     httpClient.executeMethod(postMethod2);
	    } else {
	     System.err.println("Location field value is null.");
	    }
	    return;
	}}
	

	/**
	 * 发送post请求
	 * 
	 * @param strURL
	 * @param req
	 * @return
	 */
	public static String[] doPostQueryCmd(String strURL, Map<String, String> req)
	{
		String returncode = null;
		String result = null;
		String[] resultarr = new String[2];
		try
		{
			// 构造HttpClient的实例
			HttpClient httpClient = new HttpClient();
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000);
			// 创建GET方法的实例
			PostMethod postMethod = new PostMethod(strURL);
			// 使用系统提供的默认的恢复策略
			postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
			postMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			postMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT,5000);
			NameValuePair[] param = new NameValuePair[req.size()];
			int i = 0;
			for (Map.Entry<String, String> entry : req.entrySet())
			{
				param[i] = new NameValuePair(entry.getKey(), entry.getValue());
				i++;
			}
			postMethod.setRequestBody(param);
			try
			{
				// 执行getMethod
				int statusCode = httpClient.executeMethod(postMethod);
				returncode = Integer.toString(statusCode);
				// if (statusCode != HttpStatus.SC_OK)
				// {
				// System.err.println("Method failed: " + postMethod.getStatusLine());
				// }
				// else
				// {
				//					
				// }
				// 读取内容
				// byte[] responseBody = postMethod.getResponseBody();
				// result = postMethod.getResponseBodyAsString();
				// 处理内容
				// result = new String(responseBody, "UTF-8");
				// System.out.println(result);
				
				StringBuffer sb = new StringBuffer();
				InputStream in = postMethod.getResponseBodyAsStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
				String line;
				while ((line = br.readLine()) != null)
				{
					sb.append(line);
				}
				result = sb.toString();
				if (br != null)
				{
					br.close();
				}
			}
			catch (HttpException e)
			{
				// 发生致命的异常，可能是协议不对或者返回的内容有问题
				// System.out.println("Please check your provided http address!");
				// e.printStackTrace();
			}
			catch (IOException e)
			{
				// 发生网络异常
				// e.printStackTrace();
			}
			finally
			{
				// 释放连接
				postMethod.releaseConnection();
			}
		}
		catch (Exception ex)
		{
			//ex.printStackTrace();
		}
		if (result == null)
		{
			result = "";
		}
		
		resultarr[0] = returncode;
		resultarr[1] = result;
		
		return resultarr;
	}
	
	/**
	 * HttpClient    模拟post提交 并完成重定向
	 * @param response
	 * @param url
	 * @param params
	 * @param charset
	 * @return
	 */
	public static String sendUrl(HttpServletResponse response,String url,Map<String, String> params ,String charset){
		try{
			HttpClient client =new HttpClient();
			String responseString="";
			PostMethod xmlpost;
			int statusCode = 0;
			//client.setConnectionTimeout(new Integer(1200).intValue());
	 	    xmlpost = new PostMethod(url);
	 	    client.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, charset);
	 	    List<NameValuePair> list = new ArrayList<NameValuePair>(); 
	 	    Iterator iter = params.entrySet().iterator(); 
	 	    while (iter.hasNext()) {
	 	    	 Map.Entry entry = (Map.Entry) iter.next(); 
	 	    	 System.out.println("entry.getKey().toString()==="+entry.getKey().toString()+"    entry.getValue().toString()==="+entry.getValue().toString());
	 		     NameValuePair nvp=new NameValuePair(entry.getKey().toString(),entry.getValue().toString());
	 		     list.add(nvp);
	 	    }
	 	   NameValuePair[] nvps=new NameValuePair[list.size()];
	 	   xmlpost.setRequestBody(list.toArray(nvps)); 
	 	   statusCode = client.executeMethod(xmlpost);
	 	 int statusCodes = xmlpost.getStatusCode();
	 	  System.out.println("statusCode=="+statusCodes);	
	 	 System.out.println("responseString:"+ responseString); 
	       if(statusCode<HttpURLConnection.HTTP_OK || statusCode>=HttpURLConnection.HTTP_MULT_CHOICE){
	           System.err.println("失败返回码[" + statusCode + "]");
	           throw new Exception("请求接口失败，失败码[ "+ statusCode +" ]");
	       }else if(statusCode== 302){
	    	   String tmpString = xmlpost.getResponseHeader("location").getValue();
	    	   GetMethod redirect = new GetMethod(tmpString);
               client.executeMethod(redirect);
                System.out.println("Redirect:"+ redirect.getStatusLine().toString()); 
                redirect.releaseConnection();
	       }
		}catch(Exception e){
			e.printStackTrace();
		}
		
 	   
		return null;
	}
	
	
	/**
	 * 准备中间页面所需参数
	 * add by linyan  2014-9-22
	 * @param url
	 * @param params
	 * @param charset
	 * @return
	 */
	public static String[] operateParameter(String url,Map<String, String> params,String charset){
		String[] ret=new String[2];
		if(url!=null&&!"".equals(url)){
			if(charset!=null&&!"".equals(charset)){
				StringBuffer sb=new StringBuffer();
				String parameterUtil=getParams(params,charset);
				sb.append("<html>");
				sb.append("<head>");
				sb.append("<script type=\"text/javascript\">");
				sb.append("function redirectUrl() {");
				sb.append("document.form0.submit();");
				sb.append("}");
				sb.append("</script>");
				sb.append("</head>");
				sb.append("<body onload=\"redirectUrl()\">");
				sb.append("<form name=\"form0\" action=\""+url+"\" method=\"post\">");
				if(parameterUtil!=null){
					sb.append(parameterUtil);
				}
				sb.append("</form>");
				sb.append("</body>");
				sb.append("</html>");
				ret[0]=CODE_SUCCESS;
				ret[1]=sb.toString();
				System.out.println("sb.toString()=="+sb.toString());
			}else{
				ret[0]=CODE_FAILED;
				ret[1]="form表单编码方式不存在";
			}
		}else{
			ret[0]=CODE_FAILED;
			ret[1]="第三方url不存在";
		}
		
		
		return ret;
	}
	/**
	 * 获取中间页面的form表单参数
	 * @param params
	 * @return
	 */
	private static String getParams(Map<String, String> params,String charset) {
		// TODO Auto-generated method stub
		String htmlParamss=null;
		try{
			if(params!=null){
				StringBuffer sb=new StringBuffer();
				Iterator iter = params.entrySet().iterator(); 
				while (iter.hasNext()) { 
				    Map.Entry entry = (Map.Entry) iter.next(); 
				    Object key = entry.getKey(); 
				    Object val = entry.getValue(); 
				    System.out.println("key="+key+"-----value="+val);
				    sb.append("<input type=\"hidden\" name='"+key.toString()+"\' value='"+val.toString()+"' />");
				} 
				htmlParamss=sb.toString();
				System.out.println("htmlParamss=="+htmlParamss);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return htmlParamss;
	}




}