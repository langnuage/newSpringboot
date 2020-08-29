package com.lagnuage.yz.entity;

public class hero {
    private Integer id;

    private String hname;

    private Integer hp;

    private Integer damage;

    public hero(Integer id, String hname, Integer hp, Integer damage) {
        this.id = id;
        this.hname = hname;
        this.hp = hp;
        this.damage = damage;
    }

    public hero() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "hero{" +
                "id=" + id +
                ", hname='" + hname + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}