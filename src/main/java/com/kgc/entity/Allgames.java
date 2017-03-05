package com.kgc.entity;


/**
 * Created by  王帆 on 2017/3/4.
 */
public class Allgames {
    private int id;
    private String cname;
    private String initial;
    private String isHot;
    private String type;
    private String onOff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOnOff() {
        return onOff;
    }

    public void setOnOff(String onOff) {
        this.onOff = onOff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Allgames allgames = (Allgames) o;

        if (id != allgames.id) return false;
        if (cname != null ? !cname.equals(allgames.cname) : allgames.cname != null) return false;
        if (initial != null ? !initial.equals(allgames.initial) : allgames.initial != null) return false;
        if (isHot != null ? !isHot.equals(allgames.isHot) : allgames.isHot != null) return false;
        if (type != null ? !type.equals(allgames.type) : allgames.type != null) return false;
        if (onOff != null ? !onOff.equals(allgames.onOff) : allgames.onOff != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        result = 31 * result + (initial != null ? initial.hashCode() : 0);
        result = 31 * result + (isHot != null ? isHot.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (onOff != null ? onOff.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Allgames{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", initial='" + initial + '\'' +
                ", isHot='" + isHot + '\'' +
                ", type='" + type + '\'' +
                ", onOff='" + onOff + '\'' +
                '}';
    }
}
