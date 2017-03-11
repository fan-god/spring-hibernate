package com.kgc.entity;

/**
 * Created by  王帆 on 2017/3/6.
 */
public class Allserver {
    private int sid;
    private String name;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Allserver allserver = (Allserver) o;

        if (sid != allserver.sid) return false;
        if (name != null ? !name.equals(allserver.name) : allserver.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
