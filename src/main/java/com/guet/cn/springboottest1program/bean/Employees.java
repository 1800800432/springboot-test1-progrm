package com.guet.cn.springboottest1program.bean;


import java.sql.Date;

public class Employees {
    private Integer id;
    private String name;
    private String sex;
    private String phone;
    private String lv;
    private Date entrytime;
    private Integer perobj;
    private String jobstatus;
    private String department;
    private String lable;
    private Integer ordernum;
    private String workstatus;
    private String open_ports;
    private String tuijian_status;

    public Employees() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Integer getPerobj() {
        return perobj;
    }

    public void setPerobj(Integer perobj) {
        this.perobj = perobj;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    public String getOpen_ports() {
        return open_ports;
    }

    public void setOpen_ports(String open_ports) {
        this.open_ports = open_ports;
    }

    public String getTuijian_status() {
        return tuijian_status;
    }

    public void setTuijian_status(String tuijian_status) {
        this.tuijian_status = tuijian_status;
    }
}
