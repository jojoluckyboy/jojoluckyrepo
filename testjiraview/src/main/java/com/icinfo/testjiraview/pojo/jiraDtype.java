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
public class jiraDtype {
    private String project;
    private Integer qt = 0;
    private Integer dj = 0;
    private Integer gj= 0;
    private Integer xqbf = 0;
    private Integer zh = 0;
    private Integer cf = 0;
    private String months;
    private String dname;
    private Integer pnum = 0;
    private Integer xj = 0;
    private Integer gb = 0;
    private Integer dqr= 0;

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }
    public String getProject() {
        return project;
    }


    public void setQt(Integer qt) {
        this.qt = qt== null ? 0 : qt;
    }
    public Integer getQt() {
        return qt;
    }

    public void setDj(Integer dj) {
        this.dj = dj== null ? 0 : dj;
    }
    public Integer getDj() {
        return dj;
    }

    public void setGj(Integer gj) {
        this.gj = gj== null ? 0 : gj;
    }
    public Integer getGj() {
        return gj;
    }

    public void setXqbf(Integer xqbf) {
        this.xqbf = xqbf== null ? 0 : xqbf;
    }
    public Integer getXqbf() {
        return xqbf;
    }

    public void setZh(Integer zh) {
        this.zh = zh== null ? 0 : zh;
    }
    public Integer getZh() {
        return zh;
    }

    public void setCf(Integer cf) {
        this.cf = cf== null ? 0 : cf;
    }
    public Integer getCf() {
        return cf;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum== null ? 0 : pnum;
    }
    public Integer getPnum() {
        return pnum;
    }

    public void setMonths(String months) {
        this.months = months == null ? null : months.trim();
    }
    public String getMonths() {
        return months;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
    public String getDname() {
        return dname;
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


}
