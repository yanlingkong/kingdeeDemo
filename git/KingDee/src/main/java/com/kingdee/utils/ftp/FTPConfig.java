package com.kingdee.utils.ftp;

/**
 * Created by Administrator on 2017/3/22.
 */
public class FTPConfig {
    /**
     *  主机ip
     */
    private String ftpHost ;
    /**
     * 端口号
     */
    private int ftpPort;
    /**
     * ftp用户名
     */
    private String ftpUser;
    /**
     * ftp密码
     */
    private String ftpPassword;
    /**
     * ftp中的目录
     */
    private String ftpPath;

    public String getFtpHost() {
        return ftpHost;
    }

    public int getFtpPort() {
        return ftpPort;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public String getFtpPath() {
        return ftpPath;
    }
}
