package com.icinfo.testjiraview.pojo;

/**
 * Description：
 * <p>
 * Created with IntelliJ IDEA.
 * User：wang wencong
 * Date：2017/5/18
 * Time：9:09
 * Copyright© 2003-2016 Zhejiang huixin technology company
 */
public class jiraUser {

    private String role;
    private String devName;
    private String disName;



    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
    public String getRole() {
        return role;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }
    public String getDevName() {
        return devName;
    }

    public void setDisName(String disName) {
        this.disName = disName == null ? null : disName.trim();
    }
    public String getDisName() {
        return disName;
    }

}
