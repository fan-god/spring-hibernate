package com.kgc.entity;

/**
 *
 * Created by 陈心航 on 2017/3/6.
 * ssss
 */
public class Card {
    private int id;
    private String pic;
    private String pname;
    private String price;
    private String strtus;

    public Card() {
    }

    public Card(int id, String pic, String pname, String price, String strtus) {
        this.id = id;
        this.pic = pic;
        this.pname = pname;
        this.price = price;
        this.strtus = strtus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStrtus() {
        return strtus;
    }

    public void setStrtus(String strtus) {
        this.strtus = strtus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (id != card.id) return false;
        if (pic != null ? !pic.equals(card.pic) : card.pic != null) return false;
        if (pname != null ? !pname.equals(card.pname) : card.pname != null) return false;
        if (price != null ? !price.equals(card.price) : card.price != null) return false;
        if (strtus != null ? !strtus.equals(card.strtus) : card.strtus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (strtus != null ? strtus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", pic='" + pic + '\'' +
                ", pname='" + pname + '\'' +
                ", price='" + price + '\'' +
                ", strtus='" + strtus + '\'' +
                '}';
    }
}
