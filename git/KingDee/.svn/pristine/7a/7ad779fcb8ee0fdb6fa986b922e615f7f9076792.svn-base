package com.kingdee.utils.sftp;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.Console;
/**
 * Created by Administrator on 2017/3/22.
 */
public class SftpLogin {
    /**
     * 获取登录会话
     * @param ip   ip地址
     * @param user  用户名
     * @param pwd   密码
     * @param port  端口号
     * @return
     */
    public static Session login(String ip,String user,String pwd,String port) {

//        String ip = properties.getProperty("sftp_ip");
//        String user = properties.getProperty("sftp_user");
//        String pwd = properties.getProperty("sftp_pwd");
//        String port = properties.getProperty("sftp_port");
//        String privateKeyPath = properties.getProperty("privateKeyPath");
//        String passphrase = properties.getProperty("passphrase");
//        String sourcePath = properties.getProperty("sourcePath");
//        String destinationPath = properties.getProperty("destinationPath");

//	    	String ip = "113.108.233.40";
//	        String user = "abcdsftp";
//	        String pwd = "9fKYkjKH";
//	        String port = "763";
        String privateKeyPath = null;
        String passphrase = null;
        String sourcePath = null;
        String destinationPath = null;
        Session session = null;
        if (ip != null && !ip.equals("") && user != null && !user.equals("")
                && port != null && !port.equals("")/*&& destinationPath != null
	                && !destinationPath.equals("")*/) {

            if (privateKeyPath != null && !privateKeyPath.equals("")) {
                session = sshSftp2(ip, user, Integer.parseInt(port), privateKeyPath,
                        passphrase, sourcePath, destinationPath);
            } else if (pwd != null && !pwd.equals("")) {
                session = sshSftp(ip, user, pwd, Integer.parseInt(port), sourcePath,
                        destinationPath);
            } else {
                Console console = System.console();
                System.out.print("Enter password:");
                char[] readPassword = console.readPassword();
                session = sshSftp(ip, user, new String(readPassword),
                        Integer.parseInt(port), sourcePath, destinationPath);
            }
        } else {
            System.out.println("请先设置配置文件");
        }
        return session;
    }

    /**
     * 密码方式登录
     *
     * @param ip
     * @param user
     * @param psw
     * @param port
     * @param sPath
     * @param dPath
     */
    public static Session sshSftp(String ip, String user, String psw, int port,
                                  String sPath, String dPath) {
        System.out.println("password login");
        Session session = null;

        JSch jsch = new JSch();
        try {
            if (port <= 0) {
                // 连接服务器，采用默认端口
                session = jsch.getSession(user, ip);
            } else {
                // 采用指定的端口连接服务器
                session = jsch.getSession(user, ip, port);
            }

            // 如果服务器连接不上，则抛出异常
            if (session == null) {
                throw new Exception("session is null");
            }

            // 设置登陆主机的密码
            session.setPassword(psw);// 设置密码
            // 设置第一次登陆的时候提示，可选值：(ask | yes | no)
            session.setConfig("StrictHostKeyChecking", "no");
           // session.setConfig("userauth.gssapi-with-mic", "no");
            // 设置登陆超时时间
            session.connect(300000);
//	                             上传文件
//	            UpLoadFile.upLoadFile(session, sPath, dPath);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("success");
        return session;
    }

    /**
     * 密匙方式登录
     *
     * @param ip
     * @param user
     * @param port
     * @param privateKey
     * @param passphrase
     * @param sPath
     * @param dPath
     */
    public static Session sshSftp2(String ip, String user, int port,
                                   String privateKey, String passphrase, String sPath, String dPath) {
        System.out.println("privateKey login");
        Session session = null;
        JSch jsch = new JSch();
        try {
            // 设置密钥和密码
            // 支持密钥的方式登陆，只需在jsch.getSession之前设置一下密钥的相关信息就可以了
            if (privateKey != null && !"".equals(privateKey)) {
                if (passphrase != null && "".equals(passphrase)) {
                    // 设置带口令的密钥
                    jsch.addIdentity(privateKey, passphrase);
                } else {
                    // 设置不带口令的密钥
                    jsch.addIdentity(privateKey);
                }
            }
            if (port <= 0) {
                // 连接服务器，采用默认端口
                session = jsch.getSession(user, ip);
            } else {
                // 采用指定的端口连接服务器
                session = jsch.getSession(user, ip, port);
            }
            // 如果服务器连接不上，则抛出异常
            if (session == null) {
                throw new Exception("session is null");
            }
            // 设置第一次登陆的时候提示，可选值：(ask | yes | no)
            session.setConfig("StrictHostKeyChecking", "no");
            // 设置登陆超时时间
            session.connect(300000);
//	            UpLoadFile.upLoadFile(session, sPath, dPath);
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }
}
