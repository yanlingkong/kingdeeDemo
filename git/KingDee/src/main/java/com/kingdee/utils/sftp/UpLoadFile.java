package com.kingdee.utils.sftp;
import com.jcraft.jsch.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/22.
 */
public class UpLoadFile {
    private static Logger log = LoggerFactory.getLogger(UpLoadFile.class);
    private static ChannelSftp sftp = null;
    public static ChannelSftp connect(Session session) {
        Channel channel = null;
        try {
            channel = (Channel) session.openChannel("sftp");
            channel.connect(10000000);
            sftp = (ChannelSftp) channel;
        }catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return sftp;
    }
    /**
     * 根据文件地址上传文件
     * @param session
     * @param filePath   要上传文件的全路径
     * @param dPath      要保存文件的地址
     * @author ADMIN
     * @date 2017-3-17
     */
    /*public static void upload(Session session,String filePath,String dPath) {
//	        List<String> fileList = this.getFileEntryList(filePath);
        try {
            String localFile = filePath;
            File file = new File(localFile);
            String fileName = file.getName();
            //文件名称前加时间
            //fileName = System.currentTimeMillis()+fileName;

            if(file.isFile()){
                System.out.println("localFile : " + file.getAbsolutePath());
                String remoteFile = dPath + "/" + fileName;
                System.out.println("remotePath:" + remoteFile);
                File rfile = new File(remoteFile);
                String rpath = rfile.getParent();
                try {
                    createDir(rpath, sftp);
                   // createDirtest(rpath, sftp);
                } catch (Exception e) {
                    System.out.println("*******create path failed" + rpath);
                }

                sftp.put(new FileInputStream(file), fileName);
                System.out.println("=========upload down for " + localFile);
            }else{
                System.out.println("=========upload reason : 上传文件不存在");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SftpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }*/
    /**
     * 根据文件地址上传文件
     * @param session
     * @param filePath   要上传文件的全路径
     * @param dPath      要保存文件的地址
     * @author ADMIN
     * @date 2017-3-17
     * Session session,String filePath,String dPath
     */
    public static void upload(Session session,String filePath,String dPath) {
        try {
             File file = new File(filePath);
            if (file.isFile()) {
                // System.out.println("localFile : " + file.getAbsolutePath());
                String rpath = dPath; // 服务器需要创建的路径
                try {
                    createDir(rpath, sftp);
                } catch (Exception e) {
                    System.out.println("创建路径失败：" + rpath);
                }
                // this.sftp.rm(file.getName());
                sftp.cd(dPath);
                sftp.put(new FileInputStream(file), file.getName());
            }
        } catch (FileNotFoundException e) {
            System.out.println("上传文件没有找到");
            log.error("上传文件没有找到"+e.getMessage(),e);
        } catch (SftpException e) {
            System.out.println("上传ftp服务器错误");
            log.error("上传ftp服务器错误"+e.getMessage(),e);
        }
    }

