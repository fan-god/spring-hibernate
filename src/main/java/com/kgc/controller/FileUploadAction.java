package com.kgc.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by  王帆 on 2017/2/26.
 */
public class FileUploadAction extends ActionSupport {
    private File pic;
    private String picContentType;
    private String picFileName;
    private UUID randomName;

    public UUID getRandomName() {
        return randomName;
    }

    public void setRandomName(UUID randomName) {
        this.randomName = randomName;
    }

    public File getPic() {

        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public String getPicContentType() {
        return picContentType;
    }

    public void setPicContentType(String picContentType) {
        this.picContentType = picContentType;
    }

    public String getPicFileName() {
        return picFileName;
    }

    public void setPicFileName(String picFileName) {
        this.picFileName = picFileName;
    }

    @Override
    public String execute() throws Exception {
        //根目录
        String rootPath = ServletActionContext.getServletContext().getRealPath("/");
        //上传之后的路径
        randomName = UUID.randomUUID();
        String newFileName = rootPath+"upload/"+ randomName+picFileName;
        System.out.println(newFileName);
        File destFile = new File(newFileName);
        try {
            FileUtils.copyFile(pic,destFile);
        }catch (IOException e){
            e.printStackTrace();
            this.addActionMessage("文件上传失败！"+e.getMessage());
            return ERROR;
        }
        this.addActionMessage("文件上传成功！");
        return SUCCESS;
    }
}
