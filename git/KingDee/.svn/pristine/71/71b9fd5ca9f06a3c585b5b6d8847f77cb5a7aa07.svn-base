package com.kingdee.utils.ftp;

import sun.net.ftp.FtpClient;
import sun.net.ftp.FtpProtocolException;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * Created by Administrator on 2017/3/22.
 */
public class FTPUtils {
    /**
     * 连接FTP
     * @param ip       连接ip
     * @param port     端口
     * @param user     用户名
     * @param password 密码
     * @return         ftp连接
     */
    public static FtpClient connectFTP(String ip, int port, String user, String password) {
        //创建ftp
        FtpClient ftp = null;
        try {
            //创建地址
            SocketAddress addr = new InetSocketAddress(ip, port);
            //连接
            ftp = FtpClient.create();
            ftp.connect(addr);
            ftp.setConnectTimeout(6000000);
            //登陆
            //ftp.login(user, null,password);
            ftp.login(user, password.toCharArray());
            ftp.setBinaryType();
        } catch (FtpProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ftp;
    }

    /**
     * ftp文件下载
     * @param localFile   保存的路径
     * @param ftpFile     要下载文件的路径
     * @param ftp
     */
    public static void download(String localFile, String ftpFile, FtpClient ftp) {
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            // 获取ftp上的文件
            is = ftp.getFileStream(ftpFile);
            File file = new File(localFile);
            byte[] bytes = new byte[1024];
            int i;
            fos = new FileOutputStream(file);
            while((i = is.read(bytes)) != -1){
                fos.write(bytes, 0, i);
            }
            System.out.println("download success!!");

        } catch (FtpProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null ) {
                    fos.close();
                }
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取文件流
     * @param ftpFile   ftp文件地址  aa/aa/aa/aa.txt
     * @param ftp
     * @return
     */
    public static InputStream getDownload(String ftpFile, FtpClient ftp) throws Exception {
        InputStream is = null;
            is = ftp.getFileStream(ftpFile);
            System.out.println("download success!!");

        return is;
    }

    /**
     * ftp文件上传 根据路径上传
     * @param localFile  aa.txt   要上传的文件路径
     * @param ftpFile    bb.txt   要保存在ftp的文件路径
     * @param fileName   cc.txt   要保存的文件名
     * @param ftp
     */
    public static void upload(String localFile, String ftpFile, FtpClient ftp,String fileName) {
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            // 将ftp文件加入输出流中。输出到ftp上
            boolean flag = isExists(ftp,ftpFile);
            if (!flag){//不存在，创建目录
                ftp.makeDirectory(ftpFile);
            }
            os = ftp.putFileStream(ftpFile+"/"+fileName);
            File file = new File(localFile);
            // 创建一个缓冲区
            fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int c;
            while((c = fis.read(bytes)) != -1){
                os.write(bytes, 0, c);
            }
            System.out.println("upload success!!");
        } catch (FtpProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(os!=null) {
                    os.close();
                }
                if(fis!=null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * ftp文件上传
     * @param inputStream    要上传的文件路径，以流的形式
     * @param ftpFile    bb.txt   要保存在ftp的文件路径
     * @param fileName   cc.txt   要保存的文件名
     * @param ftp
     */
    public static void upload(InputStream inputStream, String ftpFile, FtpClient ftp,String fileName) {
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            // 将ftp文件加入输出流中。输出到ftp上
            boolean flag = isExists(ftp,ftpFile);
            if (!flag){//不存在，创建目录
                ftp.makeDirectory(ftpFile);
            }
            os = ftp.putFileStream(ftpFile+"/"+fileName);
            // 创建一个缓冲区
            byte[] bytes = new byte[1024];
            int c;
            while((c = inputStream.read(bytes)) != -1){
                os.write(bytes, 0, c);
            }
            System.out.println("upload success!!");
        } catch (FtpProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(os!=null) {
                    os.close();
                }
                if(fis!=null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 判断目录是否存在，不存在则创建目录
     * @param ftp      ftp连接信息
     * @param ftpFile  ftp路径
     * @return  true:该路径存在，false：该路径不存在
     */
    public static boolean isExists(FtpClient ftp,String ftpFile){
        boolean flag = false;
        try {
            ftp.makeDirectory(ftpFile);
            flag = true;
        } catch (Exception e) {
            flag = true;
        }
        return flag;
    }
}