    /**
     * 以文件流的形式向sftp传入文件
     * @param session       sftp会话
     * @param inputStream   文件输入流，
     * @param dPath         要上传的路径
     * @param fileName      文件名+后缀，例如：aa.jpg
     */
    public static void upload(Session session, InputStream inputStream,String dPath,String fileName) {
        try {
            if(inputStream != null){
                String remoteFile = dPath + "/" + fileName;
                log.info("remotePath:" + remoteFile);
                File file = new File(remoteFile);
                //String path = file.getParent();
                //try {
                    log.info("sfpt 开始创建文件夹！路径为："+dPath);
                    createDir(dPath, sftp);
                    log.info("sfpt 创建文件夹成功！路径为："+dPath);
                //} catch (Exception e) {
                  //  System.out.println("*******create path failed" + file);
               // }
                sftp.cd(dPath);
                sftp.put(inputStream, fileName);
                log.info("=========upload down for " + file.getAbsolutePath());
            }else{
                log.info("=========upload reason : 上传文件不存在");
            }
        } catch (Exception e) {
            log.info("=========upload reason : 上传失败");
            log.error("error:"+e.getMessage(),e);
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                    log.info("文件输入流关闭成功！");
                }
            } catch (IOException e) {
                log.error("error:"+e.getMessage(),e);
                //e.printStackTrace();
            }
        }
    }
    /**
     * get all the files need to be upload or download
     * @param file
     * @return
     */
    private List<String> getFileEntryList(String file){
        ArrayList<String> fileList = new ArrayList<String>();
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            InputStreamReader inreader = new InputStreamReader(in);

            LineNumberReader linreader = new LineNumberReader(inreader);
            String filepath = linreader.readLine();
            while(filepath != null){
                fileList.add(filepath);
                filepath = linreader.readLine();
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(in != null){
                in = null;
            }
        }
        return fileList;
    }
    /**
     * create Directory
     * @param filepath
     * @param sftp
     */
    private static void createDir(String filepath, ChannelSftp sftp){
        boolean bcreated = false;
        boolean bparent = false;
        File file = new File(filepath);
        String ppath = file.getParent();
        try {
            sftp.cd(ppath);
            bparent = true;
        } catch (SftpException e1) {
            bparent = false;
        }
        try {
            if(bparent){
                try {
                    sftp.cd(filepath);
                    bcreated = true;
                } catch (Exception e) {
                    bcreated = false;
                }
                if(!bcreated){
                    sftp.mkdir(filepath);
                    bcreated = true;
                }
                return;
            }else{
                createDir(ppath,sftp);
                sftp.cd(ppath);
                sftp.mkdir(filepath);
            }
        } catch (SftpException e) {
           // System.out.println("mkdir failed :" + filepath);
            //e.printStackTrace();
            log.info("mkdir failed :" + filepath);
            log.error("error:"+e.getMessage(),e);
        }

        try {
            sftp.cd(filepath);
        } catch (SftpException e) {
            e.printStackTrace();
            log.info("can not cd into :" + filepath);
        }
    }
    /**
     * 下载文件
     * @param directory 下载目录
     * @param downloadFile 下载的文件
     * @param saveFile 存在本地的路径
     * @param sftp
     */
    public static void download(String directory, String downloadFile,String saveFile, ChannelSftp sftp) {
        try {
            sftp.cd(directory);
            File file=new File(saveFile);
            FileOutputStream fileOutputStream=new   FileOutputStream(file);
            sftp.get(downloadFile, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            log.error("error:"+e.getMessage(),e);
        }
    }

    /**
     *
     * @param directory
     * @param sftp
     * @return
     */
    public static InputStream getStreamDownload(String directory,ChannelSftp sftp) throws Exception{
        InputStream is =  sftp.get(directory);
        return is;
    }




    /**
     * 创建一个文件目录
     */
    public static void createDirtest(String createpath, ChannelSftp sftp) {
        try {
            if (isDirExist(createpath)) {
                sftp.cd(createpath);
            }
            String pathArry[] = createpath.split("\"");
            //String pathArry[]  = new String[]{"aaaa","aasdad"};
            StringBuffer filePath = new StringBuffer("\"");
            for (String path : pathArry) {
                if (path.equals("")) {
                    continue;
                }
                filePath.append(path + "/");
                if (isDirExist(filePath.toString())) {
                    sftp.cd(filePath.toString());
                } else {
                    // 建立目录
                    sftp.mkdir(filePath.toString());
                    // 进入并设置为当前目录
                    sftp.cd(filePath.toString());
                }
            }
            sftp.cd(createpath);
        } catch (SftpException e) {
            log.error("error:"+e.getMessage(),e);
        }
    }

    /**
     * 判断目录是否存在
     */
    public static boolean isDirExist(String directory) {
        boolean isDirExistFlag = false;
        try {
            SftpATTRS sftpATTRS = sftp.lstat(directory);
            isDirExistFlag = true;
            return sftpATTRS.isDir();
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().equals("no such file")) {
                isDirExistFlag = false;
            }
        }
        return isDirExistFlag;
    }
}
