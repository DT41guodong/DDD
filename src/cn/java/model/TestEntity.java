/**
 * Project Name:dt41_root
 * File Name:TestEntity.java
 * Package Name:cn.java.model
 * Date:2017年10月11日下午10:58:36
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.model;

import java.io.Serializable;

/**
 * Description: <br/>
 * Date: 2017年10月11日 下午10:58:36 <br/>
 * 
 * @author guoD
 * @version
 * @see
 */
public class TestEntity implements Serializable {
    private int id;

    private String name;

    // 父类id
    private int parentId;

    private int level;

    public TestEntity(int id, String name, int parentId, int level) {
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "TestEntity [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "parentId=" + parentId
                + ", level=" + level + "]";
    }

    public TestEntity() {
        super();
    }

}
