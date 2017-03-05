package com.kgc.entity;

/**
 * Created by  王帆 on 2017/3/4.
 */
public class Allqu {
    private int qid;
    private String name;
    private Integer gid;

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Allqu allqu = (Allqu) o;

        if (qid != allqu.qid) return false;
        if (name != null ? !name.equals(allqu.name) : allqu.name != null) return false;
        if (gid != null ? !gid.equals(allqu.gid) : allqu.gid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gid != null ? gid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Allqu{" +
                "qid=" + qid +
                ", name='" + name + '\'' +
                ", gid=" + gid +
                '}';
    }
}
