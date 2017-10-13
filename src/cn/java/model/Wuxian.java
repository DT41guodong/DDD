package cn.java.model;

import java.io.Serializable;

public class Wuxian implements Serializable {
    private Integer id;

    private String name;

    private Integer parentid;

    private Integer level;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Wuxian [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
                + (parentid != null ? "parentid=" + parentid + ", " : "") + (level != null ? "level=" + level : "")
                + "]";
    }

    public Wuxian(Integer id, String name, Integer parentid, Integer level) {
        super();
        this.id = id;
        this.name = name;
        this.parentid = parentid;
        this.level = level;
    }

    public Wuxian() {
        super();
    }

}