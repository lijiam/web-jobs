package com.wuzhi.index.bean;

public class PushMsg {

    private String id;
    private String push_name;
    private String rcuser_id;
    private String rcuser_name;
    private String qyuser_id;
    private String qyuser_name;
    private String push_time;
    private String push_type;
    private String push_typename;
    private String push_times;

    public String getPush_times() {
        return push_times;
    }

    public void setPush_times(String push_times) {
        this.push_times = push_times;
    }

    public String getPush_typename() {
        return push_typename;
    }

    public void setPush_typename(String push_typename) {
        this.push_typename = push_typename;
    }

    public String getRcuser_name() {
        return rcuser_name;
    }

    public void setRcuser_name(String rcuser_name) {
        this.rcuser_name = rcuser_name;
    }

    public String getQyuser_name() {
        return qyuser_name;
    }

    public void setQyuser_name(String qyuser_name) {
        this.qyuser_name = qyuser_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPush_name() {
        return push_name;
    }

    public void setPush_name(String push_name) {
        this.push_name = push_name;
    }

    public String getRcuser_id() {
        return rcuser_id;
    }

    public void setRcuser_id(String rcuser_id) {
        this.rcuser_id = rcuser_id;
    }

    public String getQyuser_id() {
        return qyuser_id;
    }

    public void setQyuser_id(String qyuser_id) {
        this.qyuser_id = qyuser_id;
    }

    public String getPush_time() {
        return push_time;
    }

    public void setPush_time(String push_time) {
        this.push_time = push_time;
    }

    public String getPush_type() {
        return push_type;
    }

    public void setPush_type(String push_type) {
        this.push_type = push_type;
    }
}
