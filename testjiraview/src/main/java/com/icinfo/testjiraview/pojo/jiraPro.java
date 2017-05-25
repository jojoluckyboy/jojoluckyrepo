package com.icinfo.testjiraview.pojo;

/**
 * Description：
 * <p>
 * Created with IntelliJ IDEA.
 * User：wang wencong
 * Date：2017/5/10
 * Time：11:04
 * Copyright© 2003-2016 Zhejiang huixin technology company
 */
public class jiraPro {
    private String project;
    private Integer xj = 0;
    private Integer gb = 0;
    private Integer dqr= 0;
    private Integer yc = 0;
    private Integer dk = 0;
    private Integer jj = 0;
    private Integer zh = 0;

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }
    public String getProject() {
        return project;
    }

    public void setXj(Integer xj) {
        this.xj = xj;
    }
    public Integer getXj() {
        return xj;
    }

    public void setGb(Integer gb) {
        this.gb = gb== null ? 0 : gb;
    }
    public Integer getGb() {
        return gb;
    }

    public void setDqr(Integer dqr) {
        this.dqr = dqr== null ? 0 : dqr;
    }
    public Integer getDqr() {
        return dqr;
    }

    public void setYc(Integer yc) {
        this.yc = yc== null ? 0 : yc;
    }
    public Integer getYc() {
        return yc;
    }

    public void setDk(Integer dk) {
        this.dk = dk== null ? 0 : dk;
    }
    public Integer getDk() {
        return dk;
    }

    public void setJj(Integer jj) {
        this.jj = jj== null ? 0 : jj;
    }
    public Integer getJj() {
        return jj;
    }

    public void setZh(Integer zh) {
        this.zh = zh== null ? 0 : zh;
    }
    public Integer getZh() {
        return zh;
    }


}
